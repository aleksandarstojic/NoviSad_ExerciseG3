import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void AddingTheFrameTest() {
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame();
		bowlingGame.addFrame(frame);
	}

}
