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
		window.replaceScreen("MENU");
	}
	
	public void play()
	{
		window.replaceScreen("GAME");
	}
	
	public Object getFrame()
	{
		return window;
	}
	
	/**
	 * {@link ai.controller.Controller.progression} takes the progress number 
	 * from game panel and passes it to the model to retrieve the next piece of dialogue.
	 * @author aorr6593
	 */
	public String progression(int progNum)
	{
		if (progNum < 13)
		{
			return mainPath.dialogue(progNum);
		}
		else
		{
			return "Game End :)";
		}
	}
	
	public void changeScreen(String value)
	{
		window.replaceScreen(value);
	}

}
