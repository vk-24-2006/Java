/*Write a Java program to demonstrate Bitwise logical operators, left shift and right
shift operators.
 @K Vivek-13 */
import java.util.Scanner;

class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Java program to demonstrate Bitwise operators\n@K Vivek-13");

        System.out.print("Enter first integer (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second integer (b): ");
        int b = sc.nextInt();

        System.out.println("\nBitwise AND (a & b): " + (a & b));
        System.out.println("Bitwise OR (a | b): " + (a | b));
        System.out.println("Bitwise XOR (a ^ b): " + (a ^ b));
        System.out.println("Bitwise Complement (~a): " + (~a));

        System.out.println("\nLeft Shift (a << 1): " + (a << 1));
        System.out.println("Right Shift (a >> 1): " + (a >> 1));

        sc.close();
    }
}
