package JavaConstructors;
// Circle class using constructor chaining
class Circle {
    double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Calls parameterized constructor
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display radius
    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }
}

public class CircleRadius{
    // Main method to test the class
    public static void main(String[] args) {

        //object created using default constructor
        Circle defaultCircle = new Circle();

        //object created using parameterized constructor
        Circle customCircle = new Circle(5.5);

        System.out.println("Default Circle:");
        defaultCircle.displayRadius();
        System.out.println("\nCustom Circle:");
        customCircle.displayRadius();
    }
}