package Inheritance;

// Superclass: Vehicle
class Vehicles {
    protected double maxSpeed;
    protected String model;

    public Vehicles(double maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Method to display vehicle details
    public void showInfo() {
        System.out.println("Model     : " + model);
        System.out.println("Max Speed : " + maxSpeed + " km/h");
    }
}

// Interface: Refuelable (for petrol or fuel-based vehicles)
interface Refuelable {
    void refuel();  // To be implemented by petrol vehicles
}

// Subclass: ElectricVehicle (does NOT implement Refuelable)
class ElectricVehicle extends Vehicles {
    private double batteryCapacity;

    public ElectricVehicle(double maxSpeed, String model, double batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging "+this.model+" with " + batteryCapacity + " kWh battery.");
    }

    @Override
    public void showInfo() {
        System.out.println("=== Electric Vehicle ===");
        super.showInfo();
        System.out.println("Battery   : " + batteryCapacity + " kWh");
    }
}

// Subclass: PetrolVehicle (extends Vehicle and implements Refuelable)
class PetrolVehicle extends Vehicles implements Refuelable {
    private double tankCapacity;

    public PetrolVehicle(double maxSpeed, String model, double tankCapacity) {
        super(maxSpeed, model);
        this.tankCapacity = tankCapacity;
    }

    // Implement refuel method
    @Override
    public void refuel() {
        System.out.println("Refueling "+this.model+" with " + tankCapacity + " liters of fuel.");
    }

    @Override
    public void showInfo() {
        System.out.println("=== Petrol Vehicle ===");
        super.showInfo();
        System.out.println("Fuel Tank : " + tankCapacity + " liters");
    }
}

// Main class to run the system
public class VehicleManagementSystemWithHybridInheritance {
    public static void main(String[] args) {
        // Create ElectricVehicle object
        ElectricVehicle ev = new ElectricVehicle(120.0, "Tata Nexon EV", 40.5);
        ev.showInfo();
        ev.charge();

        System.out.println();

        // Create PetrolVehicle object
        PetrolVehicle pv = new PetrolVehicle(200.0, "Mahindra XUV700 Petrol", 50.0);
        pv.showInfo();
        pv.refuel();
    }
}