/*
 * -------------------------------------------------------------------------
 * MODULE 2: ENCAPSULATION & ACCESS MODIFIERS
 * -------------------------------------------------------------------------
 * 
 * 1. ACCESS MODIFIERS: Define the scope/visibility of variables/methods.
 *    - private: Accessible only within the SAME class.
 *    - default: Accessible within the SAME package.
 *    - protected: Accessible within SAME package and subclasses.
 *    - public: Accessible everywhere in the project.
 * 
 * 2. ENCAPSULATION: Wrapping data (variables) and code (methods) together.
 *    - Aim: Keep data secure by making variables 'private'.
 *    - Provide 'public' Getters and Setters to access/modify them.
 * 
 * -------------------------------------------------------------------------
 */

class Student {
    // Private variables (Data Hiding)
    private String name;
    private int rollNo;

    // Getter Method (To read data)
    public String getName() {
        return name;
    }

    // Setter Method (To write data)
    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        // We can add validation logic here!
        if (rollNo > 0) {
            this.rollNo = rollNo;
        } else {
            System.out.println("Error: Roll Number must be positive.");
        }
    }
}

public class Encapsulation_Access {
    public static void main(String[] args) {
        
        Student s = new Student();
        
        // s.name = "Rahul"; // ERROR: name is private
        
        // Correct way using encapsulation
        s.setName("Rahul Sharma");
        s.setRollNo(101);
        
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Roll No: " + s.getRollNo());
        
        // Trying invalid input
        s.setRollNo(-5); 
    }
}
