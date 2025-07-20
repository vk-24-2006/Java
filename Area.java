/*Write a program to compute the Area of Circle(given radius)
@K Vivek-13*/
import java.util.*;
class Area
	{
		public static void main(String args[])
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Area of the Circle\n @K Vivek-13");
			System.out.println("Enter the Radius: ");
			int r=s.nextInt();
			double a=(3.14)*(r*r);
			System.out.println("Area of given Circle is "+a);
		}
	}