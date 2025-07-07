package ObjectModeling;

import java.util.*;

// Course class: Linked with both Students and Professors
class Courses {
    String courseName;
    Professor professor;
    List<Students> enrolledStudents = new ArrayList<>();

    Courses(String name) {
        this.courseName = name;
    }

    // Associate a Professor with this course
    public void assignProfessor(Professor prof) {
        this.professor = prof;
    }

    // Associate a Student with this course
    public void enrollStudent(Students student) {
        enrolledStudents.add(student);
    }

    public void showCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.name : "None assigned"));
        System.out.println("Enrolled Students:");
        for (Students s : enrolledStudents) {
            System.out.println("- " + s.name);
        }
    }
}

// Student class: Can enroll in multiple courses
class Students {
    String name;
    List<Courses> courses = new ArrayList<>();

    Students(String name) {
        this.name = name;
    }

    // Association: Student enrolls in a course
    public void enrollCourse(Courses course) {
        courses.add(course);
        course.enrollStudent(this); // Link student to course
    }

    public void showMyCourses() {
        System.out.println(name + "'s Enrolled Courses:");
        for (Courses c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

// Professor class: Can be assigned to teach multiple courses
class Professor {
    String name;
    List<Courses> teachingCourses = new ArrayList<>();

    Professor(String name) {
        this.name = name;
    }

    // Association: Assign professor to a course
    public void assignCourse(Courses course) {
        teachingCourses.add(course);
        course.assignProfessor(this); // Link professor to course
    }

    public void showMyCourses() {
        System.out.println("Professor " + name + " teaches:");
        for (Courses c : teachingCourses) {
            System.out.println("- " + c.courseName);
        }
    }
}

// University class aggregates Students and Professors
class University {
    String name;
    List<Students> students = new ArrayList<>();
    List<Professor> professors = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    // Aggregation: University "has" students and professors
    public void addStudent(Students s) {
        students.add(s);
    }

    public void addProfessor(Professor p) {
        professors.add(p);
    }

    public void showAllMembers() {
        System.out.println("University: " + name);
        System.out.println("Students:");
        for (Students s : students) {
            System.out.println("- " + s.name);
        }

        System.out.println("Professors:");
        for (Professor p : professors) {
            System.out.println("- " + p.name);
        }
    }
}

// Main class to demonstrate the system
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create University
        University uni = new University("National Institute of Technology Prayagraj");

        // Create Students
        Students s1 = new Students("Dr. V. Narayanan");
        Students s2 = new Students("Dr. Ritu Karidhal Srivastava");

        // Create Professors
        Professor p1 = new Professor("Dr. Sarvepalli Radhakrishnan");
        Professor p2 = new Professor("Dr. A.P.J. Abdul Kalam");

        // Create Courses
        Courses c1 = new Courses("Data Structures");
        Courses c2 = new Courses("Database Systems");

        // Assign professors to courses
        p1.assignCourse(c1);
        p2.assignCourse(c2);

        // Students enroll in courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c2);

        // Add students and professors to university (Aggregation)
        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addProfessor(p1);
        uni.addProfessor(p2);

        // Display Information
        System.out.println();
        uni.showAllMembers();
        System.out.println();
        s1.showMyCourses();
        s2.showMyCourses();
        System.out.println();
        p1.showMyCourses();
        p2.showMyCourses();
        System.out.println();
        c1.showCourseInfo();
        c2.showCourseInfo();
    }
}