import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  marks for 3 subjects
        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths = sc.nextDouble();

        if (physics < 0 || physics > 100 ||
            chemistry < 0 || chemistry > 100 ||
            maths < 0 || maths > 100) {
            System.out.println("Invalid input. Marks must be between 0 and 100.");
            return;
        }

        // Calculate average
        double average = (physics + chemistry + maths) / 3;
        String grade, remarks;

        
        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.println("\n----- Report Card -----");
        System.out.printf("Average Marks: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

    }
}
