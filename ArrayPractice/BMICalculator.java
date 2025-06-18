package Array;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();
        double[] heights = new double[n]; 
        double[] weights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter height (in meters): ");
            heights[i] = scanner.nextDouble();
            System.out.print("Enter weight (in kilograms): ");
            weights[i] = scanner.nextDouble();

            bmis[i] = weights[i] / (heights[i] * heights[i]); 
            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        System.out.println("\nResults:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f m    %.2f kg    %.2f     %s\n", heights[i], weights[i], bmis[i], statuses[i]);
        }

        scanner.close();
    }
}