// Program to generate Fibonacci sequence up to given number of terms
package BuiltInFunction;
import java.util.Scanner;

public class FibonacciGenerator {

    // Function to print Fibonacci sequence
    public static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " "); // Print current number
            int next = a + b;          // Calculate next number
            a = b;
            b = next;
        }

        System.out.println(); // Move to next line after sequence
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to take user input

        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt(); // Read number of terms from user

        generateFibonacci(terms); // Call function to generate sequence

        sc.close(); // Close Scanner
    }
}
