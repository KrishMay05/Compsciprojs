package apcompscihomework;

import java.util.Scanner;
/*
 * Krish Patel
 * 09/27/2020
 * Purpose: To calculate if a movie is good of a series of reviews 
 */

class BigProj1 
{

	public static void main(String[] args) 
	{
		Scanner reviews = new Scanner(System.in);
		int web1;
		int web2;
		int web3;
		Double webavg;
		Double focus1;
		Double focus2; 
		Double focusavg; 
		Double critic;
		Double movieavg; 
		
		System.out.print(" Please enter three website ratings: ");
		web1 = reviews.nextInt();
		web2 = reviews.nextInt();
		web3 = reviews.nextInt();
		System.out.println();
		System.out.print("Please enter two ratings from the focus groups: ");
		focus1 = reviews.nextDouble();
		focus2 = reviews.nextDouble();
		System.out.println(); 
		System.out.print("Please enter the average movie critic rating: ");
		critic = reviews.nextDouble();
		System.out.println();
		webavg = (double) (web1+web2+web3)/3; 
		focusavg = (focus1+focus2)/2; 
		movieavg = (webavg*0.2) + (focusavg*0.3) + (critic*0.5);
		System.out.println("Average website rating: " + webavg);
		System.out.println("Average focus group rating: " + focusavg);
		System.out.println("Average movie critic rating: " + critic);
		System.out.println("Overall movie rating: " + movieavg);
		reviews.close();
		

	}

}
