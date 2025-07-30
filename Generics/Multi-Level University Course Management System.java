abstract class CourseType {
    String title;
    public CourseType(String title) { this.title = title; }
    public abstract void describe();
}

class ExamCourse extends CourseType {
    public ExamCourse(String title) { super(title); }
    public void describe() { System.out.println("Exam-based course: " + title); }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String title) { super(title); }
    public void describe() { System.out.println("Assignment-based course: " + title); }
}

class Course<T extends CourseType> {
    private T courseDetail;
    public Course(T courseDetail) { this.courseDetail = courseDetail; }
    public void showDetails() { courseDetail.describe(); }

    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) c.describe();
    }
}
