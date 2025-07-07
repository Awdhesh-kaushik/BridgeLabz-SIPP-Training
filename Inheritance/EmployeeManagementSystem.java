package Inheritance;

// Base class representing a generic employee
class Employee {
    String name;
    int id;
    double salary;

    // Constructor to initialize common employee details
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display basic employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }
}

// Subclass representing a Manager, inherits from Employee
class Manager extends Employee {
    int teamSize; // Unique attribute for Manager

    // Constructor to initialize Manager-specific and common attributes
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // Call parent class constructor
        this.teamSize = teamSize;
    }

    // Overridden method to display Manager-specific details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call base class method
        System.out.println("Team Size: " + teamSize); // Display unique attribute
    }
}

// Subclass representing a Developer, inherits from Employee
class Developer extends Employee {
    String programmingLanguage; // Unique attribute for Developer

    // Constructor to initialize Developer-specific and common attributes
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary); // Call parent class constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Overridden method to display Developer-specific details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call base class method
        System.out.println("Programming Language: " + programmingLanguage); // Display unique attribute
    }
}

// Subclass representing an Intern, inherits from Employee
class Intern extends Employee {
    int durationMonths; // Unique attribute for Intern: duration in months

    // Constructor to initialize Intern-specific and common attributes
    public Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary); // Call parent class constructor
        this.durationMonths = durationMonths;
    }

    // Overridden method to display Intern-specific details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call base class method
        System.out.println("Internship Duration: " + durationMonths + " months"); // Display unique attribute
    }
}

// Main class to run and test the hierarchy
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating objects of each subclass
        Manager manager = new Manager("Virat Kohli", 101, 90000, 5);
        Developer developer = new Developer("Rohit Sharma", 102, 70000, "Java");
        Intern intern = new Intern("Subhman Gill", 103, 15000, 6);

        // Displaying details of each employee type
        System.out.println("=== Manager Details ===");
        manager.displayDetails();

        System.out.println("\n=== Developer Details ===");
        developer.displayDetails();

        System.out.println("\n=== Intern Details ===");
        intern.displayDetails();
    }
}