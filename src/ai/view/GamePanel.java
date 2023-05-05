package ai.view;

import ai.controller.Controller;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JLabel.*;
import javax.swing.ImageIcon;

public class GamePanel extends JPanel
{
	private Controller app;
	private SpringLayout layout;
	private JPanel dialogue;
	private JLabel text;
	private JLabel bgImage;
	private ImageIcon backgroundImg;
	
	public int progNum;
	
	public GamePanel(Controller app)
	{
		super();
		this.app = app;
		this.layout = new SpringLayout();
		this.dialogue = new JPanel();
		this.progNum = 0;
		this.text = new JLabel("Placeholder");
//		this.backgroundImg = new ImageIcon("/photos/park.png");
		this.bgImage = new JLabel("Image");
		
		
		setupPanel();
		setupListeners();
		setupLayout();
		updateDisplay();
	}
	
	private void setupPanel()
	{
		// TODO Image background
		this.setBackground(Color.GRAY);
		this.add(bgImage);
		this.setLayout(layout);
		this.add(dialogue);
		
		dialogue.add(text);
		bgImage.setIcon(backgroundImg);
		
	}
	
	private void setupListeners()
	{
		/**
		 * Mouse listener passes progression to the controller and replaces JLabel
		 * with new dialogue.
		 * @author aorr6593
		 */
		this.addMouseListener(new MouseListener()
				{
					@Override
					public void mouseClicked(MouseEvent click)
					{
						progNum += 1;
						
						text.setText(app.progression(progNum));
						updateDisplay();
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
				}
		);
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
		if (progNum <= 5 && progNum >= 3)
		{
			try
			{
				backgroundImg = new ImageIcon(getClass().getResource("/photos/SceneOne.png"));
				bgImage.setIcon(backgroundImg);
				bgImage.setText("Stuff");
			}
			catch (NullPointerException missingFile)
			{
				this.bgImage = new JLabel("Not found lol");
				
			}
		}
		else if (progNum == 6)
		{
			try
			{
				backgroundImg = new ImageIcon(getClass().getResource("/photos/SceneTwo.png"));
				bgImage.setIcon(backgroundImg);
				bgImage.setText("Stuff");
			}
			catch (NullPointerException missingFile)
			{
				this.bgImage = new JLabel("Not found lol");
				
			}
		}
		else if (progNum == 7)
		{
			try
			{
				backgroundImg = new ImageIcon(getClass().getResource("/photos/SceneThree.png"));
				bgImage.setIcon(backgroundImg);
				bgImage.setText("Stuff");
			}
			catch (NullPointerException missingFile)
			{
				this.bgImage = new JLabel("Not found lol");
				
			}
		}
		else if (progNum > 7 && progNum < 10)
		{
			try
			{
				backgroundImg = new ImageIcon(getClass().getResource("/photos/SceneFour.png"));
				bgImage.setIcon(backgroundImg);
				bgImage.setText("Stuff");
			}
			catch (NullPointerException missingFile)
			{
				this.bgImage = new JLabel("Not found lol");
				
			}
		}
		else if (progNum >= 10)
		{
			try
			{
				backgroundImg = new ImageIcon(getClass().getResource(""));
				bgImage.setIcon(null);
				bgImage.setText("Stuff");
			}
			catch (NullPointerException missingFile)
			{
				this.bgImage = new JLabel("Not found lol");
				
			}
		}
	}
}
