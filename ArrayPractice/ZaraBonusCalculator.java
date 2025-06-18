package Array;

import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        final int EMP_COUNT = 10;
        double[] salary = new double[EMP_COUNT];
        double[] yearsOfService = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("Enter data for employee " + (i + 1) + ":");
            while (true) {
                System.out.print("  Salary: ");
                if (scanner.hasNextDouble()) {
                    double inputSalary = scanner.nextDouble();
                    if (inputSalary > 0) {
                        salary[i] = inputSalary;
                        break;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("  Invalid salary. Please enter a positive number.");
            }

            while (true) {
                System.out.print("  Years of Service: ");
                if (scanner.hasNextDouble()) {
                    double inputYears = scanner.nextDouble();
                    if (inputYears >= 0) {
                        yearsOfService[i] = inputYears;
                        break;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("  Invalid input. Enter a non-negative number.");
            }
        }
        for (int i = 0; i < EMP_COUNT; i++) {
            double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonus[i] = salary[i] * bonusRate;
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.printf("\nTotal Bonus Payout: ₹%.2f", totalBonus);
        System.out.printf("\nTotal Old Salary: ₹%.2f", totalOldSalary);
        System.out.printf("\nTotal New Salary: ₹%.2f\n", totalNewSalary);

        scanner.close();
    }
}
