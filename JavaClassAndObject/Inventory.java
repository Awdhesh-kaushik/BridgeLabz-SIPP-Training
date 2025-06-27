package JavaClassAndObject;

class Item {
    String itemCode;
    String itemName;
    double price;

    void display(int quantity) {
        double totalCost = price * quantity;
        System.out.println("Item: " + itemName + " | Code: " + itemCode + " | Quantity: " + quantity + " | Total: ₹" + totalCost);
    }
}

public class Inventory {
    public static void main(String[] args) {
        Item item = new Item();
        item.itemCode = "P101";
        item.itemName = "Pen";
        item.price = 15.0;

        item.display(10); // Display total cost for quantity
    }
}
