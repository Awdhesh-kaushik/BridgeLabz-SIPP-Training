package Inheritance;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// Subclass 1: Teacher
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("\n--- Teacher Role ---");
        displayInfo();
        System.out.println("Subject : " + subject);
    }
}

// Subclass 2: Student
class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("\n--- Student Role ---");
        displayInfo();
        System.out.println("Grade : " + grade);
    }
}

// Subclass 3: Staff
class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("\n--- Staff Role ---");
        displayInfo();
        System.out.println("Department : " + department);
    }
}

// Main class to run the program
public class SchoolSystemWithDifferentRoles {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Kaushal Kumar", 45, "Mathematics");
        Student student = new Student("Abhishek Sharma", 20, "12th Grade");
        Staff staff = new Staff("Rahul Sharma", 35, "Administration");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}