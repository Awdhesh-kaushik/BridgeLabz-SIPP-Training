package OOPPillars;

interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle{
    private String vehicleNumber;
    private String type;
    private int rentalRate;

    abstract double calculateRentalCost(int days);

    public Vehicle(String vehicleNumber, String type, int rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRentalRate() {
        return rentalRate;
    }

    void showInfo(int days){
        System.out.println("Vehicle Type: " + type);
        System.out.println("Vehicle Rental Rate per Day: " + getRentalRate());
        System.out.println("Total Rental Cost: "+calculateRentalCost(days));
    }
}

class Car extends Vehicle implements Insurable{
    public Car(String vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    double calculateRentalCost(int days){
        return  getRentalRate() * days;
    }

    public double calculateInsurance(){
        return getRentalRate()*0.05;
    }

    public String getInsuranceDetails(){
        return "5 % Insurance on Car";
    }


}

class Bike extends Vehicle implements Insurable{
    public Bike(String vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    double calculateRentalCost(int days){
        return getRentalRate() * days;
    }

    public double calculateInsurance(){
        return getRentalRate()*0.02;
    }

    public String getInsuranceDetails(){
        return "2 % Insurance on Bike";
    }

}

class Truck extends Vehicle implements Insurable{
    public Truck(String vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    double calculateRentalCost(int days){
        return  getRentalRate() * days;
    }

    public double calculateInsurance(){
        return getRentalRate()*0.10;
    }

    public String getInsuranceDetails(){
        return "10 % Insurance on Truck";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        int rentalDays = 5;
        Vehicle[] vehicle = new Vehicle[3];
        vehicle[0] = new Car("DL5CQ1818", "Coupe", 5000);
        vehicle[1] = new Bike("TN01BH1979","Adventure Tourer",400);
        vehicle[2] = new Truck("MH12GJ1234","Goods Transport Vehicle",40);
        for(Vehicle v : vehicle){
            v.showInfo(rentalDays);
            Insurable ins = (Insurable) v;
            double insurance = ins.calculateInsurance();
            System.out.println(ins.getInsuranceDetails());
            System.out.println("Insurance cost: " + insurance);
            System.out.println("Total Cost (Rental + Insurance): " + ((insurance)+v.calculateRentalCost(rentalDays)));
            System.out.println("---------------------------------------------------------------------");
        }
    }
}