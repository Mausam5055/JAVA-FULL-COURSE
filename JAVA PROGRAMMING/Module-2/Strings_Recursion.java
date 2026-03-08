/*
 * -------------------------------------------------------------------------
 * MODULE 2: JAVA STRINGS & RECURSION
 * -------------------------------------------------------------------------
 * 
 * 1. JAVA STRINGS:
 *    - Strings are objects that represent a sequence of characters.
 *    - Strings are IMMUTABLE (cannot be changed once created).
 * 
 *    Common String Methods:
 *    - length(): Returns the number of characters.
 *    - toUpperCase() / toLowerCase(): Changes case.
 *    - charAt(index): Returns character at a specific position.
 *    - substring(start, end): Extracts a portion of the string.
 *    - equals(): Compares content (not reference).
 * 
 * 2. RECURSION:
 *    - A technique where a method calls itself.
 *    - It must have a 'Base Case' to stop the execution.
 *    - Widely used for problems like Factorial, Fibonacci.
 * 
 * -------------------------------------------------------------------------
 */

public class Strings_Recursion {
    
    // Recursive method to calculate Factorial
    // Factorial of 5 = 5 * 4 * 3 * 2 * 1 = 120
    static int factorial(int n) {
        if (n == 0 || n == 1) { // Base Case
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive Call
        }
    }

    public static void main(String[] args) {
        
        // --- String Examples ---
        String greeting = "Hello, Java!";
        System.out.println("String: " + greeting);
        System.out.println("Length: " + greeting.length());
        System.out.println("Uppercase: " + greeting.toUpperCase());
        System.out.println("Char at index 7: " + greeting.charAt(7));
        System.out.println("Substring (0-5): " + greeting.substring(0, 5));
        
        // String Comparison
        String s1 = "Java";
        String s2 = "java";
        System.out.println("Are s1 and s2 same? " + s1.equals(s2)); // False
        System.out.println("Ignore Case? " + s1.equalsIgnoreCase(s2)); // True

        // --- Recursion Example ---
        int number = 5;
        int result = factorial(number);
        System.out.println("\nFactorial of " + number + " is: " + result);
    }
}
