/*Write a java program to find the sum of digits of a number @K Vivek-13 */
import java.util.Scanner;

class Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Java program to find the sum of digits of a number\n@K Vivek-13");

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int original = num;

        while (num != 0) {
            sum += num % 10; 
            num /= 10; 
        }

        System.out.println("Sum of digits of " + original + " is: " + sum);

        sc.close();
    }
}
