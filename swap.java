/*Swap two numbers 
@K Vivek-13*/
import java.util.*;
class swap
	{
		public static void main(String args[])
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Swap two numbers-2\n @K Vivek-13");
			System.out.println("Enter the first number : ");
			int a=s.nextInt();
			System.out.println("Enter the Second number : ");
			int b=s.nextInt();
			int c=a;
			a=b;
			b=c;
			System.out.println("Number after Swaping : "+a+"and"+c);
		}
	}