package ai.view;

import ai.controller.Controller;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SpringLayout;
import javax.swing.ImageIcon;

public class GamePanel extends JPanel
{
	private Controller app;
	private SpringLayout layout;
	private JPanel dialogue;
	
	public GamePanel(Controller app)
	{
		super();
		this.app = app;
		this.layout = new SpringLayout();
		this.dialogue = new JPanel();
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.black);
		this.setLayout(layout);
		this.add(dialogue);
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, dialogue, 600, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, dialogue, 10, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, dialogue, 10, SpringLayout.EAST, this);
	}
	
	private void updateDisplay()
	{
		
	}
}
