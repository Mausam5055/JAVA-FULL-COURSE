/*
 * -------------------------------------------------------------------------
 * MODULE 1: JAVA FLOW CONTROL (CONDITIONALS)
 * -------------------------------------------------------------------------
 * 
 * 1. IF...ELSE STATEMENT:
 *    Executes a block of code if the condition is true.
 *    Syntax:
 *    if (condition) { ... } 
 *    else if (condition) { ... }
 *    else { ... }
 * 
 * 2. SWITCH STATEMENT:
 *    Allows multiple execution paths based on a value.
 *    Use 'break' to stop the flow from falling through to next cases.
 * 
 * -------------------------------------------------------------------------
 */

public class ControlFlow_Conditionals {
    public static void main(String[] args) {
        
        // --- If...Else Example ---
        int number = 10;
        
        if (number > 0) {
            System.out.println("Number is Positive.");
        } else if (number < 0) {
            System.out.println("Number is Negative.");
        } else {
            System.out.println("Number is Zero.");
        }
        
        // --- Switch Case Example ---
        int day = 3;
        String dayName;
        
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            default:
                dayName = "Weekend";
                break;
        }
        
        System.out.println("The day is: " + dayName);
    }
}
