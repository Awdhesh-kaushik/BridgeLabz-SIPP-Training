//Write a program to take user input for the age of all 10 students in a class and check whether 
//the student can vote depending on his/her age is greater or equal to 18.

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];

        // Taking input from the user
        for (int i = 0; i < ages.length; i++) {
            ages[i] = scanner.nextInt();
        }

        System.out.println("\nVoting Eligibility Results:");

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            if (age < 0) {
                System.out.println("Invalid age entered for student " );
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        scanner.close();
    }
}
