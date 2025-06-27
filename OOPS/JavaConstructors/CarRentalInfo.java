package JavaConstructors;
// CarRental class with constructors and cost calculation
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay = 1000.0; // Fixed rate for per day for one car of any type of car available to us

    // Default constructor
    public CarRental() {
        this.customerName = "Customer";
        this.carModel = "Model X";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Calculate and return total cost
    public double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }

    // Display rental details
    public void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class CarRentalInfo{
    // Main method to test the class
    public static void main(String[] args) {

        //object created using default constructor
        CarRental defaultRental = new CarRental();

        //object created using parameterized constructor
        CarRental customRental = new CarRental("Ravi Kumar", "Hyundai i20", 4);

        System.out.println("Default Rental:");
        defaultRental.display();
        System.out.println("\nCustom Rental:");
        customRental.display();
    }
}