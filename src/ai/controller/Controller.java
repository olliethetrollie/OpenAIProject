package ai.controller;

import ai.view.AIFrame;
import ai.model.*;

public class Controller 
{
	
	private AIFrame window;
	private MainStory mainPath;
	
	public Controller()
	{
		this.window = new AIFrame(this);
		this.mainPath = new MainStory();
	}
	
	public void start()
	{
		
	}
	
	/**
	 * Takes the progress number from game panel and passes it to the model to retrieve
	 * next piece of dialogue.
	 * @author aorr6593
	 */
	public String progression(int progNum)
	{
		if (progNum < 10)
		{
			return mainPath.dialogue(progNum);
		}
		else
		{
			return "error";
		}
	}

}
