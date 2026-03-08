/*
 * -------------------------------------------------------------------------
 * MODULE 2: ADVANCED CLASSES (INNER, NESTED, ANONYMOUS, SINGLETON)
 * -------------------------------------------------------------------------
 * 
 * 1. INNER CLASS: A class defined inside another class.
 * 2. STATIC NESTED CLASS: A static class defined inside another.
 * 3. ANONYMOUS CLASS: A class that has no name, used to override 
 *    methods of a class or interface on the fly.
 * 4. SINGLETON PATTERN: Ensures a class has ONLY ONE instance.
 * 
 * -------------------------------------------------------------------------
 */

class Outer {
    int x = 10;

    // Inner Class
    class Inner {
        void display() {
            System.out.println("Outer x: " + x);
        }
    }

    // Static Nested Class
    static class StaticNested {
        void message() {
            System.out.println("Hello from Static Nested Class!");
        }
    }
}

// Singleton Class
class Database {
    private static Database instance;
    private Database() {} // Private constructor

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
    
    void connect() {
        System.out.println("Connected to Database.");
    }
}

// Interface for Anonymous Class example
interface Greeting {
    void sayHello();
}

public class Advanced_Classes {
    public static void main(String[] args) {
        
        // --- Inner Class ---
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
        
        // --- Static Nested Class ---
        Outer.StaticNested nested = new Outer.StaticNested();
        nested.message();
        
        // --- Anonymous Class ---
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Class!");
            }
        };
        g.sayHello();
        
        // --- Singleton Pattern ---
        Database db = Database.getInstance();
        db.connect();
    }
}
