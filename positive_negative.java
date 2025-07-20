/*Write a Java program to check whether a number is positive, negative, or zero. @Vivek-13*/
import java.util.*;
class positive_negative
	{
		public static void main(String args[])
		{
			Scanner n=new Scanner(System.in);
			System.out.println("Positive-Negative\n @K Vivek-13");
			System.out.println("Enter a nummber");
			int p=n.nextInt();
			if(p > 0)
			{
				System.out.println("The number is positive/Vivek-13");
			}
			else if(p == 0)
			{
				System.out.println("The number is 0/Vivek-13");
			}
			else
			{
				System.out.println("The number is negative/Vivek-13");
			}
		}
	}