/*Write a program to Calculate Simple Interest(SI=(P*R*T)/100)
@K Vivek-13*/
import java.util.*;
class si
	{
		public static void main(String args[])
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Area of the Circle\n @K Vivek-13");
			System.out.println("Enter the Principal Amount : ");
			double p=s.nextInt();
			System.out.println("Enter the Rate: ");
			double r=s.nextInt();
			System.out.println("Enter the Time Period : ");
			double t=s.nextInt();
			double si=(p*r*t)/100;
			System.out.println("Simple Interest = "+si);
		}
	}