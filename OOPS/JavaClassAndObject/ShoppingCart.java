package JavaClassAndObject;

// Class to model an item in a shopping cart
class CartItem {
    String itemName;   // Name of the item
    double price;      // Price per item
    int quantity;      // Quantity of items in the cart

    // Method to add items to the cart
    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " item(s) added.");
    }

    // Method to remove items from the cart
    void removeItem(int qty) {
        if (qty > quantity) {
            System.out.println("Cannot remove more items than present.");
        } else {
            quantity -= qty;
            System.out.println(qty + " item(s) removed.");
        }
    }

    // Method to display the total cost
    void displayTotal() {
        System.out.println("Item: " + itemName +
                ", Quantity: " + quantity +
                ", Total: ₹" + (price * quantity));
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        // Creating and initializing a cart item
        CartItem item = new CartItem();
        item.itemName = "Notebook";
        item.price = 40.0;
        item.quantity = 2;

        // Simulate cart operations
        item.addItem(3);     // Total quantity = 5
        item.removeItem(1);  // Total quantity = 4
        item.displayTotal(); // Show total cost
    }
}
