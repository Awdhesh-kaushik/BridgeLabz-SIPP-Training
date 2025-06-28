package JavaConstructors;
// HotelBooking class with multiple constructors
class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    // Display booking details
    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}

public class HotelBookingDetails{
    // Main method to test the class
    public static void main(String[] args) {

        //object using default constructor
        HotelBooking defaultBooking = new HotelBooking();

        //object created using parameterized constructor
        HotelBooking customBooking = new HotelBooking("John Doe", "Deluxe", 3);

        //object created using copied constructor
        HotelBooking copiedBooking = new HotelBooking(customBooking);

        System.out.println("Default Booking:");
        defaultBooking.display();
        System.out.println("\nCustom Booking:");
        customBooking.display();
        System.out.println("\nCopied Booking:");
        copiedBooking.display();
    }
}