package JavaKeyWords;

// Main class to test the Employee Management System
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating employee objects using the constructor
        Employee emp1 = new Employee("Narendra Damodar Das Modi", 101, "Software Engineer");
        Employee emp2 = new Employee("Vladimir Putin", 102, "HR Manager");

        // Using instanceof to ensure object is of Employee type before displaying info
        if (emp1 instanceof Employee) {
            emp1.displayEmployeeInfo();
        }
        if (emp2 instanceof Employee) {
            emp2.displayEmployeeInfo();
        }

        // Calling static method to display total number of employees
        Employee.displayTotalEmployees();
    }
}

// Class to represent an Employee
class Employee {
    // Instance variables
    protected String name;            // Name of the employee
    protected String designation;     // Job title of the employee
    final int id;                     // Employee ID (final, can't be changed once assigned)

    // Static variables
    static String companyName = "Infosys"; // Shared by all employee objects
    static int totalEmployees = 0;         // Counter to keep track of total employees

    // Constructor using 'this' keyword to initialize instance variables
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; // Increment totalEmployees whenever a new object is created
    }

    // Static method to display total number of employees in the company
    public static void displayTotalEmployees() {
        System.out.println("Total Employees in " + companyName + ": " + totalEmployees);
    }

    // Method to display details of the employee
    public void displayEmployeeInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Employee ID: " + this.id);
        System.out.println("Designation: " + this.designation);
        System.out.println("Company: " + companyName);
        System.out.println("------------------------------------------------");
    }
}
