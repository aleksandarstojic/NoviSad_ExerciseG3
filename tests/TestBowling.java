import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void AddingTheFrameTest() {
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame();
		addFrames(bowlingGame, frame);
		
	}
	
	
	/// HELPER METHODS ///
	public void addFrames(BowlingGame bowlingGame, Frame frame)
	{
		for (int i=0; i<15; i++)
		{
			bowlingGame.addFrame(frame);
		}
	}
}
