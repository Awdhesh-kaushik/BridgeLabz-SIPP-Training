import java.util.*;

public class FlightManagement {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Flight Booking System ---");
            System.out.println("1. Search Flights");
            System.out.println("2. Book a Flight");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter keyword to search (e.g., Delhi): ");
                    String keyword = sc.nextLine();
                    FlightBookingSystem.searchFlights(keyword);
                    break;

                case 2:
                    System.out.print("Enter exact flight name to book: ");
                    String flightToBook = sc.nextLine();
                    FlightBookingSystem.bookFlight(flightToBook);
                    break;

                case 3:
                    FlightBookingSystem.displayBookings();
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}


class FlightBookingSystem {
    static String[] availableFlights = {
            "IndiGo - Delhi to Mumbai",
            "Air India - Delhi to Bangalore",
            "SpiceJet - Mumbai to Chennai",
            "Vistara - Kolkata to Delhi",
            "GoAir - Hyderabad to Goa"
    };

    static List<String> userBookings = new ArrayList<>();

    // 🔍 Case-insensitive search
    static void searchFlights(String keyword) {
        boolean found = false;

        for (String flight : availableFlights) {
            if (flight.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("\nAvailable Flights matching '" + keyword + "':");
                System.out.println("- " + flight);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No flights found with the keyword.");
        }
    }

    // ✈️ Book a flight
    static void bookFlight(String flightName) {
        boolean exists = false;
        for (String flight : availableFlights) {
            if (flight.equalsIgnoreCase(flightName)) {
                userBookings.add(flight);
                System.out.println("Flight booked successfully: " + flight);
                exists = true;
                break;
            }
        }
        if (!exists) {
            System.out.println("Flight not found. Please enter the exact name as shown in the list.");
        }
    }

    // 📋 View all user bookings
    static void displayBookings() {
        if (userBookings.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            System.out.println("\nYour Bookings:");
            for (int i = 0; i < userBookings.size(); i++) {
                System.out.println((i + 1) + ". " + userBookings.get(i));
            }
        }
    }
}