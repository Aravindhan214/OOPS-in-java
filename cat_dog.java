import java.util.Scanner;

// Parent class
class Animal {
    String speciesName;
    
    Animal(String speciesName) {
        this.speciesName = speciesName;
    }
    
    void display() {
        System.out.println("Species: " + speciesName);
    }
}

// Child class Dog
class Dog extends Animal {
    String breed;
    
    Dog(String speciesName, String breed) {
        super(speciesName);
        this.breed = breed;
    }
    
    void display() {
        super.display();
        System.out.println("Breed: " + breed);
    }
}

// Child class Cat
class Cat extends Animal {
    String color;
    
    Cat(String speciesName, String color) {
        super(speciesName);
        this.color = color;
    }
    
    void display() {
        super.display();
        System.out.println("Color: " + color);
    }
}

// Main class
public class AnimalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dog details input
        String dogSpecies = sc.nextLine();
        String breed = sc.nextLine();

        // Cat details input
        String catSpecies = sc.nextLine();
        String color = sc.nextLine();
        
        // Create objects
        Dog dog = new Dog(dogSpecies, breed);
        Cat cat = new Cat(catSpecies, color);

        // Display details
        System.out.println("--- Dog Details ---");
        dog.display();

        System.out.println("\n--- Cat Details ---");
        cat.display();
    }
}
