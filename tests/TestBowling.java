import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	/// FRAME TESTS ///
	@Test
	public void TestIfScoreIsCorrect() {
		Frame frame = new Frame(3,5);
		int actual = frame.score();
		int expected = 8; 	// score 3 in first throw + 5 in second
		assertEquals(actual, expected);
	}
	
	@Test
	public void TestIfItIsASpare() {
		Frame frame = new Frame(9,1);
		boolean check = frame.isSpare();
		assertTrue(check);
	}
	
	@Test
	public void TestIfItIsAStrike() {
		Frame frame = new Frame(10,0);
		boolean check = frame.isStrike();
		assertTrue(check);
	}
	/// FRAME TESTS ///
	
	
	
	/// BOWLING GAME TESTS ///
	@Test(expected=BowlingException.class)
	public void AddingTheFrameTest() throws BowlingException {
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame();	
		addFrames(bowlingGame, frame, 15);
	}
	
	@Test
	public void TestIfTheScoreIsCalculatedCorrectly() throws BowlingException {
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame(0,2);	
		addFrames(bowlingGame, frame, 10);
		int actual = bowlingGame.score();
		int expected = 20; 		// 10 frames, 2 points each (newbie(
		assertEquals(actual, expected);
	}
	
	@Test
	public void TestIfTheFramesScoreIsReturnedProperly() throws BowlingException {
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame(0,2);	
		addFrames(bowlingGame, frame, 9);
		Frame frame1 = new Frame (10,0);
		bowlingGame.addFrame(frame1);
		int actual = bowlingGame.getFramesScore(9);
		int expected = 10; 		// because I want the last frame's score and it should be 10 because I've instantiated it with score 10
		assertEquals(actual, expected);
	}
	
	@Test
	public void TestIfTheFrameIsReturnedProperly() throws BowlingException {
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame(0,2);	
		addFrames(bowlingGame, frame, 9);
		Frame frame1 = new Frame (5,5);
		bowlingGame.addFrame(frame1);
		Frame testFrame = bowlingGame.getFrame(9);  // Returning the last frame in the game and storing it into a Frame variable
		int actual = testFrame.score();				// Using the frame's score function to determine whether the frame is returned correctly
		int expected = 10;							// i.e. the two scores are the same (in this case (test) it should be 10 (because the frame was instatiated
		assertEquals(actual, expected);				// with (5,5)
	}
	
	@Test
	public void TestIfThereIsABonusThrow_Spare() throws BowlingException {
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame(0,2);	
		addFrames(bowlingGame, frame, 9);
		Frame frame1 = new Frame(6,4);
		bowlingGame.addFrame(frame1);
		boolean check = bowlingGame.getFrame(9).isSpare();	// This should be true because we have instantiated the last frame with the (6,4) score
		assertTrue(check);									// which is a Spare
	}
	
	@Test
	public void TestIfThereIsABonusThrow_Strike() throws BowlingException {
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame(0,2);	
		addFrames(bowlingGame, frame, 9);
		Frame frame1 = new Frame(10, 0);
		bowlingGame.addFrame(frame1);
		boolean check = bowlingGame.getFrame(9).isStrike(); // This should be true because we have instatiated the las frame with the (10,0) score
		assertTrue(check);									// which is a Strike
	}
	/// BOWLING GAME TESTS ///
	
	
	
	
	
	
	
	
	
	/// HELPER METHODS ///
	
	public void addFrames(BowlingGame bowlingGame, Frame frame, int count) throws BowlingException
	{
		for (int i=0; i<count; i++)
		{
			bowlingGame.addFrame(frame);
		}
	}
}
