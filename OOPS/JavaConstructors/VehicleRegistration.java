package JavaConstructors;

class Vehicle {

    // Instance variables (unique to each object)
    private String ownerName;
    private String vehicleType;

    // Class variable (shared among all objects of Vehicle class)
    private static double registrationFee = 4500.00; // Default fee

    // Constructor to initialize instance variables
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println("------------------------------");
    }

    // Class method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to ₹" + registrationFee);
    }
}
public class VehicleRegistration {
    // Main method to demonstrate the functionality
    public static void main(String[] args) {

        // Creating Vehicle objects
        Vehicle v1 = new Vehicle("Jethalal Gada", "Car");
        Vehicle v2 = new Vehicle("Aatmaram Tukaram Bhide", "Scooter");

        // Displaying initial details
        System.out.println("Initial Vehicle Details:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Updating registration fee using class method
        Vehicle.updateRegistrationFee(5500.00);

        // Displaying updated details
        System.out.println("Updated Vehicle Details:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
