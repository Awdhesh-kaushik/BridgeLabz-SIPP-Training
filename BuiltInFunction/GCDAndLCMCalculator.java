// Program to calculate GCD and LCM using separate functions
package BuiltInFunction;
import java.util.Scanner;

public class GCDAndLCMCalculator {

    // Function to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;      // Store b temporarily
            b = a % b;         // Update b to remainder
            a = temp;          // Set a to old b
        }
        return a;
    }

    // Function to calculate LCM using GCD
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b); // LCM formula
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Display results
        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));

        sc.close(); // Close scanner
    }
}
