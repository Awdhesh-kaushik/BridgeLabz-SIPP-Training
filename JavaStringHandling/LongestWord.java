package JavaStringHandling;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine(); // Reads the full line as input

        // Split the sentence into words using space as the delimiter
        String[] words = sentence.split(" ");

        // Initialize a variable to keep track of the longest word
        String longest = "";

        // Iterate through all the words
        for (String word : words) {
            // Update longest if the current word is longer
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        // Print the longest word found
        System.out.println("Longest word: " + longest);
    }
}
