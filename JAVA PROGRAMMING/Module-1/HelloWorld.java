/*
 * -------------------------------------------------------------------------
 * MODULE 1: JAVA HELLO WORLD & COMMENTS
 * -------------------------------------------------------------------------
 * 
 * This file explains how a simple Java program is structured.
 * 
 * 1. Class: Everything in Java must be inside a class.
 *    The class name must match the filename (e.g., HelloWorld.java).
 * 
 * 2. main method: The entry point of any Java program.
 *    public: accessible from anywhere.
 *    static: can be run without creating an object.
 *    void: does not return any value.
 *    String[] args: handles command-line arguments.
 * 
 * 3. System.out.println: Used to print text to the console.
 * 
 * -------------------------------------------------------------------------
 */

public class HelloWorld { // Class name matches the filename

    // This is a SINGLE-LINE comment (Used for short notes)

    /*
     * This is a MULTI-LINE comment
     * Used for detailed explanations
     * spanning multiple lines.
     */

    /**
     * This is a DOCUMENTATION comment
     * Used to create HTML documentation for the code (JavaDoc).
     */

    public static void main(String[] args) {
        // Printing "Hello World" to the console
        System.out.println("Hello, World!"); 

        System.out.println("Learning Java is fun!");
    }
}
