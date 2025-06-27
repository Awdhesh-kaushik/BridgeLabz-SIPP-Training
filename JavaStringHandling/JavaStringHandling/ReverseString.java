package JavaStringHandling;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        String reversed = ""; // To store the reversed string

        // Loop from the end of the string to the beginning
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Append characters in reverse order
        }

        // Output the reversed string
        System.out.println("Reversed String: " + reversed);
    }
}
