package movies;

public class Director{
	//creating necessary instance variables with appropriate data types
	private String name;
	private int yearsOfDirecting;
	private boolean winner;
	
	//constructor that takes no parameters with instance variables initialized
	public Director()
	{
		name = "";
		yearsOfDirecting = 0;
		winner = false;
	}
	
	//constructor that takes specific parameters 
	public Director(String x, int y, boolean z)
	{
		name = x;
		yearsOfDirecting = y;
		winner = z;
	}
	
	//overloaded constructor that takes only string type
	public Director(String x)
	{
		name = x;
	}
	
	
	//accessors for instance variables
	public String getName() 
	{
		return name;
	}
	
	public int getYearsOfDirecting()
	{
		return yearsOfDirecting;
	}
	
	public boolean getWinner()
	{
		return winner;
	}
	
	//mutators for instance variables
	public void setName(String x)
	{
		name = x;
	}
	
	public void setYearsOfDirecting(int y)
	{
		yearsOfDirecting = y;
	}
	
	public void setWinner(boolean z)
	{
		winner = z;
	}
	
	//toString method
	public String toString()
	{
		return "Director Name: " + name + 
				"\nYears of Directing: " + yearsOfDirecting + 
				"\nOscar Winner: " + winner ;
	}
}
