package Inheritance;

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal Dog1 = new Dog("Shehbaaz Sharif", 12);
        Animal Dog2 = new Dog("Asim Munir", 6);
        Animal Dog3 = new Dog("Hafiz Saeed", 3);
        Animal Cat1 = new Cat("Luna", 7);
        Animal Cat2 = new Cat("Nimbus", 8);  // Fixed: was Bird
        Animal Bird = new Bird("Sparrow", 9);

        // Calling makeSound() on all objects to demonstrate polymorphism
        Dog1.makeSound();
        Dog2.makeSound();
        Dog3.makeSound();
        Cat1.makeSound();
        Cat2.makeSound();
        Bird.makeSound();
    }
}

// Superclass
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal Sound is : ");
    }
}

// Dog subclass
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(this.name + " barks : WOOF WOOF!");
    }
}

// Cat subclass
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(this.name + " meows : MEOW MEOW!");
    }
}

// Bird subclass
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(this.name + " chirps : TWEET TWEET!");
    }
}