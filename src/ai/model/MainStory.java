package ai.model;

public class MainStory 
{
	private String progNum;
	
	public MainStory()
	{
		this.progNum = new String("");
	}
	
	
	
	public String dialogue(String progNum)
	{
		if (progNum.contains("1"))
		{
			return oneD();
		}
		else
		{
			return "error";
		}
	}
	
	private String oneD()
	{
		String dialogue = "Placeholder";
		return dialogue;
	}
}
