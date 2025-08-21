abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int qty) {
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + ": " + calculateTotalPrice());
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    public double applyDiscount() { return 20; }
    public String getDiscountDetails() { return "20% off"; }
}
