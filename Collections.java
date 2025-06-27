import java.util.ArrayList;
import java.util.Collections;

public class Book{
private ArrayList <String> bookshelf;

public Book(){
 bookshelf = new ArrayList<>();
 }
 
 public void addbook(String title ,String author){
 bookshelf.add(Title + " - " Author);
 }
 
 
 public void sortBooksAlphabetically(){
  Collections.sort(bookshelf);
  }
  
  public void searchByAuthor(String author) {
  System.out.println ("Books by" + Author );
  
  public void split(){
  String.split (" ");
  }
  
 public String[] ArrayListToArray() {
        return bookshelf.toArray(new String[0]);
    }
  
public static void main (String[] args){
  BookBuddy bb = new BookBuddy();
        bb.addBook("Harry Potter", "Yash");
        bb.addBook("The Walk", "Santosh");
        bb.addBook("Deep Work", "Piyush");

        bb.sortBooksAlphabetically();
        System.out.println("Sorted Books: " + bb.bookshelf);

        System.out.println("Search by Author (Piyush):");
        bb.searchByAuthor("Piyush");

        System.out.println("Exported Array: " + Arrays.toString(bb.exportToArray()));
    }
}
