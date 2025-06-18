package Array;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int[][] marks = new int[n][3]; 
        double[] percentages = new double[n];
        char[] grades = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                int mark = scanner.nextInt();
                if (mark < 0) {
                    System.out.println("Please enter a positive value.");
                    j--;
                    continue;
                }
                marks[i][j] = mark;
            }
        }        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 75) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 45) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
        System.out.println("\nStudent Results:");
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-8s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10s %-10d %-10d %-10d %-12.2f %-8c\n",
                    "Student" + (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentages[i],
                    grades[i]);
        }

        scanner.close();
    }
}
