package JavaStringHandling;
import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the original string
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        // Prompt user to enter the character to remove
        System.out.print("Enter the character to remove: ");
        char toRemove = sc.next().charAt(0);  // Reads the first character of input

        // Initialize an empty result string
        String result = "";

        // Iterate through each character of the string
        for (char ch : str.toCharArray()) {
            // Append to result only if it is not the character to be removed
            if (ch != toRemove) {
                result += ch;
            }
        }

        // Display the final result
        System.out.println("Modified String: " + result);
    }
}
