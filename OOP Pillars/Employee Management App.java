package OOPPillars;

// Interface Department with abstract methods
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

// Abstract Employee class
abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateSalary();

    // Concrete method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: ₹" + baseSalary);
        System.out.println("Department: " + department);
        System.out.println("Final Salary: ₹" + calculateSalary());
        System.out.println("----------------------------------");
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Department methods from interface
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

// Full-time employee class
class FullTimeEmployee extends Employee {
    private double fixedBonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedBonus) {
        super(employeeId, name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedBonus;
    }
}

// Part-time employee class
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }
}

// Main class to run the application
public class EmployeeManagementApp {
    public static void main(String[] args) {
        // Creating employee list
        Employee[] employees = new Employee[3];

        // Adding different types of employees
        employees[0] = new FullTimeEmployee(101, "Nobita Nobi", 30000, 7000);
        employees[0].assignDepartment("Development");

        employees[1] = new PartTimeEmployee(102, "Kenichi Mitsuba", 10000, 40, 200);
        employees[1].assignDepartment("Support");

        employees[2] = new FullTimeEmployee(103, "Kiteretsu Daihyakka", 32000, 8000);
        employees[2].assignDepartment("HR");

        // Displaying details using polymorphism
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}