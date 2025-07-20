/* Write a java program to print Fibonacci series up to N terms @K Vivek-13 */
import java.util.Scanner;

class Fibinocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Java program to print Fibonacci series up to N terms\n@K Vivek-13");

        System.out.print("Enter the number of terms (N): ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
