// Program to calculate factorial using recursion
package BuiltInFunction;
import java.util.Scanner;

public class FactorialRecursion {

    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1)  // Base case
            return 1;
        return n * factorial(n - 1);  // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read input

        long result = factorial(num); // Calculate factorial
        System.out.println("Factorial of " + num + " is: " + result); // Display result

        sc.close(); // Close scanner
    }
}
