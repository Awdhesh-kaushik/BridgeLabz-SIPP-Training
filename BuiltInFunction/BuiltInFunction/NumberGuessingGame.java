package BuiltInFunction;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random random = new Random();         // For generating random guesses
        Scanner sc = new Scanner(System.in);  // Scanner to take user input

        System.out.println("Think of a number between 1 and 100 (and enter it secretly for testing):");
        int number = sc.nextInt();

        // Validate input number
        if (number < 1 || number > 100) {
            System.err.println("Invalid number. Please enter a number between 1 and 100.");
            return;
        }

        boolean guessed = false;
        int min = 1, max = 100;

        // Loop until the correct number is guessed
        while (!guessed) {
            int guess = random.nextInt(max - min + 1) + min; // Generate random guess
            System.out.println("Computer guessed: " + guess);

            System.out.println("Give feedback (low / high / correct): ");
            String feedback = sc.next();

            // Adjust guessing range based on feedback
            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Computer guessed correctly!");
                guessed = true;
            } else if (feedback.equalsIgnoreCase("low")) {
                min = guess + 1; // Update minimum possible value
            } else if (feedback.equalsIgnoreCase("high")) {
                max = guess - 1; // Update maximum possible value
            } else {
                System.out.println("Invalid feedback! Please enter: low, high, or correct.");
            }
        }

        System.out.println("Thank you for playing!");
        sc.close(); // Close the scanner
    }
}
