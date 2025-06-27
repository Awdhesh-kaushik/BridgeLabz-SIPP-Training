// Program to check if a string is a palindrome
package BuiltInFunction;
import java.util.Scanner;

public class PalindromeChecker {

    // Function to check whether a string is a palindrome
    public static boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString(); // Reverse the string
        return text.equalsIgnoreCase(reversed); // Compare ignoring case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to read user input

        System.out.print("Enter a string: ");
        String input = sc.nextLine(); // Read the input string

        // Check and display result
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        sc.close(); // Close the scanner
    }
}
