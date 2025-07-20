/*Write a program to convert Celsius to fahrenheit
@K Vivek-13*/
import java.util.*;
class temp
	{
		public static void main(String args[])
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Area of the Circle\n @K Vivek-13");
			System.out.println("enter the temperature in Celsius : ");
			double c=s.nextInt();
			double f=(c*9/5)+32;
			System.out.println("The temperature in Fahrenheit : "+f);
		}
	}