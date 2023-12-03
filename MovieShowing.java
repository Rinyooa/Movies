/**Student Name: First Last
*Date Completed: 10/11/2022
*Project No. and Page No. in the book: Chapter 5 PP2
*Extra Credit: No
*Project Description: This program implements has-a also known as aggregate relationship between two classes, we create various instance variables and classes to run a program capable of 
*creating objects with the parameters that I have set. 
**/

package movies;

public class MovieShowing {
	
	public static void main (String[] args) 
	{
		//creation of director objects
		Director d1 = new Director();
		Director d2 = new Director("Leo Lemons", 20, true);
		Director d3 = new Director("Petey Powder", 50, false);
		
		//display of director objects
		System.out.println("Three Directors have been created. Calling the toString methods");
		System.out.println();
		System.out.println(d1 + "\n\n" + d2 + "\n\n" + d3);
		
		
		System.out.println("Calling the mutator methods on the first Director object");
		//mutator method invoked on director object
		d1.setName("Psy Coocoo");
		d1.setYearsOfDirecting(3);
		d1.setWinner(false);
		
		System.out.println("First Director has been changed by the mutator methods:" +
						"\nNow showing the changed first Director by calling the accessor methods");//prints for tracking program progress
		System.out.println();
		
		//display of mutated results
		System.out.println("First Director's name: " + d1.getName() +
						 "\nFirst Director has been directing for " + d1.getYearsOfDirecting() + " years" +
						 "\nFirst Director has won the Oscar for best Director: " + d1.getWinner());
		
		//creation of movie objects
		Movie m1 = new Movie("House of Flying Dragons",d1, 700.00, 300000.0);
		Movie m2 = new Movie("Train to Busan", d2, 200.0, 5000.0);
		Movie m3 = new Movie("Puss and Boots", d3, 400.0, 120.0);
		
		//display of results of movie objects created
		System.out.println("Three Movies have been created. Calling the toString methods ");
		System.out.println();
		System.out.println(m1 + "\n\n" + m2 +"\n\n" + m3);
		System.out.println();
		
		//comparison of whether a move was profitable or not
		System.out.println("Evaluating if each movie made money\nby calling the isProfitable method of the Movie class:");
		System.out.println();
		m1.isProfitable(m1.getBudget(), m1.getBoxOffice());
		m2.isProfitable(m2.getBudget(), m2.getBoxOffice());
		m3.isProfitable(m3.getBudget(), m3.getBoxOffice());
		
	}
}
