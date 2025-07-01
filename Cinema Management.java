import java.util.*;

public class CinemaManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- CinemaTime - Movie Schedule Manager ---");
            System.out.println("1. Add Movie");
            System.out.println("2. Search Movie");
            System.out.println("3. Display All Movies");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter movie title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter showtime (e.g., 6:30 PM): ");
                    String time = sc.nextLine();
                    CinemaTime.addMovie(title, time);
                    break;

                case 2:
                    System.out.print("Enter keyword to search: ");
                    String keyword = sc.nextLine();
                    CinemaTime.searchMovie(keyword);
                    break;

                case 3:
                    CinemaTime.displayAllMovies();
                    break;

                case 4:
                    System.out.println("Thank you for using CinemaTime!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);
    }
}
class CinemaTime {
    // Lists to store movie titles and their showtimes
    static List<String> movieTitles = new ArrayList<>();
    static List<String> showTimes = new ArrayList<>();

    //Add movie and showtime
    static void addMovie(String title, String time) {
        movieTitles.add(title);
        showTimes.add(time);
        System.out.println("Movie added successfully!");
    }

    // Search movie by keyword
    static void searchMovie(String keyword) {
        boolean found = false;
        System.out.println("\nSearch Results:");
        for (int i = 0; i < movieTitles.size(); i++) {
            if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                System.out.printf("%d. %s at %s\n", i + 1, movieTitles.get(i), showTimes.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movies found with the given keyword.");
        }
    }

    // Display all movies and showtimes
    static void displayAllMovies() {
        if (movieTitles.isEmpty()) {
            System.out.println("No movies scheduled.");
        } else {
            System.out.println("\nScheduled Movies:");
            for (int i = 0; i < movieTitles.size(); i++) {
                System.out.printf("%d. %s at %s\n", i + 1, movieTitles.get(i), showTimes.get(i));
            }
        }
    }
}