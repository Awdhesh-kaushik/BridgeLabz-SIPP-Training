package JavaKeyWords;

// Main class to test the Shopping Cart System
public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Creating product objects using constructor
        Product p1 = new Product("Laptop", 55000.0, 1, "P001");
        Product p2 = new Product("Mouse", 499.0, 2, "P002");

        // Using instanceof to ensure object is of Product type before displaying info
        if (p1 instanceof Product) {
            p1.displayProductDetails();
        }
        if (p2 instanceof Product) {
            p2.displayProductDetails();
        }

        // Calling static method to update the discount percentage
        Product.updateDiscount(10); // Update discount to 10%
    }
}

// Class to represent a Product in the shopping cart
class Product {
    // Instance variables
    protected String productName;    // Name of the product
    protected double price;          // Price of a single product
    protected int quantity;          // Quantity purchased
    final String productID;          // Unique product ID (final - cannot be changed)

    // Static variable shared by all products
    static int discount = 5;         // Discount percentage applied to all products

    // Constructor using 'this' to initialize instance variables
    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update discount percentage
    public static void updateDiscount(int newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    // Method to display details of the product
    public void displayProductDetails() {
        System.out.println("Product Name: " + this.productName);
        System.out.println("Product ID: " + this.productID);
        System.out.println("Price: ₹" + this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Current Discount: " + discount + "%");
        System.out.println("------------------------------------------------");
    }
}
