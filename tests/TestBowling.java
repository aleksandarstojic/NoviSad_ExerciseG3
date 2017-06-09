import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test(expected=BowlingException.class)
	public void AddingTheFrameTest() throws BowlingException {
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame();	
		addFrames(bowlingGame, frame, 15);
	}
	
	@Test
	public void TestIfScoreIsCorrect() {
		Frame frame = new Frame();
		int actual = frame.score();
		int expected = 8;
	}
	
	
	
	
	
	
	
	
	
	
	/// HELPER METHODS ///
	
	public void addFrames(BowlingGame bowlingGame, Frame frame, int count) throws BowlingException
	{
		for (int i=0; i<count; i++)
		{
			bowlingGame.addFrame(frame);
		}
	}
}
