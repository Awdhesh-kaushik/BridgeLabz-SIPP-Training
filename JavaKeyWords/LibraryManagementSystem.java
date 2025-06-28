package JavaKeyWords;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("Wings of Fire", "A.P.J Abdul Kalam", "ISBN-1111");
        Book book2 = new Book("The Alchemist", "Paulo Coelho", "ISBN-2222");

        //Checking is book1 is an instance of Book or not
        if (book1 instanceof Book) {
            book1.displayBookInfo();
        }
        //Checking is book2 is an instance of Book or not
        if (book2 instanceof Book) {
            book2.displayBookInfo();
        }

        Book.displayLibraryName();
    }
}

class Book {
    protected String title;
    protected String author;
    final String isbn;
    static String libraryName = "Central Library";

    // Constructor using 'this'
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Display book details
    public void displayBookInfo() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Library: " + libraryName);
        System.out.println("------------------------------------------------");
    }
}
