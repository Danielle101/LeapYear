//This program will determine if the year a user inputs is a leap year or not
package leapYearFinder;
import java.util.*;
public class LeapYearFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		String choice = "y";
//welcome message to user explaining the purpose of the program
System.out.println("Welcome to the leap year finder program!\n\nWhen you enter a"
		+ " year the program will tell you if the year was or will be a leap year or"
		+ " not. Let's begin!\n");
while (choice.equalsIgnoreCase("y")) {
	System.out.println("Please enter a year(yyyy):");
	int year = scan.nextInt();
	//determine if the year is a leap year or not
	if (year%4==0 || year%100==0 || year%400==0)
	{
		System.out.println(year + " is a leap year!");
		}
	else
	{
		System.out.println(year+" is not a leap year!");
		}
	//ask the user if they would like to input another year
	System.out.println("Would you like to enter another year? (y/n):");
	
	
}
	}

}
