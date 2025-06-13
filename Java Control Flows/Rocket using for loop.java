import java.util.Scanner;

public class CountdownForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to start countdown: ");
        int start = input.nextInt();

        for (int i = start; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Lift off!");

    }
}
