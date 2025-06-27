package JavaClassAndObject;

class MobilePhone {
    String brand;
    String model;
    double price;

    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: ₹" + price);
    }
}

public class MobileDetails {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.brand = "Samsung";
        phone.model = "Galaxy S22";
        phone.price = 59999.99;

        phone.display(); // Display mobile phone details
    }
}
