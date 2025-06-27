package JavaStringHandling;

import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase(); // Convert to lowercase

        int[] freq = new int[26]; // To store frequency of a-z
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') { // Check for alphabet characters only
                freq[ch - 'a']++;
            }
        }

        int index = 0; // To store index of most frequent character
        int max = 0;

        // Find the most frequent character's index
        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
                index = i;
            }
        }

        // Convert index back to character
        char mostFrequentChar = (char) (index + 'a');

        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}
