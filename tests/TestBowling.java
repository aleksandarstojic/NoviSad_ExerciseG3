import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	/// FRAME TESTS ///
	@Test
	public void TestIfScoreIsCorrect() {
		Frame frame = new Frame(3,5);
		int actual = frame.score();
		int expected = 8; // score 3 in first throw + 5 in second
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
		int expected = 20; // 10 frames, 3 points each
		assertEquals(actual, expected);
	}
	
	@Test
	public void TestIfTheFramesScoreIsReturnedProperly() throws BowlingException {
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame(0,2);	
		addFrames(bowlingGame, frame, 8);
		Frame frame1 = new Frame (10,0);
		bowlingGame.addFrame(frame1);
		int actual = bowlingGame.getFrame(8);
		int expected = 10; // because I want the last frame's score and it should be 10 because I've instantiated it with score 10
		assertEquals(actual, expected);
	}
	
	/*@Test
	public void TestIfThereIsABonusThrow() throws BowlingException {
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame(0,2);	
		addFrames(bowlingGame, frame, 10);
		bowlingGame.
	}*/
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
