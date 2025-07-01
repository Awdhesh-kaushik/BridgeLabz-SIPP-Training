ackage ObjectModeling;

import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', position='" + position + "'}";
    }
}

// Department class
class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String position) {
        employees.add(new Employee(name, position));
    }

    @Override
    public String toString() {
        return "Department{name='" + name + "', employees=" + employees + "}";
    }
}

// Company class using composition
class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String name) {
        departments.add(new Department(name));
    }

    public Department getDepartment(int index) {
        if (index >= 0 && index < departments.size()) {
            return departments.get(index);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Company{name='" + name + "', departments=" + departments + "}";
    }
}

// Main class to demonstrate composition
public class CompanyAndDepartments {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("TechCorp");

        // Add departments to the company
        company.addDepartment("Engineering");
        company.addDepartment("Marketing");
        company.addDepartment("HR");

        // Add employees to departments
        company.getDepartment(0).addEmployee("John Doe", "Software Engineer");
        company.getDepartment(0).addEmployee("Jane Smith", "Senior Developer");
        company.getDepartment(1).addEmployee("Mike Johnson", "Marketing Manager");
        company.getDepartment(2).addEmployee("Sarah Williams", "HR Specialist");

        // Print company info
        System.out.println(company);

        // When company is deleted (set to null), all departments and employees are automatically deleted
        company = null;

        // This demonstrates composition - departments and employees can't exist without the company
    }
}