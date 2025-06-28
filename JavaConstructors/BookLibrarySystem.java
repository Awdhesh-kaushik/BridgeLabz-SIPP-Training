package JavaConstructors;


public class BookLibrarySystem {
    public static void main(String[] args) {
        System.out.println("Book Library System");

        Kitab book = new Kitab("8129135515", "The 3 Mistakes of My Life");
        book.setAuthor("Chetan Bhagat");
        book.displayBookDetails();

        EBook ebook = new EBook("0143039652", "Malgudi Days", 5.6);
        ebook.setAuthor("R.K. Narayan");
        ebook.displayEBookDetails();
    }
}

// Book class with ISBN, title, and author
class Kitab {

    public String ISBN;         // Public: accessible from anywhere
    protected String title;     // Protected: accessible in subclass
    private String author;      // Private: accessible only in this class

    // Constructor
    public Kitab(String ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }

    // Public setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public getter for author
    public String getAuthor() {
        return this.author;
    }

    // Display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("----------------------------");
    }
}

// Subclass EBook accessing ISBN and title
class EBook extends Kitab {

    private double fileSizeMB;

    public EBook(String ISBN, String title, double fileSizeMB) {
        super(ISBN, title);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);         // public
        System.out.println("Title: " + title);       // protected
        System.out.println("File Size: " + fileSizeMB + " MB");
        System.out.println("Author: " + getAuthor()); // private (accessed via getter)
        System.out.println("----------------------------");
    }
}
