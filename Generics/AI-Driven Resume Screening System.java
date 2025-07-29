abstract class JobRole {
    String candidateName;
    public JobRole(String candidateName) { this.candidateName = candidateName; }
    public abstract void evaluate();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String name) { super(name); }
    public void evaluate() { System.out.println("Evaluating SE resume: " + candidateName); }
}

class DataScientist extends JobRole {
    public DataScientist(String name) { super(name); }
    public void evaluate() { System.out.println("Evaluating DS resume: " + candidateName); }
}

class Resume<T extends JobRole> {
    private T applicant;
    public Resume(T applicant) { this.applicant = applicant; }
    public void process() { applicant.evaluate(); }

    public static void screenAll(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            role.evaluate();
        }
    }
}
