package JavaStringHandling;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to check for palindrome: ");
        String str = sc.nextLine();

        boolean isPalindrome = true; // Assume the string is a palindrome initially
        int n = str.length();        // Get the length of the string

        // Loop from start to the middle of the string
        for (int i = 0; i < n / 2; i++) {
            // Compare characters from the start and end
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                isPalindrome = false; // Set flag to false if mismatch found
                break;                // Exit loop early since it's not a palindrome
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
