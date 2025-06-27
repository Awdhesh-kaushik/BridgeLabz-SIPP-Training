package JavaStringHandling;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = ""; // To store the string without duplicates

        // Traverse each character in the input string
        for (int i = 0; i < input.length(); i++) {
            // Check if the character is not already in the result string
            if (result.indexOf(input.charAt(i)) == -1) {
                result += input.charAt(i); // Append unique character
            }
        }

        // Print the result string without duplicates
        System.out.println("String without duplicates: " + result);
    }
}
