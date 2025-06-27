package JavaStringHandling;
import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the main string
        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        // Prompt user to enter the substring to count
        System.out.print("Enter the substring to search: ");
        String sub = sc.nextLine();

        int count = 0;

        // Loop to check for substring matches
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            // Use substring method to extract and compare
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        // Output the count
        System.out.println("Occurrences of \"" + sub + "\": " + count);
    }
}
