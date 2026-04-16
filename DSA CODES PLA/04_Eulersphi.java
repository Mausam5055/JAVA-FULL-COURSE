import java.util.*;

public class EulerPhiAlgorithm {
    
    // Method to find GCD (Greatest Common Divisor)
    // GCD is used to check if two numbers are coprime (GCD = 1)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // Euler's Totient Function: Count how many numbers from 1 to n are coprime with n
    // Coprime means GCD(i, n) = 1
    public static int phi(int n) {
        int count = 0;  // Counter for coprime numbers
        
        // Check each number from 1 to n
        for (int i = 1; i <= n; i++) {
            // If GCD of i and n is 1, they are coprime
            if (gcd(i, n) == 1) {
                count++;  // Increment count
            }
        }
        
        return count;
    }
    
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        // Call phi function and print result
        int phi_n = phi(n);
        System.out.println("phi(" + n + ") = " + phi_n);
        
        sc.close();
    }
}
