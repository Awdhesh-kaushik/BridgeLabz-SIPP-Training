import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookBuddy {
    private List<String> bookshelf;

    public BookBuddy() {
        bookshelf = new ArrayList<>();
    }

   
    public void addBook(String title, String author) {
        bookshelf.add(title + " - " + author);
    }

    public void sortBooksAlphabetically() {
        Collections.sort(bookshelf);
    }

    
    public void searchByAuthor(String author) {
        boolean found = false;
        System.out.println("Books by " + author + ":");
        for (String book : bookshelf) {
            String[] parts = book.split(" - ");
            if (parts.length == 2 && parts[1].equalsIgnoreCase(author)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by this author.");
        }
    }

    public String[] exportBooksAsArray() {
        return bookshelf.toArray(new String[0]);
    }

    public void displayBooks() {
        System.out.println("Your Bookshelf:");
        for (String book : bookshelf) {
            System.out.println(book);
}
}
}
