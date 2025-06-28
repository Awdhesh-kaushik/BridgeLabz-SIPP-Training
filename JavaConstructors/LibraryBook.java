package JavaConstructors;
// Book class for Library Book System with borrow functionality
class Books {
    String title;
    String author;
    double price;
    boolean isAvailable;

    // Constructor
    public Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    // Borrow method
    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    // Display details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + isAvailable);
    }
}

public class LibraryBook {
    // Main method to test the class
    public static void main(String[] args) {
        Books book = new Books("The Alchemist", "Paulo Coelho", 199.99);

        System.out.println("Before borrowing:");
        book.display();
        book.borrow();
        System.out.println("\nAfter borrowing:");
        book.display();
    }
}