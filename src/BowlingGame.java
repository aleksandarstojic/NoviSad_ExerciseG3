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
		return frames.get(index);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		if (frames.get(frames.size()-1).isSpare() || frames.get(frames.size()-1).isStrike())
			bonus = new Frame();
	}
	
	// Returns the game score
	public int score(){
		
		int score = 0;
		
		///// NISAM STIGAO DA REALIZUJEM SABIRANJE SA BONUSIMA
		/*
		for(int i = 0; i < frames.size(); i++)
		{
			score += frames.get(i).score();
			
			// Bonus for the strike
			if(frames.get(i).isStrike() && i <= 7)
				score = score + frames.get(i+1).score() + frames.get(i+2).score();
			else if (frames.get(i).isStrike() && i == 8)
				score = score + frames.get(i+1).score();
			
			// Bonus for the spare
			if(frames.get(i).isSpare() && i <= 8)
				score = score + frames.get(i).getFirstThrow();
		}
		*/
		///// NISAM STIGAO DA REALIZUJEM SABIRANJE SA BONUSIMA
		
		for(Frame f : frames)
		{
			score += f.score();
		}
		
		return score;
	}
}
