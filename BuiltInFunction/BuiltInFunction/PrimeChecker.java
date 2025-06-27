// Program to check if a number is prime using a separate function
package BuiltInFunction;
import java.util.Scanner;

public class PrimeChecker {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // Numbers less than or equal to 1 are not prime

        // Check divisibility from 2 to square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; // If divisible, not a prime
        }

        return true; // If not divisible by any number, it's a prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read the input number

        // Display result based on prime check
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        sc.close(); // Close the scanner
    }
}
