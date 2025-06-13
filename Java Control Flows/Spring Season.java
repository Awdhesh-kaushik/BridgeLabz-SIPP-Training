import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        if (month == 3) {
            if (day >= 20 && day <= 31) {
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
			
        }
		
		else if (month > 3 && month < 6) {
            System.out.println("Its a Spring Season");
			
        }

		else if (month == 6) {
            if (day >= 1 && day <= 20) {
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
			
        }

		else {
            System.out.println("Not a Spring Season");
        }

    }
}
