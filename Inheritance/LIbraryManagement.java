package Inheritance;

// Superclass representing a Book
class Book {
    String title;           // Title of the book
    int publicationYear;    // Year the book was published

    // Constructor to initialize book details
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details (can be overridden)
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass representing the Author of a Book
class Author extends Book {
    String name;   // Author's name
    String bio;    // Author's biography

    // Constructor to initialize both book and author attributes
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Initialize Book attributes
        this.name = name;
        this.bio = bio;
    }

    // Overridden method to show full book and author info
    @Override
    public void displayInfo() {
        super.displayInfo(); // Show book details
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class to test the Book-Author system
public class LibraryManagement {
    public static void main(String[] args) {
        // Creating a sample Author object (which is also a Book)
        Author book1 = new Author(
                "Wings of Fire",
                1999,
                "Dr. A.P.J. Abdul Kalam",
                "Missile Man of India and 11th President of India"
        );

        // Displaying the complete information
        System.out.println("=== Book and Author Information ===");
        book1.displayInfo();
    }
}