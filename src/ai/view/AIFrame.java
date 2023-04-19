package ai.view;

import ai.controller.Controller;
import javax.swing.JFrame;

public class AIFrame extends JFrame
{
	
	private Controller app;
	private MenuPanel menu;
	private GamePanel game;
	
	public AIFrame(Controller app)
	{
		super();
		this.app = app;
		this.menu = new MenuPanel(this.app);
		this.game = new GamePanel(this.app);
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setTitle("Placeholder Text");
		this.setSize(1280, 720);
		this.setResizable(false);
		
		this.setContentPane(menu);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	
}
