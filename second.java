/** Java program to find the second smallest element in an array @K Vivek-13 */
import java.util.Scanner;

class Second{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Java program to find the second smallest element in an array\n@K Vivek-13");

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE)
            System.out.println("There is no second smallest element (all elements are equal).");
        else
            System.out.println("Second smallest element is: " + secondSmallest);

        sc.close();
    }
}
