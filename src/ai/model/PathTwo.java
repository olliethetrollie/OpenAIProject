package ai.model;

public class PathTwo 
{
	private String progNum;
	
	public PathTwo()
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
