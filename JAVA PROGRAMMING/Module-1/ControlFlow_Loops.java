/*
 * -------------------------------------------------------------------------
 * MODULE 1: JAVA FLOW CONTROL (LOOPS)
 * -------------------------------------------------------------------------
 * 
 * 1. FOR LOOP: Used when you know how many times the code should run.
 *    Syntax: for (init; condition; increment) { ... }
 * 
 * 2. WHILE LOOP: Used when you don't know the exact number of iterations.
 *    Syntax: while (condition) { ... }
 * 
 * 3. FOR-EACH LOOP: Used exclusively to loop through elements in an array.
 *    Syntax: for (Type var : arrayName) { ... }
 * 
 * 4. BREAK & CONTINUE:
 *    - break: Stops the loop entirely.
 *    - continue: Skips the current iteration and goes to the next one.
 * 
 * -------------------------------------------------------------------------
 */

public class ControlFlow_Loops {
    public static void main(String[] args) {
        
        System.out.println("--- For Loop ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count is: " + i);
        }
        
        System.out.println("\n--- While Loop ---");
        int count = 1;
        while (count <= 3) {
            System.out.println("Loop count: " + count);
            count++;
        }
        
        System.out.println("\n--- For-Each Loop ---");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int n : numbers) {
            System.out.println("Array value: " + n);
        }
        
        System.out.println("\n--- Break & Continue ---");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping 3 (using continue)");
                continue; // Skip the rest of this iteration
            }
            if (i == 5) {
                System.out.println("Breaking at 5 (using break)");
                break; // Exit the loop
            }
            System.out.println("Value: " + i);
        }
    }
}
