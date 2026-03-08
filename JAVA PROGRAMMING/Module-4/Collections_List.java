/*
 * -------------------------------------------------------------------------
 * MODULE 4: COLLECTIONS FRAMEWORK (LIST INTERFACE)
 * -------------------------------------------------------------------------
 * 
 * 1. COLLECTIONS FRAMEWORK: A set of classes and interfaces to handle 
 *    groups of objects efficiently.
 * 
 * 2. LIST INTERFACE: An ordered collection that allows duplicates.
 * 
 * 3. COMMON LIST IMPLEMENTATIONS:
 *    - ArrayList: Dynamic array, fast for searching, slow for modifications.
 *    - Vector: Like ArrayList but Synchronized (Thread-safe).
 *    - Stack: Last-In-First-Out (LIFO) data structure.
 * 
 * -------------------------------------------------------------------------
 */

import java.util.*;

public class Collections_List {
    public static void main(String[] args) {
        
        // --- ArrayList Example ---
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        
        System.out.println("ArrayList: " + fruits);
        System.out.println("Fruit at index 1: " + fruits.get(1));

        // --- Vector Example (Synchronized) ---
        Vector<Integer> vec = new Vector<>();
        vec.add(10);
        vec.add(20);
        vec.add(30);
        System.out.println("\nVector: " + vec);

        // --- Stack Example (LIFO) ---
        Stack<String> stack = new Stack<>();
        stack.push("Bottom");
        stack.push("Middle");
        stack.push("Top");

        System.out.println("\nStack: " + stack);
        System.out.println("Popped item: " + stack.pop()); // Removes Top
        System.out.println("New Stack size: " + stack.size());

        // Iterating through a list
        System.out.println("\nIterating through Fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
    }
}
