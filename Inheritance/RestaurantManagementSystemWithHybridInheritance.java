package Inheritance;

// Superclass: Represents a general person in the restaurant
class Persons {
    protected String name;
    protected int id;

    // Constructor to initialize name and ID
    public Persons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display person's basic info
    public void showInfo() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}

// Interface: Worker, enforces the performDuties() method for all workers
interface Worker {
    void performDuties(); // Abstract method to be implemented by all workers
}

// Chef class: Inherits from Persons and implements Worker
class Chef extends Persons implements Worker {
    private String speciality;

    // Constructor to initialize chef-specific details
    public Chef(String name, int id, String speciality) {
        super(name, id); // Call to superclass constructor
        this.speciality = speciality;
    }

    // Implementation of performDuties() for a Chef
    @Override
    public void performDuties() {
        System.out.println("\n--- Chef Duties ---");
        showInfo(); // Display basic info from superclass
        System.out.println("Speciality : " + speciality);
        System.out.println("Duties     : Prepares delicious dishes and manages kitchen.");
    }
}

// Waiter class: Inherits from Persons and implements Worker
class Waiter extends Persons implements Worker {
    private String shift;

    // Constructor to initialize waiter-specific details
    public Waiter(String name, int id, String shift) {
        super(name, id); // Call to superclass constructor
        this.shift = shift;
    }

    // Implementation of performDuties() for a Waiter
    @Override
    public void performDuties() {
        System.out.println("\n--- Waiter Duties ---");
        showInfo(); // Display basic info from superclass
        System.out.println("Shift  : " + shift);
        System.out.println("Duties : Takes orders, serves food, and attends customers.");
    }
}

// Main class to run the program and demonstrate hybrid inheritance
public class RestaurantManagementSystemWithHybridInheritance {
    public static void main(String[] args) {
        // Create Chef object with real Indian chef
        Chef chef = new Chef("Vikas Khanna", 101, "Indian Cuisine");

        // Create Waiter object with international waiter
        Waiter waiter = new Waiter("Carlos Rivera", 202, "Evening");

        // Display duties of both Chef and Waiter
        chef.performDuties();
        waiter.performDuties();
    }
}