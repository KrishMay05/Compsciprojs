package smallprojects;
import java.util.Scanner;
public class projs {

	public static void main(String[] args) {
		Scanner intel = new Scanner(System.in);
		int i1;
		int i2;
		int i3;
		int i4;
		int sum;
		Double mean; 
		System.out.print("Please enter 4 integers: ");
		i1 = intel.nextInt(); 
		System.out.print(" ");
		i2 = intel.nextInt(); 
		System.out.print(" ");
		i3 = intel.nextInt(); 
		System.out.print(" ");
		i4 = intel.nextInt(); 
		System.out.print(" ");
		sum = i1 + i2 + i3 + i4; 
		mean = (double)(sum)/4.0;
		System.out.println();	
		System.out.println("The sum of your integers is "+ sum +".");
		System.out.println("The mean of your integers is "+ mean +".");
		System.out.println();
		
		
		
	
		 // To caclculate the circumfrance and area  of a circle with random radi

		
		Scanner radi = new Scanner(System.in);
		int radius;
		Double circum;
		Double area; 
		System.out.println("What is the radius of the circle?");
		radius = radi.nextInt();
		circum = radius * 3.14 * 2;
		area = radius * radius * 3.14; 
		System.out.println("Circumference: " + circum);
		System.out.println("Area: " + area);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	
		 //Purpose: to truncate any double input
		 
		
		Scanner doub = new Scanner(System.in);
		int fix; 
		System.out.print("Please input a decimal number: ");
		Double prob = doub.nextDouble(); 
		fix = (int)(prob/1);
		System.out.print("Truncated result: " + fix); 
		System.out.println();
		
		 
		

		 // Purpose: to obtain the first 2 decimal places
		 
		
		Scanner deci = new Scanner(System.in);
		System.out.print("Please input a decimal number: "); 
		Double hundred = deci.nextDouble(); 
		int decimal; 	
		decimal = (int) (hundred*100)%100;
		System.out.print("The first two digits after the dicimal point are: " + decimal); 
		System.out.println();
		
		
		// Purpose to convert between Farenheite and Celsius 
		
		
		Scanner far = new Scanner(System.in);
		int infah;
		Double outcels;
		Double incels;
		Double outfah; 
		System.out.print("Please enter a temperature in degrees Fahrenheit: ");
		infah = far.nextInt();
		outcels = (double) ((infah-32)*5/9); 
		System.out.println("The temperature in Celsius is "+ outcels);
		System.out.print("Please enter a temperature in degrees Celsius: ");
		incels = far.nextDouble();
		outfah = (incels*9/5)+32;
		System.out.println("The temperature in Farenheite is "+ outfah);
		System.out.println();
		
		Scanner nums = new Scanner(System.in);
		int bign;
		int s1n;
		int s2n;
		int s3n;
		System.out.println("Please enter a 3 digit positive integer: ");
		bign = nums.nextInt();
		s1n = bign%10;
		s2n = (bign/10)%10;
		s3n = (bign/100)%10;
		System.out.println(s3n);
		System.out.println(s2n);
		System.out.println(s1n);
		System.out.println(s3n + " + " + s2n + " + " + s1n + " = " + (s3n + s2n + s1n));
		
		nums.close();
		far.close(); 
		deci.close(); 
		intel.close();
		radi.close();
		doub.close();

	}

}
