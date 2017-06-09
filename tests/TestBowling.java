import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test(expected=BowlingException.class)
	public void AddingTheFrameTest() {
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame();	
		addFrames(bowlingGame, frame);
		
	}
	
	
	/// HELPER METHODS ///
	public void addFrames(BowlingGame bowlingGame, Frame frame, int count)
	{
		for (int i=0; i<count; i++)
		{
			bowlingGame.addFrame(frame);
		}
	}
}
