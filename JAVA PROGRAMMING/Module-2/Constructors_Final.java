/*
 * -------------------------------------------------------------------------
 * MODULE 2: JAVA CONSTRUCTORS & FINAL KEYWORD
 * -------------------------------------------------------------------------
 * 
 * 1. CONSTRUCTOR: A special method used to initialize objects.
 *    - It has the same name as the class.
 *    - It has no return type (not even void).
 *    - Called automatically when an object is created.
 * 
 *    Types:
 *    - Default Constructor (No arguments)
 *    - Parameterized Constructor (With arguments)
 * 
 * 2. CONSTRUCTOR OVERLOADING: Having multiple constructors with 
 *    different parameter lists.
 * 
 * 3. 'final' KEYWORD: Used to restrict the user.
 *    - Final Variable: Value cannot be changed (Constant).
 *    - Final Method: Cannot be overridden by subclasses.
 *    - Final Class: Cannot be inherited (extended).
 * 
 * -------------------------------------------------------------------------
 */

class Car {
    String model;
    final int speedLimit = 120; // Final Variable (Constant)

    // Default Constructor
    Car() {
        System.out.println("A car object is being created.");
        model = "Unknown";
    }

    // Parameterized Constructor (Overloading)
    Car(String modelName) {
        this.model = modelName;
    }

    // Final Method (Cannot be overridden)
    final void drive() {
        System.out.println("Driving the " + model + " at speed " + speedLimit);
    }
}

// Final Class (Cannot be inherited)
final class LuxuryCar extends Car {
    LuxuryCar(String name) {
        super(name);
    }
}

public class Constructors_Final {
    public static void main(String[] args) {
        
        // calling Default Constructor
        Car c1 = new Car();
        System.out.println("Model 1: " + c1.model);

        // calling Parameterized Constructor
        Car c2 = new Car("Tesla Model S");
        System.out.println("Model 2: " + c2.model);
        
        c2.drive();
        
        // LuxuryCar lc = new LuxuryCar("Ferrari"); // Fine
    }
}
