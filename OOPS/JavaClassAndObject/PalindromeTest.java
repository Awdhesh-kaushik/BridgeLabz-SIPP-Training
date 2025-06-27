package JavaClassAndObject;

// Class to check whether a given string is a palindrome
class PalindromeChecker {
    String text;  // The text to check

    // Method to check if text is a palindrome
    boolean isPalindrome() {
        StringBuilder sb = new StringBuilder(text);
        String reversed = sb.reverse().toString();
        return text.equals(reversed); //  checking for reverse is equal to original
    }

    // Method to display the result
    void display() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome.");
        else
            System.out.println(text + " is not a Palindrome.");
    }
}

public class PalindromeTest {
    public static void main(String[] args) {
        // Creating and initializing PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker();
        checker.text = "Madam";

        // Displaying the result
        checker.display();
    }
}
