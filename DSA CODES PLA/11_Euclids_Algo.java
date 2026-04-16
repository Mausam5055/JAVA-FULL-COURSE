import java.util.Scanner;

// Euclid's Algorithm to find GCD (Greatest Common Divisor)
// GCD of two numbers is the largest number that divides both
// Example: GCD(48, 28) = 4

public class GCD_Euclid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take two numbers as input
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Step 2: Apply Euclid's algorithm
        // Keep replacing (a, b) with (b, a%b) until b becomes 0
        while (b != 0) {
            int r = a % b;  // Find remainder when a is divided by b
            a = b;          // Now a becomes b
            b = r;          // Now b becomes remainder
        }

        // Step 3: When b becomes 0, a contains the GCD
        System.out.println("GCD = " + a);
        
        sc.close();
    }
}