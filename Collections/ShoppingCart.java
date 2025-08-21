import java.util.*;

public class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private Map<String, Double> cart = new LinkedHashMap<>();

    public ShoppingCart() {
        productPrices.put("Apple", 50.0);
        productPrices.put("Banana", 20.0);
        productPrices.put("Mango", 70.0);
    }

    public void addItem(String item) {
        if (productPrices.containsKey(item)) {
            cart.put(item, productPrices.get(item));
        } else {
            System.out.println("Item not available.");
        }
    }

    public void showCart() {
        System.out.println("Cart (Insertion Order): " + cart);
    }

    public void showSortedByPrice() {
        TreeMap<Double, String> sorted = new TreeMap<>();
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            sorted.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Cart (Sorted by Price): " + sorted);
    }

    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        sc.addItem("Apple");
        sc.addItem("Mango");
        sc.addItem("Banana");

        sc.showCart();
        sc.showSortedByPrice();
    }
}
