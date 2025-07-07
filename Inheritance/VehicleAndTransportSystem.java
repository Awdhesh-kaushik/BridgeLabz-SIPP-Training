package Inheritance;

// Superclass representing a generic Vehicle
class Vehicle {
    int maxSpeed;          // Maximum speed of the vehicle
    String fuelType;       // Type of fuel (e.g., Petrol, Diesel, Electric)

    // Constructor to initialize Vehicle attributes
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display basic vehicle info (will be overridden)
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass representing a Car
class Car extends Vehicle {
    int seatCapacity;      // Unique attribute for Car

    // Constructor to initialize both Vehicle and Car attributes
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType); // Call parent constructor
        this.seatCapacity = seatCapacity;
    }

    // Overriding displayInfo to show Car-specific details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display common vehicle info
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass representing a Truck
class Truck extends Vehicle {
    int loadCapacity;      // Unique attribute for Truck (in kg)

    // Constructor to initialize both Vehicle and Truck attributes
    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType); // Call parent constructor
        this.loadCapacity = loadCapacity;
    }

    // Overriding displayInfo to show Truck-specific details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display common vehicle info
        System.out.println("Load Capacity: " + loadCapacity + " kg");
    }
}

// Subclass representing a Motorcycle
class Motorcycle extends Vehicle {
    boolean hasCarrier;    // Unique attribute for Motorcycle

    // Constructor to initialize both Vehicle and Motorcycle attributes
    public Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType); // Call parent constructor
        this.hasCarrier = hasCarrier;
    }

    // Overriding displayInfo to show Motorcycle-specific details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display common vehicle info
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

// Main class to demonstrate polymorphism
public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Vehicle car = new Car(180, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 8000);
        Vehicle motorcycle = new Motorcycle(150, "Electric", true);

        // Array of Vehicle type demonstrating polymorphism
        Vehicle[] vehicles = {car, truck, motorcycle};

        // Displaying details for each vehicle using dynamic method dispatch
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\n--- Vehicle " + (i + 1) + " Details ---");
            vehicles[i].displayInfo();  // Runtime polymorphism
        }
    }
}