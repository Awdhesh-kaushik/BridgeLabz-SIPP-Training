package JavaStringHandling;
import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the sentence
        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();

        // Prompt user to enter the word to replace
        System.out.print("Enter the word to replace: ");
        String toReplace = sc.next();

        // Prompt user to enter the replacement word
        System.out.print("Enter the replacement word: ");
        String replacement = sc.next();

        String result = ""; // To store the modified sentence

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Loop through each word
        for (String word : words) {
            // Replace if the word matches the one to be replaced
            if (word.equals(toReplace)) {
                result += replacement + " ";
            } else {
                result += word + " ";
            }
        }

        // Print the final result after trimming the trailing space
        System.out.println("Modified Sentence: " + result.trim());
    }
}
