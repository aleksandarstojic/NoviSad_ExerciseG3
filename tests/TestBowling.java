import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void AddingTheFrameTest() {
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame();
		
		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame);
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
