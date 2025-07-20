/* Writ a java program to calculate the factorial of a number using a loop @K Vivek-13 */
import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Java program to calculate the factorial of a number using a loop\n@K Vivek-13");

        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact = 1; 
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        }

        sc.close();
    }
}
