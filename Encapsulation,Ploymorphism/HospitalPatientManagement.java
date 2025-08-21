abstract class Patient {
    private String patientId, name;
    private int age;

    public Patient(String id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println(name + " - Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    public InPatient(String id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() { return 5000; }
    public void addRecord(String r) {}
    public String viewRecords() { return "Inpatient Records"; }
}
