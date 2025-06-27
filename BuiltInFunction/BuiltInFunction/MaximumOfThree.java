// Program to find maximum of three numbers using modular functions
package BuiltInFunction;
import java.util.Scanner;

public class MaximumOfThree {

    // Function to get input from the user
    public static int getInput(Scanner sc, String label) {
        System.out.print("Enter " + label + " number: ");
        return sc.nextInt(); // Read and return user input
    }

    // Function to find the maximum of three numbers
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c)); // Use nested Math.max
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input

        // Get three numbers from the user
        int num1 = getInput(sc, "first");
        int num2 = getInput(sc, "second");
        int num3 = getInput(sc, "third");

        // Find and display the maximum
        int max = findMax(num1, num2, num3);
        System.out.println("Maximum number is: " + max);

        sc.close(); // Close scanner
    }
}
