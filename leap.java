/*Write a Java program to check whether a year is a leap year or not.@Vivek-13*/
import java.util.*;
class Leap
	{
		public static void main(String args[])
		{
			Scanner n=new Scanner(System.in);
			System.out.println("Leap year\n @K Vivek-13");
			System.out.println("Enter the year");
			int y=n.nextInt();
			if((y%4==0 && y%100 != 0) || (y%400==0))
			{
				System.out.println("The year is Leap year/Vivek-13");
			}
			else
			{
				System.out.println("The year is not a Leap year/Vivek-13");
			}
		}
	}