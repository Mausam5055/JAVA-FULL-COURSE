/*
 * -------------------------------------------------------------------------
 * MODULE 2: ABSTRACTION (ABSTRACT CLASSES & INTERFACES)
 * -------------------------------------------------------------------------
 * 
 * 1. ABSTRACTION: Hiding internal details and showing only functionality.
 * 
 * 2. ABSTRACT CLASS:
 *    - Declared with 'abstract' keyword.
 *    - Can have both abstract (no body) and concrete (with body) methods.
 *    - CANNOT be instantiated (cannot create objects).
 * 
 * 3. INTERFACE:
 *    - A completely "abstract class" (pre-Java 8).
 *    - Used to achieve multiple inheritance in Java.
 *    - Methods are 'public' and 'abstract' by default.
 *    - Classes 'implement' interfaces.
 * 
 * -------------------------------------------------------------------------
 */

// Abstract Class
abstract class Shape {
    String color;

    // Abstract method (no implementation)
    abstract double area();

    // Concrete method
    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(double r) {
        this.radius = r;
        this.color = "Red";
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Interface
interface Drawable {
    void draw(); // Abstract method
}

interface Printable {
    void print();
}

// Multiple Inheritance via Interfaces
class Rectangle implements Drawable, Printable {
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
    public void print() {
        System.out.println("Printing rectangle details...");
    }
}

public class Abstractions_Interfaces {
    public static void main(String[] args) {
        
        Circle c = new Circle(5.0);
        c.displayColor();
        System.out.println("Area of Circle: " + c.area());
        
        Rectangle r = new Rectangle();
        r.draw();
        r.print();
    }
}
