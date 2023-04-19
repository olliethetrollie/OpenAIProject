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
	
	public String progNum;
	
	public GamePanel(Controller app)
	{
		super();
		this.app = app;
		this.layout = new SpringLayout();
		this.dialogue = new JPanel();
		this.progNum = new String("1A");
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.GRAY);
		this.setLayout(layout);
		this.add(dialogue);
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, dialogue, 550, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, dialogue, 40, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, dialogue, -40, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, dialogue, -20, SpringLayout.SOUTH, this);
	}
	
	private void updateDisplay()
	{
		
	}
}
