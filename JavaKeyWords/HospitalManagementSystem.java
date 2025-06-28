package JavaKeyWords;

// Main class to test the Hospital Management System
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating patient objects using the constructor
        Patient p1 = new Patient("Pikachu", 45, "Fever", "P001");
        Patient p2 = new Patient("Chikorita", 30, "Cough", "P002");

        // Using instanceof to ensure object is of Patient type before displaying info
        if (p1 instanceof Patient) {
            p1.displayPatientInfo();
        }
        if (p2 instanceof Patient) {
            p2.displayPatientInfo();
        }

        // Calling static method to display total number of patients
        Patient.getTotalPatients();
    }
}

// Class to represent a Patient in the hospital
class Patient {
    // Instance variables
    protected String name;          // Patient's name
    protected int age;              // Patient's age
    protected String ailment;       // Disease or health issue
    final String patientID;         // Unique patient ID (final - cannot be changed)

    // Static variables shared across all patient objects
    static String hospitalName = "AIIMS Delhi";  // Common hospital name
    static int totalPatients = 0;                // Counter to track total patients

    // Constructor using 'this' keyword to initialize instance variables
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++; // Increments total patient count when a new patient is created
    }

    // Static method to display total number of admitted patients
    public static void getTotalPatients() {
        System.out.println("Total Patients in " + hospitalName + ": " + totalPatients);
    }

    // Method to display patient details
    public void displayPatientInfo() {
        System.out.println("Patient Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Ailment: " + this.ailment);
        System.out.println("Patient ID: " + this.patientID);
        System.out.println("Hospital: " + hospitalName);
        System.out.println("------------------------------------------------");
    }
}
