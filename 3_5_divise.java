/*3_5_Divise @Vivek-13*/
import java.util.*;
class Divise
	{
		public static void main(String args[])
		{
			Scanner n=new Scanner(System.in);
			System.out.println("Enter a number");
			int s=n.nextInt();
			if(s%3==0)
			{
				if(s%5==0)
				{
					System.out.println("The number is Divisible by 3 and 5/Vivek-13");
				}
				else
				{
					System.out.println("The number is not divisible by 5/Vivek-13");
				}
			}
			else
			{
				System.out.println("The number is not divisible by 3/Vivek-13");
			}
		}
	}