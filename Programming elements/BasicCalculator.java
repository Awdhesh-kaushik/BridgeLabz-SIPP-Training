

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double quotient = (num2 != 0) ? num1 / num2 : Double.NaN; // Avoid divide by zero


        System.out.println("\nResults:");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);

        input.close();
    }
}
