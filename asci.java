/* Java program to find the ASCII value of a character @K Vivek-13 */
import java.util.Scanner;

class Asci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Java program to find the ASCII value of a character\n@K Vivek-13");
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int ascii = (int) ch;

        System.out.println("The ASCII value of '" + ch + "' is: " + ascii);

        sc.close();
    }
}
