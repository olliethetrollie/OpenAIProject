package ai.controller;

import ai.view.AIFrame;
import ai.model.*;

public class Controller 
{
	
	private AIFrame window;
	private MainStory mainPath;
	private PathOne pathB;
	private PathTwo pathC;
	
	public Controller()
	{
		this.window = new AIFrame(this);
		this.mainPath = new MainStory();
		this.pathB = new PathOne();
		this.pathC = new PathTwo();
	}
	
	public void start()
	{
		
	}
	
	public String progression(String progNum)
	{
		if (progNum.contains("A"))
		{
			return mainPath.dialogue(progNum);
		}
		else if (progNum.contains("B"))
		{
			return pathB.dialogue(progNum);
		}
		else if (progNum.contains("C"))
		{
			return pathC.dialogue(progNum);
		}
		else
		{
			return "error";
		}
	}

}
