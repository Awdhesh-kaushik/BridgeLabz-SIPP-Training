package JavaClassAndObject;
public class EmployeeDetails{
    
    public static void main(String[] args){
        Employee Abhishek = new Employee();   //Creation of object Abhishek of class Employee
        
        // Assigning the value to the object Abhishek
        Abhishek.name = "Abhishek Sharma";
        Abhishek.id = 1;
        Abhishek.salary = 150000.50;

        //To display object Abhishek detail
        Abhishek.display();
    }
}
class Employee{
    String name;   // Storing name of Employee
    int id;        // Storing id of the Employee
    double salary; // Storing salary of the Employee
    
    // this method displays the Details of the Employee
    void display(){
        System.out.println("Name Of Employee is "+this.name+" with id "+this.id+" having salary "+this.salary);
    }
}
