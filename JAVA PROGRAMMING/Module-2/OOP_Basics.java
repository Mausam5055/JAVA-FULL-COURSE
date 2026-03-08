/*
 * -------------------------------------------------------------------------
 * MODULE 2: JAVA OOP BASICS
 * -------------------------------------------------------------------------
 * 
 * 1. CLASS: A blueprint or template for creating objects.
 *    It contains fields (variables) and methods (functions).
 * 
 * 2. OBJECT: An instance of a class.
 *    It has state (attributes) and behavior (methods).
 * 
 * 3. METHODS: Blocks of code that perform specific tasks.
 *    Syntax: [AccessModifier] [ReturnType] [MethodName]([Parameters]) { ... }
 * 
 * 4. 'this' KEYWORD: Refers to the current object in a method or constructor.
 *    Used to resolve ambiguity between instance variables and parameters.
 * 
 * 5. 'instanceof' OPERATOR: Used to check if an object belongs to a 
 *    specific class or interface.
 * 
 * -------------------------------------------------------------------------
 */

class Dog {
    // Instance Variables (State)
    String breed;
    int age;
    String color;

    // Method (Behavior)
    void bark() {
        System.out.println("Woof! Woof!");
    }

    // Method with 'this' keyword
    void setDetails(String breed, int age, String color) {
        this.breed = breed; // 'this.breed' is the instance variable
        this.age = age;     // 'age' is the parameter
        this.color = color;
    }

    void display() {
        System.out.println("Breed: " + breed + ", Age: " + age + ", Color: " + color);
    }
}

public class OOP_Basics {
    public static void main(String[] args) {
        
        // Creating an Object (Instantiation)
        Dog myDog = new Dog();
        
        // Calling methods
        myDog.setDetails("Golden Retriever", 3, "Golden");
        myDog.display();
        myDog.bark();
        
        // Using 'instanceof'
        System.out.println("Is myDog an instance of Dog? " + (myDog instanceof Dog));
    }
}
