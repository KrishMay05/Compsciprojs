package apcompscihomework;

import java.lang.Math;
import java.util.Scanner; 
/*
 * Krish Patel 
 * 10/03/2020
 * Purpose: To avoid the IRS and calculate taxes, work on using math and scanner in Java
 */
public class BigProj3
{

	public static void main(String[] args) 
	{
		Scanner taxes = new Scanner(System.in); 
		final int HoursW; 
		final Double HourR; 
		final Double TotalPay;
		final Double FedTax;
		final Double SS;
		final Double ST;
		final Double LT;
		final Double NetPay;
		System.out.print("Enter the number of hours worked this week: ");
		HoursW = taxes.nextInt(); 
		System.out.println();
		System.out.print("Enter the hourly rate: ");
		HourR = taxes.nextDouble(); 
		System.out.println(); 
		TotalPay = HoursW*HourR;
		FedTax = TotalPay*.18; 
		SS = TotalPay*.08;
		ST = TotalPay*.032;
		LT = TotalPay*.02;
		NetPay = TotalPay - (FedTax+SS+ST+LT); 
		System.out.println("Hours worked:            \t\t"+HoursW);
		System.out.printf("Hourly rate:              \t\t$%.2f \n",HourR);
		System.out.println();
		System.out.println();
		System.out.printf("Gross Pay:                \t\t$%.2f\n",TotalPay);
		System.out.printf("Fedral tax (18%%):        \t\t$%.2f\n",FedTax);
		System.out.printf("Social security tax (8%%):\t\t$%.2f\n",SS);
		System.out.printf("State tax ( 3.2%%):       \t\t$%.2f\n",ST);
		System.out.printf("Local tax (2%%):          \t\t$%.2f\n",LT);
		System.out.println();
		System.out.println();
		System.out.printf("Net pay                   \t\t$%.2f\n",NetPay);
		taxes.close();
		
		
		

	}

}
