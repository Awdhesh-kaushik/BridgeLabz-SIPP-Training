package OOPConcepts;

import java.util.*;

// Faculty class represents a professor who can exist independently (Aggregation)
class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Faculty Name: " + name);
    }
}

// Department class represents a department that cannot exist without a University (Composition)
class Department {
    String departmentName;

    Department(String name) {
        this.departmentName = name;
    }

    public void showDepartmentInfo() {
        System.out.println("Department: " + departmentName);
    }
}

// University class demonstrates Composition with Departments and Aggregation with Faculty
class University {
    String universityName;
    List<Department> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.universityName = name;
    }

    // Composition: Departments are part of the University
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Aggregation: Faculties can exist independently, we just link them to the university
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showUniversityStructure() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (Department dept : departments) {
            dept.showDepartmentInfo();
        }

        System.out.println("Faculties:");
        for (Faculty fac : faculties) {
            fac.showInfo();
        }
    }

    // Simulate deletion of the University
    public void deleteUniversity() {
        System.out.println("\nDeleting university and all its departments...");
        departments.clear();  // Composition: departments are deleted with university
    }
}

// Main class to demonstrate
public class UniversityWithFacultiesAndDepartments {
    public static void main(String[] args) {
        // Create Faculty independently (Aggregation)
        Faculty f1 = new Faculty("Dr. Atmaram Tukaram Bhide");
        Faculty f2 = new Faculty("Dr. Krishnan Subramaniam Iyer");

        // Create University
        University uni = new University("GLA University");

        // Add Departments (Composition)
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");

        // Add Faculties (Aggregation)
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Display Structure
        uni.showUniversityStructure();

        // Delete University (removes departments but faculties still exist)
        uni.deleteUniversity();

        // Show remaining state (Faculties still exist, Departments removed)
        uni.showUniversityStructure();
    }
}