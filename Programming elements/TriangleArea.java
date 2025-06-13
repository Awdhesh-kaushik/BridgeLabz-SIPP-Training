
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input base and height in cm
        System.out.print("Enter base of the triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle in cm: ");
        double height = input.nextDouble();

        // Calculate area in square cm
        double areaCm = 0.5 * base * height;

        // Convert area to square inches
        double areaInches = areaCm / 6.4516;

        // Display results
        System.out.println("\nArea of triangle:");
        System.out.println("In square centimeters: " + areaCm + " cm²");
        System.out.println("In square inches: " + areaInches + " in²");

        input.close();
    }
}
