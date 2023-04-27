package ai.view;

import ai.controller.Controller;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SpringLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel
{
	private Controller app;
	private SpringLayout layout;
	private JPanel buttonPanel;
	private JButton startButton;
	private JButton loadButton;
	private JButton instructButton;
	private AIFrame frame;
	
	public MenuPanel(Controller app)
	{
		super();
		this.app = app;
		this.buttonPanel = new JPanel();
		this.startButton = new JButton("Start New");
		this.loadButton = new JButton("Load Game");
		this.instructButton = new JButton("Instructions");
		this.layout = new SpringLayout();
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(layout);
		this.add(buttonPanel);
		buttonPanel.add(startButton);
		buttonPanel.add(loadButton);
		buttonPanel.add(instructButton);
	}
	
	private void setupListeners()
	{
		// TODO Allow view changes
		
		startButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent click) 
				{
					app.changeScreen("game");	
				}
				
				}
				);
		
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, buttonPanel, 250, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, buttonPanel, 450, SpringLayout.WEST, this);
	}
}
