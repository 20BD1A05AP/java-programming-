import java.util.Scanner;

public class Fib {

    public static int fibonacci(int count) {
        if (count <= 1)
            return count;

        return fibonacci(count - 1) + fibonacci(count - 2);
    }

    public static void printFibonacciSequence(int seqLength) {
        System.out.print("A Fibonacci sequence of " + seqLength + " numbers: ");
        for (int i = 0; i < seqLength; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();  // Add a newline for better output formatting
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt for user input
        System.out.print("Enter the number of Fibonacci sequence elements: ");
        int n = sc.nextInt();

        // Validate input (optional)
        if (n < 0) {
            System.out.println("Please enter a non-negative number.");
            return;
        }

        // Call the method to print the Fibonacci sequence
        printFibonacciSequence(n);

        // Close the Scanner
        sc.close();
    }
}
