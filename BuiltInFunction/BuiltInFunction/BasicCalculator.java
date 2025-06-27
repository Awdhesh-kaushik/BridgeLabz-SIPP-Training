// Program to perform basic arithmetic operations using modular functions
package BuiltInFunction;
import java.util.Scanner; // Importing Scanner class for user input

public class BasicCalculator {

    // Function to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Function to subtract second number from the first
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Function to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Function to divide first number by second
    public static double divide(int a, int b) {
        if (b == 0) {
            // Handle division by zero error
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return (double) a / b;
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object to read input

        // Asking user to enter two numbers
        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        // Asking user to choose an operation
        System.out.println("Choose operation: + - * /");
        char op = sc.next().charAt(0); // Reading the operation character

        // Performing operation based on user choice
        switch (op) {
            case '+':
                System.out.println("Result: " + add(a, b));
                break;
            case '-':
                System.out.println("Result: " + subtract(a, b));
                break;
            case '*':
                System.out.println("Result: " + multiply(a, b));
                break;
            case '/':
                System.out.println("Result: " + divide(a, b));
                break;
            default:
                // If user enters an invalid operator
                System.out.println("Invalid operation. Please choose +, -, *, or /.");
        }

        sc.close(); // Closing Scanner object
    }
}
