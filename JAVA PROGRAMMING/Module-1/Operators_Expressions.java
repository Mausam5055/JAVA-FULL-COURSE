/*
 * -------------------------------------------------------------------------
 * MODULE 1: JAVA OPERATORS, EXPRESSIONS & BLOCKS
 * -------------------------------------------------------------------------
 * 
 * 1. OPERATORS: Symbols that perform operations on variables/values.
 *    - Arithmetic: +, -, *, /, %, ++, --
 *    - Assignment: =, +=, -=, *=, /=
 *    - Comparison: ==, !=, >, <, >=, <=
 *    - Logical: && (AND), || (OR), ! (NOT)
 * 
 * 2. EXPRESSIONS: A combination of variables, constants, and operators 
 *    that evaluates to a value. 
 *    Example: int sum = a + b;
 * 
 * 3. BLOCKS: A group of statements enclosed in curly braces { }.
 *    It defines the scope of variables.
 * 
 * -------------------------------------------------------------------------
 */

public class Operators_Expressions {
    public static void main(String[] args) {
        
        // Arithmetic Operators
        int a = 10;
        int b = 3;
        System.out.println("Sum: " + (a + b));
        System.out.println("Reminder: " + (a % b)); // Modulo operator
        
        // Relational / Comparison Operators
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a greater than b? " + (a > b));
        
        // Logical Operators
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println("Logical AND (&&): " + (condition1 && condition2));
        System.out.println("Logical OR (||): " + (condition1 || condition2));
        
        // Increment and Decrement
        int x = 5;
        x++; // Post-increment (x becomes 6)
        System.out.println("Value after increment: " + x);
        
        // This is a CODE BLOCK
        {
            int blockVar = 100; // Local within this block
            System.out.println("Inside Block: " + blockVar);
        }
        // blockVar cannot be accessed here (out of scope)
    }
}
