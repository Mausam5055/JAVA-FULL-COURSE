/*
 * -------------------------------------------------------------------------
 * MODULE 2: INHERITANCE & POLYMORPHISM
 * -------------------------------------------------------------------------
 * 
 * 1. INHERITANCE: One class acquires properties (fields/methods) of another.
 *    - Super Class (Parent): The class being inherited from.
 *    - Sub Class (Child): The class that inherits.
 *    - Keyword: 'extends'.
 * 
 * 2. 'super' KEYWORD: Refers to the immediate parent class object.
 *    - Used to call parent constructors/methods.
 * 
 * 3. POLYMORPHISM: "Many forms".
 *    A. COMPILE-TIME (Overloading): Same method name, different parameters.
 *    B. RUN-TIME (Overriding): Subclass provides a specific implementation 
 *       for a method already defined in its parent.
 * 
 * -------------------------------------------------------------------------
 */

// Parent Class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
    
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Child Class (Inheritance)
class Cat extends Animal {
    
    // Method Overriding (Run-time Polymorphism)
    @Override
    void makeSound() {
        System.out.println("Cat says: Meow Meow");
    }

    void displayParent() {
        super.makeSound(); // Calls parent's version
    }
}

// Example of Compile-time Polymorphism (Overloading)
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) { // Overloaded method
        return a + b + c;
    }
}

public class Inheritance_Polymorphism {
    public static void main(String[] args) {
        
        // Inheritance & Overriding
        Animal myAnimal = new Cat(); // Dynamic Method Dispatch
        myAnimal.makeSound(); // Prints Cat's sound
        
        Cat myCat = new Cat();
        myCat.eat(); // Inherited from Animal
        myCat.displayParent(); // Calls super.makeSound()
        
        // Overloading
        Calculator calc = new Calculator();
        System.out.println("Sum (2 nos): " + calc.add(10, 20));
        System.out.println("Sum (3 nos): " + calc.add(10, 20, 30));
    }
}
