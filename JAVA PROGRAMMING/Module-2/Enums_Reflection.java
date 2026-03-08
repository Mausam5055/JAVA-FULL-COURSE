/*
 * -------------------------------------------------------------------------
 * MODULE 2: ENUMS & REFLECTION BASICS
 * -------------------------------------------------------------------------
 * 
 * 1. ENUM: A special "class" that represents a group of constants.
 *    - Enums can have fields, constructors, and methods.
 *    - Values are fixed (like DAYS OF WEEK, COLORS).
 * 
 * 2. JAVA REFLECTION: A process of examining or modifying the runtime 
 *    behavior of a class.
 *    - Used to get information about classes, methods, fields at runtime.
 * 
 * -------------------------------------------------------------------------
 */

import java.lang.reflect.*;

// Enum with Constructor and Methods
enum Level {
    LOW(1), MEDIUM(2), HIGH(3);

    private int value;

    Level(int v) {
        this.value = v;
    }

    public int getValue() {
        return value;
    }
}

class Sample {
    public void hello() {
        System.out.println("Hello from Sample Class!");
    }
}

public class Enums_Reflection {
    public static void main(String[] args) {
        
        // --- Enum Usage ---
        Level myVar = Level.MEDIUM;
        System.out.println("Value of Medium: " + myVar.getValue());
        
        // Looping through Enum
        for (Level l : Level.values()) {
            System.out.println("Level: " + l + " (Value: " + l.getValue() + ")");
        }

        // --- Reflection Basics ---
        try {
            Sample s = new Sample();
            Class<?> obj = s.getClass();
            
            System.out.println("\n--- Reflection Info ---");
            System.out.println("Class Name: " + obj.getName());
            
            Method[] methods = obj.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println("Method found: " + m.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
