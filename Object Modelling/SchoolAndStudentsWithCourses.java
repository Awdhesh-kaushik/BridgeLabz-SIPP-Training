package ObjectModeling;

import java.util.ArrayList;
import java.util.List;

// Course class models a course that multiple students can enroll in
class Course {
    String courseName;
    List<Student> enrolledStudents = new ArrayList<>();

    Course(String name) {
        this.courseName = name;
    }

    // Association: A Course can have multiple associated Students
    public void enrollStudent(Student s) {
        enrolledStudents.add(s);
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.name);
        }
    }
}

// Student class models a student who can enroll in multiple courses
class Student {
    String name;
    List<Course> enrolledCourses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    // Association: A Student can enroll in multiple Courses
    public void enrollInCourse(Course c) {
        enrolledCourses.add(c);
        c.enrollStudent(this);  // Mutual linking
    }

    public void showCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.courseName);
        }
    }
}

// School class contains a list of Students — Aggregation
class School {
    String schoolName;
    List<Student> students;

    // Aggregation: School "has-a" collection of students (students can exist outside school)
    School(String name, List<Student> students) {
        this.schoolName = name;
        this.students = students;
    }

    public void showAllStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

// Main class to demonstrate functionality
public class SchoolAndStudentsWithCourses {
    public static void main(String[] args) {
        // Create Courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Create Students
        Student s1 = new Student("Nobita Nobi");
        Student s2 = new Student("Shizuka Minamoto");

        // Enroll students in courses (Association)
        s1.enrollInCourse(math);
        s1.enrollInCourse(science);
        s2.enrollInCourse(science);

        // Create list of students for School (Aggregation)
        List<Student> schoolStudents = new ArrayList<>();
        schoolStudents.add(s1);
        schoolStudents.add(s2);

        // Create School
        School mySchool = new School("Green Valley High School", schoolStudents);

        // Display
        mySchool.showAllStudents();
        s1.showCourses();
        s2.showCourses();
        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}