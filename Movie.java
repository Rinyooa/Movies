package movies;

public class Movie {
	//instance variables with appropriate data type
	private String movieTitle;
	private double budget, boxOffice;
	private Director director; //director object with director type that was already created from Director class
	
	//constructor that takes no parameters with instance variables initialized
	public Movie()
	{	
		movieTitle = "";
		budget = 0.0;
		boxOffice = 0.0;
	}
	
	//constructor that takes only director type and string type
	public Movie(Director x, String y)
	{	
		director = x;
		movieTitle = y;
	}
	
	//constructor that takes various data types in a specific order
	public Movie(String x, Director y, double z, double i)
	{
		movieTitle = x;
		director = y;
		budget = z;
		boxOffice = i;
	}
	
	//accessors for instance variables and for the director object
	public String getMovieTitle()
	{
		return movieTitle;
	}
	
	public Director getDirector()
	{
		return director;
	}
	
	public double getBudget()
	{
		return budget;
	}
	
	public double getBoxOffice()
	{
		return boxOffice;
	}
	
	//mutators for instance variable and for the director object
	public void setMovieTitle(String x) 
	{
		movieTitle = x;
	}
	
	public void setDirector(Director y) 
	{
		director = y;
	}
	
	public void setBudget(double z) 
	{
		budget = z;
	}
	
	public void setBoxOffice(double i) 
	{
		boxOffice = i;
	}
	
	
	//isProfitable that accepts specific double parameters for price comparison
	public boolean isProfitable(double budget, double boxOffice) 
	{
		if (budget<boxOffice)
		{	System.out.println(movieTitle + " is profitable.");
			return true;
		}
		else 
		{
			System.out.println(movieTitle + " lost money.");
			return false;
		}
			
	}
	
	//toString method
	public String toString()
	{
		return "Movie Title: " + movieTitle +
				"\nDirector: " + director +
				"\nBudget (millions): " + budget +
				"\nBox Office (millions): " + boxOffice ;
	}
}

