import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	/// FRAME TESTS ///
	@Test
	public void TestIfScoreIsCorrect() {
		Frame frame = new Frame(3,5);
		int actual = frame.score();
		int expected = 8;
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
	public void TestIfTheScoreIsCalculatedCorrectly()
	{
		
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
