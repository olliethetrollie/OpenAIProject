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
	}
	
	private void setupPanel()
	{
		// TODO Image background
		this.setBackground(Color.GRAY);
		this.add(bgImage);
		this.setLayout(layout);
		this.add(dialogue);
		
		try
		{
			backgroundImg = new ImageIcon(getClass().getResource("/photos/park.png"));
			bgImage.setIcon(backgroundImg);
			bgImage.setText("Stuff");
		}
		catch (NullPointerException missingFile)
		{
			this.bgImage = new JLabel("Not found lol");
			
		}
		
		bgImage.setIcon(backgroundImg);
		dialogue.add(text);
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
		
		
		layout.putConstraint(SpringLayout.NORTH, bgImage, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, bgImage, 10, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, bgImage, -10, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, bgImage, -10, SpringLayout.SOUTH, this);
		
	}
	
	private void updateDisplay()
	{
		
	}
}
