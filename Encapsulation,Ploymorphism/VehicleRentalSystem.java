abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String num, String type, double rate) {
        this.vehicleNumber = num;
        this.type = type;
        this.rentalRate = rate;
    }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) {
        super(num, "Car", rate);
    }

    public double calculateRentalCost(int days) {
        return days * 1000;
    }

    public double calculateInsurance() { return 2000; }
    public String getInsuranceDetails() { return "Basic Insurance"; }
}
