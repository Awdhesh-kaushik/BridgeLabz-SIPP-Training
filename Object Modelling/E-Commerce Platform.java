package ObjectModeling;

import java.util.*;

// Product class represents an item that can be ordered
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showProduct() {
        System.out.println(name + " - ₹" + price);
    }
}

// Order class aggregates multiple Product objects
class Order {
    String orderId;
    List<Product> products = new ArrayList<>();

    Order(String orderId) {
        this.orderId = orderId;
    }

    // Aggregation: Order "has-a" list of Products
    public void addProduct(Product p) {
        products.add(p);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in this order:");
        for (Product p : products) {
            p.showProduct();
        }
    }
}

// Customer class places an order (Association with Order)
class Customer1 {
    String name;
    List<Order> orders = new ArrayList<>();

    Customer1(String name) {
        this.name = name;
    }

    // Association: Customer can place multiple Orders
    public void placeOrder(Order o) {
        orders.add(o);
    }

    public void showMyOrders() {
        System.out.println(name + "'s Orders:");
        for (Order o : orders) {
            o.showOrderDetails();
            System.out.println();
        }
    }
}

// Main class to demonstrate functionality
public class ECommercePlatformAndProducts {
    public static void main(String[] args) {
        // Create Products
        Product p1 = new Product("Laptop", 55000.0);
        Product p2 = new Product("Wireless Mouse", 1500.0);
        Product p3 = new Product("Keyboard", 1200.0);

        // Create Customer
        Customer1 customer = new Customer1("Abhishek Sharma");

        // Create Orders
        Order order1 = new Order("ORD101");
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order("ORD102");
        order2.addProduct(p3);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Show order summary
        customer.showMyOrders();
    }
}