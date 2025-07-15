package OOPPillars;

// Reservable Interface
interface Reservable {
    boolean reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract Class
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrower;
    private boolean isReserved;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrower = null;
        this.isReserved = false;
    }

    public abstract int getLoanDuration(); // in days

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Reserved: " + (isReserved ? "Yes" : "No"));
        if (borrower != null) {
            System.out.println("Borrower: " + borrower);
        }
    }

    // Encapsulation: securing personal data
    public String getBorrower() {
        return borrower;
    }

    protected void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    protected boolean isReserved() {
        return isReserved;
    }

    protected void setReserved(boolean reserved) {
        this.isReserved = reserved;
    }
}

// Subclass: Book
class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14; // 14 days
    }

    public boolean reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrower(borrowerName);
            setReserved(true);
            return true;
        }
        return false;
    }

    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Subclass: Magazine
class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7; // 7 days
    }

    public boolean reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrower(borrowerName);
            setReserved(true);
            return true;
        }
        return false;
    }

    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Subclass: DVD
class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 5; // 5 days
    }

    public boolean reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrower(borrowerName);
            setReserved(true);
            return true;
        }
        return false;
    }

    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Main Class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];

        items[0] = new Book("B001", "Wings of Fire", "A.P.J. Abdul Kalam");
        items[1] = new Magazine("M001", "National Geographic", "Various");
        items[2] = new DVD("D001", "Interstellar", "Christopher Nolan");

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Polymorphic use of Reservable
            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                if (r.checkAvailability()) {
                    r.reserveItem("Abhishek Sharma");
                    System.out.println("Item reserved successfully.");
                } else {
                    System.out.println("Item already reserved.");
                }
            }
            System.out.println("--------------------------------------------------");
        }
    }
}