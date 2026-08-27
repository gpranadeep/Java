// Parent class used for single, multilevel, and hierarchical inheritance.
class Animal {
    protected String name;
    Animal(String name) {
        this.name = name;
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
}

// SINGLE INHERITANCE: Dog inherits members of one parent class, Animal.
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

// MULTILEVEL INHERITANCE: Puppy inherits from Dog, which already inherits Animal.
class Puppy extends Dog {
    Puppy(String name) {
        super(name);
    }

    void play() {
        System.out.println(name + " is playing.");
    }
}

// HIERARCHICAL INHERITANCE: Cat and Dog are different children of Animal.
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println(name + " is meowing.");
    }
}

// Interfaces declare independent capabilities, not shared class state.
interface Telephone {
    void call();
}

interface Camera {
    void takePhoto();
}

// MULTIPLE INHERITANCE (via interfaces): one class implements both capabilities.
class SmartPhone implements Telephone, Camera {
    public void call() {
        System.out.println("SmartPhone is making a call.");
    }

    public void takePhoto() {
        System.out.println("SmartPhone is taking a photo.");
    }
}

class Vehicle {
    protected String model;

    Vehicle(String model) {
        this.model = model;
    }

    void start() {
        System.out.println(model + " is starting.");
    }
}

interface Rechargeable {
    void charge();
}

// HYBRID INHERITANCE: ElectricCar extends Vehicle and implements Rechargeable.
class ElectricCar extends Vehicle implements Rechargeable {
    ElectricCar(String model) {
        super(model);
    }

    public void charge() {
        System.out.println(model + " is charging.");
    }

    void showType() {
        System.out.println(model + " is an electric car.");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Java Inheritance Demonstration ===\n");
        System.out.println("1. Single Inheritance");
        Dog dog = new Dog("Bittu");
        dog.eat();                 // inherited from Animal
        dog.bark();                // defined in Dog

        System.out.println("\n2. Multilevel Inheritance");
        Puppy puppy = new Puppy("Sweety");
        puppy.eat();               // inherited through Dog from Animal
        puppy.bark();              // inherited from Dog
        puppy.play();              // defined in Puppy

        System.out.println("\n3. Hierarchical Inheritance");
        Cat cat = new Cat("Max ");
        cat.eat();                 // inherited from Animal
        cat.meow();                // defined in Cat

        System.out.println("\n4. Multiple Inheritance Through Interfaces");
        SmartPhone phone = new SmartPhone();
        phone.call();              // from Telephone interface
        phone.takePhoto();         // from Camera interface

        System.out.println("\n5. Hybrid Inheritance");
        ElectricCar electricCar = new ElectricCar("Tesla Model 3");
        electricCar.start();       // inherited from Vehicle
        electricCar.charge();      // from Rechargeable interface
        electricCar.showType();    // defined in ElectricCar
    }
}
