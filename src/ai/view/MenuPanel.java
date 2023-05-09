package ai.view;

import ai.controller.Controller;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

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
	private JLabel title;
	private ImageIcon titleImg;
	
	public MenuPanel(Controller app)
	{
		super();
		this.app = app;
		this.buttonPanel = new JPanel();
		this.startButton = new JButton("Start New");
		this.loadButton = new JButton("Load Game");
		this.instructButton = new JButton("Instructions");
		this.layout = new SpringLayout();
		this.title = new JLabel("");
		
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(layout);
		this.add(buttonPanel);
		try
		{
			titleImg = new ImageIcon(getClass().getResource("/photos/titleone.png"));
			title.setIcon(titleImg);
			title.setText("");
		}
		catch (NullPointerException missingFile)
		{
			this.title = new JLabel("Not found lol");
			
		}
		this.add(title);
		buttonPanel.add(startButton);
	}
	
	private void setupListeners()
	{
		
		startButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent click) 
				{
					app.play();	
				}
				
				}
				);
		
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, buttonPanel, 250, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, buttonPanel, 450, SpringLayout.WEST, this);
		
		layout.putConstraint(SpringLayout.WEST, title, 450, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, title, 100, SpringLayout.NORTH, this);
	}
}
