import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineQuizPlatform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ResultProcessor.QuestionsFill();    //For filling Questions

        //Taking input for total number of student
        System.out.println("Enter total number of Students : ");
        int noOfStudents = sc.nextInt();
        sc.nextLine();  // consume leftover newline
        for (int i = 0; i < noOfStudents ; i++) {
            String[] userAnswers = new String[10];       //Stores Student answer and later we pass it as parameter

            //Taking input for student name
            System.out.println("Enter " + (i + 1) + "th student name : ");
            String studentName = sc.nextLine();

            //This loop will print Question and takes user input in userAnswer array
            for (int j = 0; j < 10; j++) {
                System.out.println(ResultProcessor.Questions[j]);
                System.out.println("Choose one of the following options: A, B, C, or D");
                String option = sc.nextLine();        //Taking User input for user answer for the question
                userAnswers[j] = option;
            }

            //Creates object of ResultProcessor class and passing arguments student name and his/her answers for each question
            ResultProcessor result = new ResultProcessor(studentName, userAnswers);
        }

        //Print the details of all student name marks correct answers,incorrect answers,marks grades
        ResultProcessor.displayStudentsMarks();

    }
}
class ResultProcessor{
    String studentName;                //Storing Student Name
    static String[] Questions = new String[10];         //Storing Question of the exam
    static String[] correctAnswers = new String[10];    //Storing correct answer for each Question
    String[] userAnswers;              //Storing student answer for each question
    int score = 0;                     // stores the score of student
    String grade;                      //Storing grade of student
    String[] detailOfStudent = new String[3];  // Storing name,marks,grade of student
    static List<String[]> StudentsMarks = new ArrayList<>();         // Stores all student name,marks,correct answer,incorrect answer,score,grade

    //Constructor for Initialising objects
    public ResultProcessor(String studentName,String[] userAnswers) {
        this.studentName = studentName;
        this.userAnswers = userAnswers;
        this.detailOfStudent[0] = studentName;
        this.detailOfStudent[1] = String.valueOf(this.calculateScores());
        this.detailOfStudent[2] = this.grade();
        ResultProcessor.StudentsMarks.add(this.detailOfStudent);
    }

    //Calculating Score of student
    public int calculateScores() {
        for (int i = 0; i < userAnswers.length; i++) {
            if(userAnswers[i].equals(correctAnswers[i])) {
                score+=10;                     //10 marks for each correct answers
            }
        }
        return score;
    }

    //Method for Calculating grade of student
    public String grade() {
        if(score>=90){
            return "A+";
        }
        else if(score>=80){
            return "A";
        }
        else if(score>=70){
            return "B+";
        }
        else if(score>=60){
            return "B";
        }
        else if(score>=50){
            return "C";
        }
        else if(score>=40){
            return "D";
        }
        else{
            return "F";
        }
    }

    //Compare student's all answer as correct or incorrect
    public void compareAnswers(){
        for (int i = 0; i < userAnswers.length; i++) {
            if(userAnswers[i].equals(correctAnswers[i])) {
                System.out.println("Your Answer for the "+(i+1)+"th Question is correct");
            }
            else{
                System.out.println("Your Answer for the "+(i+1)+"th Question is incorrect and its correct answer is : "+correctAnswers[i]);
            }
        }
    }

    //Method for displaying details of student
    public void detailOfStudent(){
        System.out.println("Details of Student :");
        System.out.println("Name of Student : "+this.studentName);
        System.out.println("Total Correct Answers are : "+(Integer.parseInt(this.detailOfStudent[1]))/10);
        System.out.println("Total Incorrect Answers are : "+(10-((Integer.parseInt(this.detailOfStudent[1]))/10)));
        System.out.println("Marks of Student : "+this.detailOfStudent[1]);
        System.out.println("Grade of Student : "+this.detailOfStudent[2]);
        this.compareAnswers();                                //For printing Student's correct and incorrect chosen option
        System.out.println("-------------------------------------------------------------------");
    }

    //Method for displaying all Student marks
    static void displayStudentsMarks(){
        System.out.println("Details of All Student :");
        for (int i = 0; i < StudentsMarks.size(); i++) {
            System.out.println("Name of Student : "+StudentsMarks.get(i)[0]);
            System.out.println("Total Correct Answers are : "+(Integer.parseInt(StudentsMarks.get(i)[1]))/10);
            System.out.println("Total Incorrect Answers are : "+(10-((Integer.parseInt(StudentsMarks.get(i)[1]))/10)));
            System.out.println("Marks of Student : "+StudentsMarks.get(i)[1]);
            System.out.println("Grade of Student : "+StudentsMarks.get(i)[2]);
            System.out.println("------------------------------------------------------------------");
        }
    }

    //Method for filling question in the array and also filling correct answers
    static void QuestionsFill(){
        Questions[0] = "1. What is the capital of India?\nA. Mumbai\nB. Delhi\nC. Kolkata\nD. Chennai";
        Questions[1] = "2. Who is known as the father of computers?\nA. Charles Babbage\nB. Alan Turing\nC. Tim Berners-Lee\nD. Bill Gates";
        Questions[2] = "3. What is the chemical symbol for water?\nA. O2\nB. H2O\nC. CO2\nD. HO2";
        Questions[3] = "4. Which planet is known as the Red Planet?\nA. Earth\nB. Mars\nC. Jupiter\nD. Venus";
        Questions[4] = "5. What is the largest mammal?\nA. Elephant\nB. Giraffe\nC. Blue Whale\nD. Hippopotamus";
        Questions[5] = "6. Which language is used to write Android apps?\nA. Kotlin\nB. Python\nC. Swift\nD. Ruby";
        Questions[6] = "7. Who wrote 'Romeo and Juliet'?\nA. William Wordsworth\nB. William Shakespeare\nC. Charles Dickens\nD. Jane Austen";
        Questions[7] = "8. What is the boiling point of water?\nA. 90°C\nB. 80°C\nC. 100°C\nD. 120°C";
        Questions[8] = "9. Which gas do plants use for photosynthesis?\nA. Oxygen\nB. Nitrogen\nC. Hydrogen\nD. Carbon Dioxide";
        Questions[9] = "10. What is the square root of 144?\nA. 10\nB. 11\nC. 12\nD. 13";

        correctAnswers[0] = "B";
        correctAnswers[1] = "A";
        correctAnswers[2] = "B";
        correctAnswers[3] = "B";
        correctAnswers[4] = "C";
        correctAnswers[5] = "A";
        correctAnswers[6] = "B";
        correctAnswers[7] = "C";
        correctAnswers[8] = "D";
        correctAnswers[9] = "C";
    }
}