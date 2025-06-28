package JavaKeyWords;

// Main class to test the University Student Management System
public class UniversityStudentManagement {
    public static void main(String[] args) {
        // Creating student objects using the constructor
        Student s1 = new Student("Bheem", 201, "A");
        Student s2 = new Student("Raju", 202, "B");

        // Using instanceof to ensure object is of Student type before displaying info
        if (s1 instanceof Student) {
            s1.displayStudentInfo();
        }
        if (s2 instanceof Student) {
            s2.displayStudentInfo();
        }

        // Calling static method to display total number of students
        Student.displayTotalStudents();
    }
}

// Class to represent a Student
class Student {
    // Instance variables
    protected String name;          // Student's name
    protected String grade;         // Student's grade
    final int rollNumber;           // Roll number (final - cannot be changed)

    // Static variables shared by all students
    static String universityName = "Delhi University";  // Common university name
    static int totalStudents = 0;                        // Counter to keep track of total students

    // Constructor using 'this' to initialize instance variables
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Increments total student count when a new student is created
    }

    // Static method to display total number of students in the university
    public static void displayTotalStudents() {
        System.out.println("Total Students in " + universityName + ": " + totalStudents);
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Grade: " + this.grade);
        System.out.println("University: " + universityName);
        System.out.println("------------------------------------------------");
    }
}
