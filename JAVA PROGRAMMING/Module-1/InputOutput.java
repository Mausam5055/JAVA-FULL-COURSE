/*
 * -------------------------------------------------------------------------
 * MODULE 1: JAVA INPUT & OUTPUT
 * -------------------------------------------------------------------------
 * 
 * 1. OUTPUT (Writing to the Console):
 *    - System.out.print(): Prints text on the same line.
 *    - System.out.println(): Prints text and moves to a new line.
 *    - System.out.printf(): Prints formatted data (like C style).
 * 
 *    Format specifiers:
 *    %d -> int
 *    %s -> String
 *    %f -> float/double
 * 
 * 2. INPUT (Reading from the Console):
 *    Java uses the 'Scanner' class for reading input.
 *    It is found in the 'java.util' package.
 * 
 *    - nextInt(): Reads an integer.
 *    - nextFloat(): Reads a float.
 *    - nextLine(): Reads a whole line of text.
 *    - next(): Reads a single word.
 * 
 * -------------------------------------------------------------------------
 */

import java.util.Scanner; // Required import for Scanner

public class InputOutput {
    public static void main(String[] args) {
        
        // Creating a Scanner object
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Reading User Input ---");
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Reads full name
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();
        
        // Outputting results
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        // Using printf for formatting (2 decimal places for GPA)
        System.out.printf("GPA: %.2f\n", gpa);

        // Closing the scanner is a good practice
        sc.close(); 
    }
}
