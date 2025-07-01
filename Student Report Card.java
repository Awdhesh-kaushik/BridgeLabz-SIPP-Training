import java.util.ArrayList;
import java.util.Scanner;

public class StudentReportCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of the student");
        int total = sc.nextInt();
        for (int i = 0; i < total; i++) {
            sc.nextLine(); //fixed to consume left spaceover
            System.out.println("Enter the Name of "+(i+1)+"th student : ");
            String name = sc.nextLine();
            System.out.println("Enter the Roll no of "+(i+1)+"th student : ");
            int rollNo = sc.nextInt();
            Student student = new Student(name,rollNo);
            int[] marks = new int[5];
            for (int j = 0; j < 5; j++) {
                System.out.println("Enter the Marks of "+name+" in "+Student.subjects[j]+" : ");
                marks[j] = sc.nextInt();
            }
            student.StudentMarks(marks[0], marks[1], marks[2], marks[3], marks[4]);
        }
        Student.allStudentsMarks();
    }
}
class Student{
    String name;
    int rollNo;
    private String[] StudentNameAndMarks = new String[9];
    static String[] subjects = {"English","Mathematics","Physics","Chemistry","Computer Science"};
    static ArrayList<String[]> studentsDetails = new ArrayList<>();

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        studentsDetails.add(StudentNameAndMarks);
    }

    public void StudentMarks(int englishMarks, int mathsMarks, int physicsMarks, int chemistryMarks, int computerScienceMarks) {
        this.StudentNameAndMarks[0] = this.name;
        this.StudentNameAndMarks[1] = String.valueOf(this.rollNo);
        this.StudentNameAndMarks[2] = String.valueOf(englishMarks);
        this.StudentNameAndMarks[3] = String.valueOf(mathsMarks);
        this.StudentNameAndMarks[4] = String.valueOf(physicsMarks);
        this.StudentNameAndMarks[5] = String.valueOf(chemistryMarks);
        this.StudentNameAndMarks[6] = String.valueOf(computerScienceMarks);
        this.StudentNameAndMarks[7] = String.valueOf(this.average());
        this.StudentNameAndMarks[8] = this.Grade();
    }

    //calculate average of student in all 5 subjects
    public int average(){
        int sum = 0;
        for (int i = 2; i < 7; i++) {
            sum += Integer.parseInt(this.StudentNameAndMarks[i]);
        }
        return sum / 5;
    }

    public String Grade(){
        int average = this.average();
        if(average >= 90){
            return "A+";
        }
        else if(average >= 80){
            return "A";
        }
        else if(average >= 70){
            return "B+";
        }
        else if(average >= 60){
            return "B";
        }
        else if(average >= 50){
            return "C";
        }
        else if(average >= 40){
            return "D";
        }
        else{
            return "F";
        }
    }

    public static void allStudentsMarks() {
        System.out.println("All Student Details are: ");
        for (int i = 0; i < studentsDetails.size(); i++) {
            System.out.println(" Student name : "+studentsDetails.get(i)[0]);
            System.out.println(" Student roll no : "+studentsDetails.get(i)[1]);
            for (int j = 2; j < 7; j++) {
                System.out.println("Student Marks in "+subjects[j-2]+" is "+studentsDetails.get(i)[j]);
            }
            System.out.println("Student Average: "+studentsDetails.get(i)[7]);
            System.out.println("Student Grade: "+studentsDetails.get(i)[8]);
            System.out.println("------------------------------------------------------------");
        }
    }

}