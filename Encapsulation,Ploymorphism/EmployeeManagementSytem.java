abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int id, String name, double salary) {
        this.employeeId = id;
        this.name = name;
        this.baseSalary = salary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println(name + ": " + calculateSalary());
    }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double calculateSalary() {
        return 1.2 * super.baseSalary;
    }

    public void assignDepartment(String dept) {}
    public String getDepartmentDetails() { return "FullTime Dept"; }
}

class PartTimeEmployee extends Employee implements Department {
    private int hours;
    public PartTimeEmployee(int id, String name, double salary, int hours) {
        super(id, name, salary);
        this.hours = hours;
    }

    public double calculateSalary() {
        return hours * 100;
    }

    public void assignDepartment(String dept) {}
    public String getDepartmentDetails() { return "PartTime Dept"; }
}
