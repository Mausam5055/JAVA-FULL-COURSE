/*
 * -------------------------------------------------------------------------
 * MODULE 4: ADVANCED STRING CLASSES
 * -------------------------------------------------------------------------
 * 
 * 1. STRING (Immutable): 
 *    - Once created, cannot be changed.
 *    - Changes create a NEW object in memory (String Constant Pool).
 * 
 * 2. STRINGBUILDER (Mutable):
 *    - Can be modified without creating new objects.
 *    - NOT thread-safe (Fast).
 * 
 * 3. STRINGBUFFER (Mutable):
 *    - Like StringBuilder but Synchronized (Thread-safe).
 *    - Slower than StringBuilder.
 * 
 * -------------------------------------------------------------------------
 */

public class Strings_Advanced {
    public static void main(String[] args) {
        
        // --- String (Immutable) ---
        String s = "Java";
        s.concat(" Programming"); // Creates a new string but doesn't assign to 's'
        System.out.println("Original String: " + s); // Still "Java"

        // --- StringBuilder (Mutable) ---
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming"); // Modifies the same object
        System.out.println("StringBuilder: " + sb);
        
        sb.insert(4, " is Great");
        System.out.println("After Insert: " + sb);
        
        sb.reverse();
        System.out.println("Reversed: " + sb);

        // --- StringBuffer (Thread-safe) ---
        StringBuffer sbf = new StringBuffer("Thread Safe");
        sbf.append(" Java");
        System.out.println("\nStringBuffer: " + sbf);
    }
}
