package JavaConstructors;
// Person class with a copy constructor
class Person {
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonCopy{

    // Main method to test the class
    public static void main(String[] args) {

        Person original = new Person("Alice", 25);
        Person copy = new Person(original);

        System.out.println("Original Person:");
        original.display();
        System.out.println("\nCopied Person:");
        copy.display();
    }
}