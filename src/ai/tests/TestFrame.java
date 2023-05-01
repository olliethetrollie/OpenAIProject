package ai.tests; //Change!

/**
 * Project imports
 */
import ai.controller.Controller; //Change!
import ai.view.GamePanel; //Change!
import ai.view.MenuPanel;
import ai.view.AIFrame; //Change!
import javax.swing.*;

import java.awt.Component;
/**
 * Reflection imports
 */
import java.lang.reflect.*;
/**
 * Testing imports
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFrame
{
	private Controller testedController; //Change!
	private AIFrame testedFrame; //Change!

	@BeforeEach
	void setUp() throws Exception
	{
		this.testedController = new Controller();
		this.testedFrame = new AIFrame(testedController);
	}

	@AfterEach
	void tearDown() throws Exception
	{
		this.testedController = null;
		this.testedFrame = null;
	}

	@Test
	void testAIFrame()
	{
		assertTrue(testedFrame instanceof JFrame, "... needs to extend JFrame");
		Method [] methods = testedFrame.getClass().getDeclaredMethods();
		assertTrue(methods.length == 1, "You need 1 method in the AIFrame");
		assertTrue(testedFrame.getTitle().length() > 5, "Your title needs at least 6 letters");
		assertTrue(testedFrame.getContentPane() instanceof GamePanel, "Your AIFrame needs to have a GamePanel inside");  //Change!
		assertTrue(testedFrame.getContentPane() instanceof MenuPanel, "Your AIFrame needs to have a MenuPanel inside");
	}

}