package Inheritance;

import java.util.Date;

// Main class to test the online retail order management system
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        // Create a basic Order
        Order order = new Order("ORD101", new Date());
        order.OrderDetails();

        // Create a Shipped Order
        ShippedOrder shipped = new ShippedOrder("ORD102", new Date(), "TRACK123456");
        shipped.ShippedDetails();

        // Create a Delivered Order
        DeliveredOrder delivered = new DeliveredOrder("ORD103", new Date(), "TRACK789456", new Date());
        delivered.DeliveredDetails();
    }
}

// Base class representing a generic order
class Order {
    String orderID;        // Unique ID of the order
    Date orderDate;        // Date when the order was placed

    // Constructor to initialize order attributes
    public Order(String orderID, Date orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    // Method to display basic order details
    void OrderDetails() {
        System.out.println("======== Order Details ========");
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Date: " + orderDate);
        System.out.println("----------------------------------------------");
    }
}

// Subclass representing a shipped order
class ShippedOrder extends Order {
    String trackingNumber;  // Tracking number of the shipment

    // Constructor to initialize shipped order attributes
    public ShippedOrder(String orderID, Date orderDate, String trackingNumber) {
        super(orderID, orderDate); // Call parent constructor
        this.trackingNumber = trackingNumber;
    }

    // Method to display shipped order details
    void ShippedDetails() {
        super.OrderDetails(); // Display base order info
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Subclass representing a delivered order
class DeliveredOrder extends ShippedOrder {
    Date deliveryDate;  // Date when the order was delivered

    // Constructor to initialize delivered order attributes
    public DeliveredOrder(String orderID, Date orderDate, String trackingNumber, Date deliveryDate) {
        super(orderID, orderDate, trackingNumber); // Call parent constructor
        this.deliveryDate = deliveryDate;
    }

    // Method to display delivered order details
    void DeliveredDetails() {
        super.OrderDetails(); // Display base order info
        System.out.println("Delivery Date: " + deliveryDate);
    }
}