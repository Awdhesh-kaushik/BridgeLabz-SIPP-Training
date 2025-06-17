//Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check
// if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less

import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Take input for 5 numbers
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

      
        System.out.println("\nNumber Analysis:");
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even.");
                } else {
                    System.out.println(num + " is Positive and Odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative.");
            } else {
                System.out.println(num + " is Zero.");
            }
        }

        // Compare first and last elements
        System.out.println("\nComparing First and Last Elements:");
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("First and Last elements are Equal.");
        } else if (first > last) {
            System.out.println("First element is Greater than the Last element.");
        } else {
            System.out.println("First element is Less than the Last element.");
        }

        scanner.close();
    }
}
