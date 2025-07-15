package OOPPillars;

import java.util.ArrayList;
import java.util.List;

// Interface for Medical Record
interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

// Abstract Class
abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract billing method
    public abstract double calculateBill();

    // Concrete method to get details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (diagnosis != null) {
            System.out.println("Diagnosis: " + diagnosis);
        }
    }

    // Encapsulation: securing diagnosis and medical history
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void addToMedicalHistory(String entry) {
        medicalHistory.add(entry);
    }

    public List<String> getMedicalHistory() {
        return new ArrayList<>(medicalHistory);
    }
}

// InPatient Subclass
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;

    private List<String> records = new ArrayList<>();

    public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    public void addRecord(String record) {
        records.add(record);
        addToMedicalHistory(record); // also add to protected history
    }

    public List<String> viewRecords() {
        return records;
    }
}

// OutPatient Subclass
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    private List<String> records = new ArrayList<>();

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        records.add(record);
        addToMedicalHistory(record);
    }

    public List<String> viewRecords() {
        return records;
    }
}

// Main class
public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = new Patient[2];

        patients[0] = new InPatient(101, "XYZ", 45, 4, 1500);
        patients[1] = new OutPatient(102, "ABC", 30, 800);

        for (Patient p : patients) {
            p.setDiagnosis("General Checkup");
            p.getPatientDetails();
            System.out.println("Bill Amount: ₹" + p.calculateBill());

            // Polymorphism using MedicalRecord
            if (p instanceof MedicalRecord) {
                MedicalRecord mr = (MedicalRecord) p;
                mr.addRecord("Blood Test: Normal");
                mr.addRecord("X-Ray: Clear");

                System.out.println("Medical Records:");
                for (String record : mr.viewRecords()) {
                    System.out.println("- " + record);
                }
            }

            System.out.println("------------------------------------------------");
        }
    }
}