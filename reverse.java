/*Write a java program to reverse a number @K Vivek-13 */
import java.util.Scanner;

class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Java program to reverse a number\n@K Vivek-13");

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number of " + original + " is: " + reversed);

        sc.close();
    }
}
