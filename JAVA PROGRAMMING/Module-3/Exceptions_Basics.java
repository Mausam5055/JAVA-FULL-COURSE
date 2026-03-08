/*
 * -------------------------------------------------------------------------
 * MODULE 3: JAVA EXCEPTION HANDLING
 * -------------------------------------------------------------------------
 * 
 * 1. EXCEPTION: An event that disrupts the normal flow of the program.
 * 
 * 2. TRY-CATCH BLOCK: 
 *    - try: Contains code that might throw an exception.
 *    - catch: Handles the exception if it occurs.
 *    - finally: Executes code regardless of whether an exception occurred.
 * 
 * 3. THROW vs THROWS:
 *    - throw: Used to explicitly throw an exception.
 *    - throws: Used in method signature to declare that it might throw an exception.
 * 
 * 4. MULTIPLE CATCH BLOCKS: Handling different exceptions specifically.
 * 
 * -------------------------------------------------------------------------
 */

public class Exceptions_Basics {

    // Method using 'throws'
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            // Using 'throw' to manually trigger an exception
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        
        // --- Multiple Catch Blocks Example ---
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]); // ArrayIndexOutOfBoundsException
            
            int result = 10 / 0; // ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("Error: Something went wrong.");
        } finally {
            System.out.println("The 'try...catch' is finished.");
        }

        System.out.println("\n--- Throw & Throws Example ---");
        try {
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Handled Custom Exception: " + e.getMessage());
        }
    }
}
