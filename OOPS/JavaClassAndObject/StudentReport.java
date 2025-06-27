package JavaClassAndObject;

// Student class to hold student details
class Student {
    String name;       // Student's name
    int rollNumber;    // Roll number
    int marks;         // Marks obtained

    // Method to calculate grade based on marks
    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";  // Failing grade
    }

    // Method to display student details and grade
    void display() {
        System.out.println("Name: " + name +
                ", Roll No: " + rollNumber +
                ", Marks: " + marks +
                ", Grade: " + calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        // Creating and initializing Student object
        Student student = new Student();
        student.name = "Rahul";
        student.rollNumber = 23;
        student.marks = 82;

        // Displaying the student details and grade
        student.display();
    }
}
