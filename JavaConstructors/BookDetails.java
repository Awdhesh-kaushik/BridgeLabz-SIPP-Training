package JavaConstructors;
// Book class with default and parameterized constructors
class Book {
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        this.title = "Default Title";
        this.author = "Default Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class BookDetails {
    // Main method to test the class
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book customBook = new Book("1984", "George Orwell", 299.99);

        //Default Book with default values
        System.out.println("Default Book:");
        defaultBook.display();

        //CustomBook object details which is created using parameterized constructor
        System.out.println("\nCustom Book:");
        customBook.display();
    }
}