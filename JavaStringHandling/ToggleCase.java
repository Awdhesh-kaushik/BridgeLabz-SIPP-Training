package JavaStringHandling;
import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string to toggle case: ");
        String input = sc.nextLine();

        // StringBuilder to build the toggled result
        StringBuilder toggled = new StringBuilder();

        // Iterate through each character of the input string
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                // Convert uppercase to lowercase
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                // Convert lowercase to uppercase
                toggled.append(Character.toUpperCase(ch));
            } else {
                // Leave non-alphabetic characters unchanged
                toggled.append(ch);
            }
        }

        // Output the toggled string
        System.out.println("Toggled string: " + toggled);
    }
}
