package apcompscihomework;

import java.util.Scanner;

public class BigProj2
{

	public static void main(String[] args)
	{
		Scanner counter= new Scanner(System.in);
		Double purch;
		Double rec; 
		Double due;
		int dollars;
		int quarters;
		int dimes;
		int nickles;
		int pennies;
		System.out.print("Enter purchase price: \t");
		purch = counter.nextDouble(); 
		System.out.println();
		System.out.print("Enter amount recived: \t");
		rec = counter.nextDouble();
		System.out.println();
		due = rec - purch; 
		System.out.println("Change Due:          \t" + due);
		System.out.println();
		System.out.println();
		dollars = (int)(due/1);
		quarters = (int)(((due - dollars)*100)/25);
		dimes = (int)(((due - dollars)*100 - (quarters*25))/10);
		nickles = (int)(((due - dollars)*100 - (quarters*25) - (dimes*10))/5);
		pennies = (int)(((due - dollars )*100 - (quarters*25) - (dimes*10) - (nickles*5))/1);
		System.out.println("Dollars:  \t" + dollars );
		System.out.println("Quarters: \t" + quarters );
		System.out.println("Dimes:    \t" + dimes );
		System.out.println("Nickels:  \t" + nickles);
		System.out.println("Pennies:  \t" + pennies );
		counter.close(); 

	}

}
