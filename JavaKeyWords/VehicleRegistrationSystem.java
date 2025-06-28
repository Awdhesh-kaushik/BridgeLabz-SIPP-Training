package JavaKeyWords;

// Main class to test the Vehicle Registration System
public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Creating vehicle objects using the constructor
        Vehicle v1 = new Vehicle("Jethalal Chamapaklal Gada", "Car", "DL12AB1234");
        Vehicle v2 = new Vehicle("AtmaRam Tukaram Bhide", "Scooter", "DL34CD5678");

        // Using instanceof to ensure object is of Vehicle type before displaying info
        if (v1 instanceof Vehicle) {
            v1.displayVehicleInfo();
        }
        if (v2 instanceof Vehicle) {
            v2.displayVehicleInfo();
        }

        // Calling static method to update registration fee
        Vehicle.updateRegistrationFee(8000); // Modify fee to ₹8000
    }
}

// Class to represent a Vehicle
class Vehicle {
    // Instance variables
    protected String ownerName;          // Owner's name
    protected String vehicleType;        // Type of vehicle (Car/Bike/etc.)
    final String registrationNumber;     // Unique registration number (final - cannot change)

    // Static variable shared by all vehicles
    static int registrationFee = 5000;   // Default registration fee

    // Constructor using 'this' to initialize instance variables
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: ₹" + registrationFee);
    }

    // Method to display vehicle details
    public void displayVehicleInfo() {
        System.out.println("Owner: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Registration Number: " + this.registrationNumber);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println("------------------------------------------------");
    }
}
