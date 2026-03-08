/*
 * -------------------------------------------------------------------------
 * MODULE 1: JAVA VARIABLES & DATA TYPES
 * -------------------------------------------------------------------------
 * 
 * 1. VARIABLES: Containers for storing data values.
 *    Syntax: [DataType] [VariableName] = [Value];
 * 
 * 2. DATA TYPES IN JAVA:
 * 
 *    A. PRIMITIVE DATA TYPES (Built-in, basic types)
 *       - byte: 1 byte (-128 to 127)
 *       - short: 2 bytes
 *       - int: 4 bytes (Most commonly used for numbers)
 *       - long: 8 bytes (Use 'L' suffix, e.g., 50L)
 *       - float: 4 bytes (Use 'f' suffix, e.g., 5.75f)
 *       - double: 8 bytes (Used for decimal numbers)
 *       - boolean: 1 bit (true or false)
 *       - char: 2 bytes (Stores a single character, e.g., 'A')
 * 
 *    B. NON-PRIMITIVE DATA TYPES (Reference types)
 *       - String: Stores text (e.g., "Hello")
 *       - Arrays, Classes, Interfaces.
 * 
 * 3. NAMING CONVENTIONS:
 *    - Use camelCase (e.g., myVariableName)
 *    - Cannot start with a number.
 *    - Case sensitive (age and Age are different).
 * 
 * -------------------------------------------------------------------------
 */

public class Variables_DataTypes {
    public static void main(String[] args) {
        
        // --- Examples of Primitive Types ---
        int studentAge = 20; // integer (whole number)
        float floatGrade = 89.5f; // fractional number
        char gradeLetter = 'A'; // character
        boolean isEnrolled = true; // boolean
        double largeDecimal = 1234.56789; // high precision decimal
        
        // --- Example of Non-Primitive Type ---
        String studentName = "John Doe"; // String

        // Outputting values
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Grade: " + floatGrade);
        System.out.println("Grade Letter: " + gradeLetter);
        System.out.println("Enrolled: " + isEnrolled);
        System.out.println("Precision Double: " + largeDecimal);
    }
}
