package OOPPillars;

// Interface for Taxable items
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract Product class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();

    // Method to print product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
    }

    // Getters and setters (encapsulation)
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Electronics class - taxable
class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "18% GST applied on Electronics";
    }
}

// Clothing class - taxable
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% GST
    }

    @Override
    public String getTaxDetails() {
        return "12% GST applied on Clothing";
    }
}

// Groceries class - non-taxable
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

// Main class with polymorphic method
public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = new Product[4];

        products[0] = new Electronics(101, "Laptop", 50000);
        products[1] = new Clothing(102, "T-Shirt", 1200);
        products[2] = new Groceries(103, "Rice (5kg)", 600);
        products[3] = new Electronics(104, "Smartphone", 25000);

        for (Product p : products) {
            p.displayDetails();
            double discount = p.calculateDiscount();
            double tax = 0.0;

            // Use instanceof to check if Taxable
            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
                System.out.println(((Taxable) p).getTaxDetails());
            } else {
                System.out.println("No tax on this item.");
            }

            double finalPrice = p.getPrice() + tax - discount;
            System.out.printf("Discount: ₹%.2f\n", discount);
            System.out.printf("Tax: ₹%.2f\n", tax);
            System.out.printf("Final Price: ₹%.2f\n", finalPrice);
            System.out.println("----------------------------------");
        }
    }
}