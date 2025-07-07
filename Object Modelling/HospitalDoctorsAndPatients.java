package ObjectModeling;
import java.util.*;

// Patient class: A patient can consult multiple doctors
class Patient {
    String name;
    List<Doctor> consultedDoctors = new ArrayList<>();

    Patient(String name) {
        this.name = name;
    }

    // Association: Patient consults a Doctor
    public void addDoctor(Doctor doctor) {
        consultedDoctors.add(doctor);
    }

    public void showDoctors() {
        System.out.println(name + " has consulted:");
        for (Doctor doc : consultedDoctors) {
            System.out.println("- Dr. " + doc.name);
        }
    }
}

// Doctor class: A doctor can see multiple patients
class Doctor {
    String name;
    List<Patient> patientsSeen = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    // Communication: Doctor consults a patient
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.name);
        patientsSeen.add(patient);
        patient.addDoctor(this);  // Bidirectional association
    }

    public void showPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        for (Patient p : patientsSeen) {
            System.out.println("- " + p.name);
        }
    }
}

// Hospital class contains list of doctors and patients
class Hospital {
    String hospitalName;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    Hospital(String name) {
        this.hospitalName = name;
    }

    public void addDoctor(Doctor doc) {
        doctors.add(doc);
    }

    public void addPatient(Patient pat) {
        patients.add(pat);
    }

    public void showAllDoctorsAndPatients() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.name);
        }

        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

// Main class to demonstrate the system
public class HospitalDoctorsAndPatients {
    public static void main(String[] args) {
        // Create Doctors
        Doctor d1 = new Doctor("Dr.Jhatka");
        Doctor d2 = new Doctor("Dr.Garg");

        // Create Patients
        Patient p1 = new Patient("Motu");
        Patient p2 = new Patient("Patlu");

        // Create Hospital and add staff
        Hospital hospital = new Hospital("Apollo Clinic");
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Consultations (Association + Communication)
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p2); // Sita consults both doctors

        // Show details
        System.out.println();
        d1.showPatients();
        d2.showPatients();
        System.out.println();
        p1.showDoctors();
        p2.showDoctors();
        System.out.println();
        hospital.showAllDoctorsAndPatients();
    }
}