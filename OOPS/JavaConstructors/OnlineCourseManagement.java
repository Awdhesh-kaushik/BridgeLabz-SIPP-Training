package JavaConstructors;

public class OnlineCourseManagement {
    public static void main(String[] args) {

        //Creating object bTech
        Course bTech = new Course("Btech",4,84500.50);

        //Creating object bca
        Course bca = new Course("BCA",2,90000.20);

        //creating object mTech
        Course mTech = new Course("MTECH",4,250000.00);

        //Displaying details of object bTech
        bTech.displayCourseDetails();

        //Displaying details of object bca
        bca.displayCourseDetails();

        //Displaying details of object mTech
        mTech.displayCourseDetails();

        //Updating the name of institute
        Course.updateInstituteName("Gla Institute of Engineering and Technology");
    }
}
class Course{
    //Instance variables for storing name duration and fee of course
    String courseName;
    int duration;
    double fee;

    //Static variable that will store the institute name for all object
    static String instituteName = "GLA UNIVERSITY";

    //Method to display the course details
    void displayCourseDetails(){
        System.out.println("Course Name: " + this.courseName+" duration : "+this.duration+" and Price : " + this.fee);
    }

    //Static method for updating institute name for all objects
    static void updateInstituteName(String newInstituteName){
        String oldInstituteName = Course.instituteName;
        Course.instituteName = newInstituteName;
        System.out.println("Updated Institute name from "+oldInstituteName+" to "+newInstituteName);
    }

    //Constructor for initialising objects
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
}
