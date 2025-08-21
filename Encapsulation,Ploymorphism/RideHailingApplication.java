abstract class Vehicle {
    private String vehicleId, driverName;
    private double ratePerKm;

    public Vehicle(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println(driverName + " - Rate: " + ratePerKm);
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String loc);
}

class Auto extends Vehicle implements GPS {
    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return distance * 8;
    }

    public String getCurrentLocation() { return "City Center"; }
    public void updateLocation(String loc) {}
}
