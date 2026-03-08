/*
 * -------------------------------------------------------------------------
 * MODULE 3: JAVA ANNOTATIONS
 * -------------------------------------------------------------------------
 * 
 * 1. ANNOTATIONS: Metadata (information) about the code.
 *    They start with @ and do not change the action of a compiled program.
 * 
 * 2. BUILT-IN ANNOTATIONS:
 *    - @Override: ensures that a method is actually overriding a parent method.
 *    - @Deprecated: marks code as outdated; warns the user if they use it.
 *    - @SuppressWarnings: instructs the compiler to ignore specific warnings.
 * 
 * 3. CUSTOM ANNOTATIONS: You can define your own using @interface.
 * 
 * -------------------------------------------------------------------------
 */

class Parent {
    void show() {
        System.out.println("Parent Show");
    }
    
    @Deprecated
    void oldMethod() {
        System.out.println("This method is old and deprecated.");
    }
}

class Child extends Parent {
    @Override // Compiler check: ensures show() exists in Parent
    void show() {
        System.out.println("Child Show");
    }
}

// Defining a Custom Annotation
@interface MyAnnotation {
    String value() default "Default value";
}

public class Annotations_Types {
    
    @SuppressWarnings("unchecked") // Ignores warnings related to generics/raw types
    public static void main(String[] args) {
        
        Child obj = new Child();
        obj.show();
        
        // Using deprecated method (displays warning in IDE)
        obj.oldMethod();
        
        System.out.println("Annotations help program understanding but don't change logic.");
    }
}
