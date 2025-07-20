/* greatest of three @Vivek-13 */
import java.util.*;
class great
	{
		public static void main(String args[])
		{

			Scanner t=new Scanner(System.in);
			System.out.println("Greatest of three\n @K Vivek-13");
			System.out.println("Enter the number");
			int a=t.nextInt();
			int b=t.nextInt();
			int c=t.nextInt();
			if(a>b && a>c)
			{
				System.out.println("a is Greatest/Vivek-13");
			}
			else if(b>a && b>c)
			{
				System.out.println("b is Greatest/Vivek-13");
			}
			else
			{
				System.out.println("c is Greatest/Vivek-13");
			}
		}
	}