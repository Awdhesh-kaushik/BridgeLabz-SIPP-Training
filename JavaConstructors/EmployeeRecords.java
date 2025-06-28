package JavaConstructors;

public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an Employee
        Employee e1 = new Employee(1001, "Finance");
        e1.setSalary(50000.0);
        e1.displayEmployeeDetails();

        // Creating a Manager
        Manager m1 = new Manager(2001, "IT", "Backend Team");
        m1.setSalary(75000.0);  // inherited method from Employee
        m1.displayManagerDetails();
    }
}
class Employee {
    public int employeeId;      //Stores id of employee
    protected String department;   //stores the department of employee
    private double salary;         // stores the salary of an employee

    public Employee(int employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }

    //public method to access salary of employee
    public double getSalary(){
        return this.salary;
    }

    //public method to modify salary of employee
    public void setSalary(double salary){
        this.salary = salary;
    }

    //Display details of employee
    public void displayEmployeeDetails(){
        System.out.println("Employee Details: ");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department Name: " + department);
        System.out.println("Salary : "+getSalary());
        System.out.println("-----------------------------");
    }
}
//Subclass to demonstrate access to public and protected members
class Manager extends Employee{
    private String teamName;
    public Manager(int employeeId, String department,String teamName) {
        super(employeeId, department);
        this.teamName = teamName;
    }
    public void displayManagerDetails(){
        System.out.println("Manager Details: ");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department Name: " + department);
        System.out.println("Team Name: " + teamName);
        System.out.println("Salary : "+getSalary());
        System.out.println("-----------------------------");
    }
}
