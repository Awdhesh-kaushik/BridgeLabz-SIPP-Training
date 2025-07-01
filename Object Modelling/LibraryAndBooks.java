package ObjectModeling;

import java.util.ArrayList;
import java.util.List;

public class LibraryAndBooks {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird","Harper Lee","978-0-06-112008-4");
        Book book2 = new Book("Pride and Prejudice","Jane Austen","978-1-85326-000-1");
        Book book3 = new Book("Sapiens: A Brief History of Humankind","Yuval Noah Harari","978-0-06-231609-7");
        Book book4 = new Book("Atomic Habits","James Clear","978-0-7352-1129-2");
        Book book5 = new Book("The 7 Habits of Highly Effective People","Stephen R. Covey","978-1-4767-8610-6");
        Library library1 = new Library();
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book5);
        Library library2 = new Library();
        library2.addBook(book5);
        library2.addBook(book4);
        library2.addBook(book3);

        //Displays the details of all books in library1
        System.out.println("Book details of Library1 are : ");
        library1.display();
        System.out.println("Book details of Library2 are : ");
        //displays the details of all books in library2
        library2.display();
    }
}
class Library {
    List<Book> books;  //List for storing books details in a particular library

    //Constructor for initialising objects
    public Library() {
        books = new ArrayList<>();
    }

    //Method for adding books in library
    void addBook(Book book) {
        this.books.add(book);
    }

    //Method for displaying books in library
    void display() {
        for (Book book : books) {
            book.details();
        }
    }

}
class Book {
    String title; //Stores the title of book
    String author; //Stores the author name of book
    String isbn; //Store isbn of book

    //Constructor to initialise the book
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    //Display the Info of book
    void details(){
        System.out.println("Book Details are : " );
        System.out.println("Book Title : "+this.title);
        System.out.println("Book Author : "+this.author);
        System.out.println("Book ISBN : "+this.isbn);
        System.out.println("-----------------------------------------------");
    }

}