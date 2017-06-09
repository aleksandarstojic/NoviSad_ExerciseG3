import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID: IT52-2015

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException {
		if(frames.size() < 10)
			frames.add(frame);
		else
			throw new BowlingException("Frame limit exceeded.");
	}
	
	// returns the score of the frame at the specified index
	public int getFramesScore(int index)
	{
		return frames.get(index).score();
	}
	
	// returns the frame at the specified index
	public Frame getFrame(int index)
	{
		
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		
		int score = 0;
		
		for(Frame f : frames)
		{
			score += f.score();
		}
		
		return score;
	}
}
