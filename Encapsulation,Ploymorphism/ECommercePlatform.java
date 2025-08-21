abstract class Product {
    private String productId, name;
    private double price;

    public Product(String id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();
    public double getPrice() { return price; }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(String id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.1; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return "18% GST"; }
}
