package Array;
import java.util.Scanner;

public class DataFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        while (!input.matches("\\d+")) {
            System.out.print("Invalid input. Please enter a positive number: ");
            input = scanner.nextLine();
        }
        int[] frequency = new int[10];

        for (int i = 0; i < input.length(); i++) {
            int digit = Character.getNumericValue(input.charAt(i));
            frequency[digit]++;
        }
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}