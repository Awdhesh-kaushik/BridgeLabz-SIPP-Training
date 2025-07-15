package OOPPillars;

// GPS Interface
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract Vehicle Class
abstract class Vehicles implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicles(String vehicleId, String driverName, double ratePerKm, String location) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = location;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    // Encapsulation
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // GPS methods
    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Subclass Car
class Cars extends Vehicles {
    public Cars(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; // base fare for car
    }
}

// Subclass Bike
class Bikes extends Vehicles {
    public Bikes(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20; // lower base fare for bike
    }
}

// Subclass Auto
class Autos extends Vehicles {
    public Autos(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 30; // base fare for auto
    }
}

// Main Class
public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicles[] rides = new Vehicles[3];

        rides[0] = new Cars("CAR123", "Ravi Sharma", 15, "Sector 18");
        rides[1] = new Bikes("BIKE456", "Amit Kumar", 8, "Noida City Center");
        rides[2] = new Autos("AUTO789", "Pooja Singh", 10, "Botanical Garden");

        double distance = 10.5; // in kilometers

        for (Vehicles v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: ₹" + v.calculateFare(distance));
            v.updateLocation("Destination Reached");
            System.out.println("Updated Location: " + v.getCurrentLocation());
            System.out.println("---------------------------------------------");
        }
    }
}