package ai.model;

public class MainStory 
{
	private String progNum;
	
	public MainStory()
	{
		this.progNum = new String("");
	}
	
	
	
	public String dialogue(int progNum)
	{
		if (progNum == 1)
		{
			return oneD();
		}
		else if (progNum == 2)
		{
			return twoD();
		}
		else if (progNum == 3)
		{
			return threeD();
		}
		else if (progNum == 4)
		{
			return fourD();
		}
		else if (progNum == 5)
		{
			return fiveD();
		}
		else
		{
			return "error";
		}
	}
	
	private String oneD()
	{
		String dialogue = "While walking through a park one day, you saw a dog and a cat playing together.";
		return dialogue;
	}
	
	private String twoD()
	{
		String dialogue = "With a small smile on your fave, you curiously walked over to the two animals. That's when you heard the cat say...";
		return dialogue;
	}
	
	private String threeD()
	{
		String dialogue = "Cat: NAH, SHUT UP, you're wrong, just simply incorrect.";
		return dialogue;
	}
	
	private String fourD()
	{
		String dialogue = "Dog: No, I'm not! I saw it with my own two eyes! A human bit a bird and it was marshmallow inside! On god!";
		return dialogue;
	}
	
	private String fiveD()
	{
		String dialogue = "Cat: You're making stuff up. Either that, or you're actually losing it.";
		return dialogue;
	}
}
