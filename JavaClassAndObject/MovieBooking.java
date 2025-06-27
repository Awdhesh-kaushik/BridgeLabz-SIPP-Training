package JavaClassAndObject;

// MovieTicket class to hold ticket information
class MovieTicket {
    String movieName;   // Name of the movie
    String seatNumber;  // Assigned seat number
    double price;       // Ticket price

    // Method to book the ticket
    void bookTicket(String movie, String seat, double cost) {
        movieName = movie;
        seatNumber = seat;
        price = cost;
    }

    // Method to display the ticket details
    void display() {
        System.out.println("Movie: " + movieName +
                ", Seat: " + seatNumber +
                ", Price: ₹" + price);
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        // Creating and booking a movie ticket
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Avengers: Endgame", "B12", 250.00);

        // Displaying the booked ticket
        ticket.display();
    }
}
