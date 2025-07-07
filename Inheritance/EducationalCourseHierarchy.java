package Inheritance;

// Base class representing a general course
class Course {
    String courseName;    // Name of the course
    int duration;         // Duration in hours

    // Constructor to initialize base course attributes
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display basic course information
    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Subclass representing an online course
class OnlineCourse extends Course {
    String platform;      // e.g., Coursera, Udemy, etc.
    boolean isRecorded;   // Indicates if the course is recorded

    // Constructor to initialize online course attributes
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Call the parent constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overridden method to display full online course info
    @Override
    public void displayInfo() {
        super.displayInfo();  // Show basic info
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass representing a paid online course
class PaidOnlineCourse extends OnlineCourse {
    double fee;           // Course fee in INR or any currency
    double discount;      // Discount in percentage

    // Constructor to initialize paid course details
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Call OnlineCourse constructor
        this.fee = fee;
        this.discount = discount;
    }

    // Overridden method to display full paid course details
    @Override
    public void displayInfo() {
        super.displayInfo();  // Show online course info
        System.out.println("Course Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

// Main class to test the course hierarchy
public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        // Create a PaidOnlineCourse object
        PaidOnlineCourse paidCourse = new PaidOnlineCourse(
                "Java Programming Masterclass",
                60,
                "Udemy",
                true,
                3499.0,
                25.0
        );

        System.out.println("=== Paid Online Course Details ===");
        paidCourse.displayInfo();
    }
}