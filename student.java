/*Write a Java program to store and print a student’s name, age, grade, and fee status using appropriate data types-Vivek_13*/
import java.util.Scanner;
class Student
{
    public static void main(String[] args)
	{
        	Scanner s = new Scanner(System.in);
		System.out.println("@K Vivek-13");
       		System.out.print("Enter student's name: ");
       		String name = s.nextLine();
        	System.out.print("Enter student's age: ");
        	int age = s.nextInt();
        	System.out.print("Enter student's grade : ");
		String grade = s.nextLine();
        	System.out.print("Is the fee paid? (true/false): ");
        	boolean feePaid = s.nextBoolean();
        	System.out.println("Name     : " + name);
        	System.out.println("Age      : " + age);
        	System.out.println("Grade    : " + grade);
        	System.out.println("Fee Paid : " + feePaid);
    	}
}
