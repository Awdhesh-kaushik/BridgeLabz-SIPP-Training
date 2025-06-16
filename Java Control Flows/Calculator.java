import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        switch (op) {
            case "+" -> System.out.println("Result: " + (first + second));
            case "-" -> System.out.println("Result: " + (first - second));
            case "*" -> System.out.println("Result: " + (first * second));
            case "/" -> {
                if (second == 0) System.out.println("Cannot divide by zero.");
                else System.out.println("Result: " + (first / second));
            }
            default -> System.out.println("Invalid operator.");
        }

        sc.close();
}
