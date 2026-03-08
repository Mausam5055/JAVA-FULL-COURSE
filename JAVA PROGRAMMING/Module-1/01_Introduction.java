/*
 * -------------------------------------------------------------------------
 * MODULE 1: JAVA INTRODUCTION
 * -------------------------------------------------------------------------
 * 
 * 1. WHAT IS JAVA?
 * Java is a high-level, class-based, object-oriented programming language.
 * It was developed by James Gosling at Sun Microsystems in 1995.
 * Slogan: "Write Once, Run Anywhere" (WORA).
 * 
 * 2. MAIN COMPONENTS OF JAVA (JVM, JRE, JDK)
 * 
 *    [ JDK (Java Development Kit) ]
 *    Contains JRE + Development Tools (javac, debugger, etc.)
 *    |
 *    V
 *    [ JRE (Java Runtime Environment) ]
 *    Contains JVM + Libraries (to run Java programs)
 *    |
 *    V
 *    [ JVM (Java Virtual Machine) ]
 *    Executes the bytecode (.class files)
 * 
 * 3. DIFFERENCE BETWEEN C & C++ & JAVA
 * 
 * Feature       | C                | C++               | Java
 * --------------|------------------|-------------------|------------------
 * Paradigm      | Procedural       | OOP & Procedural  | Pure OOP (Mostly)
 * Memory        | Manual (malloc)  | Manual (new/delete)| Automatic (GC)
 * Platform      | Dependent        | Dependent         | Independent
 * Pointers      | Supported        | Supported         | Not Supported
 * 
 * -------------------------------------------------------------------------
 */

public class Introduction {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Programming!");
        System.out.println("Java is Platform Independent because of Bytecode.");
        
        // Quick Summary:
        // JDK = JRE + Development Tools
        // JRE = JVM + Library Classes
    }
}
