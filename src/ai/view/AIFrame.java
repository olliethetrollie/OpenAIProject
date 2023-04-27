package ai.view;

import ai.controller.Controller;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;

public class AIFrame extends JFrame
{
	
	private Controller app;
	private MenuPanel menu;
	private GamePanel game;
	private String panelVal;
	private JPanel panelCards;
	
	public AIFrame(Controller app)
	{
		super();
		this.app = app;
		this.menu = new MenuPanel(this.app);
		this.game = new GamePanel(this.app);
		this.panelVal = new String("");
		this.panelCards = new JPanel(new CardLayout());
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setTitle("Placeholder Text");
		this.setSize(1280, 720);
		this.setResizable(false);
		
		// TODO Panel exchange
		
		if (panelVal.equalsIgnoreCase("game"))
		{
			game.setVisible(true);
		}
		else
		{
			menu.setVisible(true);
		}
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	
	public void replaceScreen(String value)
	{
		if (value.equalsIgnoreCase("menu"))
		{
			panelVal = "menu";
		}
		else if (value.equalsIgnoreCase("game"))
		{
			panelVal = "game";
		}
		else
		{
			panelVal = "menu";
		}
	}
	
	public JPanel swapp(String value)
	{
		if (value.equalsIgnoreCase("menu"))
		{
			return menu;
		}
		else if (value.equalsIgnoreCase("game"))
		{
			return game;
		}
		else
		{
			return menu;
		}
	}
}
