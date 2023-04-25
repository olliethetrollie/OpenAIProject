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
