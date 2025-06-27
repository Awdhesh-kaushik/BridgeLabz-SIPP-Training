package JavaClassAndObject;

class Circle {
    double radius;

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }
}

public class CircleOperations {
    public static void main(String[] args) {
        Circle circle = new Circle(); // Object creation of circle class
        circle.radius = 7.5;

        circle.display(); // Display area and circumference
    }
}
