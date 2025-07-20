/*Grade@Vivek-13*/
import java.util.*;
class grade
	{
		public static void main(String args[])
		{
			Scanner n=new Scanner(System.in);
			System.out.println("Enter your mark");
			int m=n.nextInt();
			if(m >=80)
			{
				System.out.println("A grade/Vivek-13");
			}
			else if(m >=60)
			{
				System.out.println("B grade/Vivek-13");
			}
			else if(m >=40)
			{
				System.out.println("C grade/Vivek-13");
			}
			else
			{
				System.out.println("Failed/Vivek-13");
			}
		}
	}