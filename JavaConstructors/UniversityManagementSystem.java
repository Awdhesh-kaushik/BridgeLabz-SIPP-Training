package JavaConstructors;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create Student object
        Student s1 = new Student(101, "Nobita Nobi","Artificial Intelligence with Machiene Learning");
        s1.setCGPA(8.5);
        s1.displayDetails();

        // Create PostgraduateStudent object
        PostgraduateStudent pg = new PostgraduateStudent(201, "Hidetoshi Dekisugi", "Computer Science");
        pg.setCGPA(9.1); // inherited from Student class
        pg.displayPostGraduateStudentDetails();
    }
}
class Student{

    public int rollNumber;
    protected String name;
    public String specialization;
    private double CGPA;

    //Constructor to initialize roll number and name
    public Student(int rollNumber, String name,String specialization) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.specialization = specialization;
    }

    //public method to access CGPA
    public double getCGPA(){
        return this.CGPA;
    }

    //public method to modify CGPA
    public void setCGPA(double CGPA){
        this.CGPA = CGPA;
    }

    //Display student information or details
    public void displayDetails(){
        System.out.println("Roll Number : "+this.rollNumber);
        System.out.println("Name : "+this.name);
        System.out.println("Specialization : "+this.specialization);
        System.out.println("CGPA : "+this.CGPA);
        System.out.println("-----------------------------");
    }
}
class PostgraduateStudent extends Student{

    public PostgraduateStudent(int rollNumber, String name,String specialization) {
        super(rollNumber, name,specialization);
    }

    public void displayPostGraduateStudentDetails(){
        System.out.println("Postgraduate Student Details : ");
        System.out.println("Roll Number : "+this.rollNumber);
        System.out.println("Name : "+this.name);
        System.out.println("Specialization : "+this.specialization);
        System.out.println("CGPA : "+getCGPA());
        System.out.println("-----------------------------");
    }
}