/*
 * -------------------------------------------------------------------------
 * MODULE 3: PACKAGES DEMO
 * -------------------------------------------------------------------------
 * 
 * 1. PACKAGE: A mechanism to group related classes, interfaces, 
 *    and sub-packages.
 *    - Helps avoid name conflicts.
 *    - Provides access protection.
 * 
 * 2. IMPORT: Used to access a class or package from another package.
 * 
 * NOTE: To run this demo, Helper.java must be in a subfolder named 'mypackage'.
 * 
 * -------------------------------------------------------------------------
 */

import mypackage.Helper; // Importing the custom class

public class Packages_Demo {
    public static void main(String[] args) {
        
        System.out.println("--- Using User-Defined Packages ---");
        
        // Creating an instance of the class from our package
        Helper h = new Helper();
        h.displayMessage();
    }
}
