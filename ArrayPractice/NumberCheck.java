package Array;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\nAnalysis of numbers:");
        for (int num : numbers) {
            if (num > 0) {
                System.out.print(num + " is Positive and ");
                if (num % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }
        System.out.println("\nComparison between first and last elements:");
        if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than the last.");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("First element is less than the last.");
        } else {
            System.out.println("First and last elements are equal.");
        }

        scanner.close();
    }
}
