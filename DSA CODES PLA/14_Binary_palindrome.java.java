import java.util.Scanner;

// Binary Palindrome Problem
// Check if a number's binary representation is a palindrome
// Example: 9 in binary is 1001 → reads same forwards and backwards → Palindrome

public class BinaryPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        // Store original value to compare later
        int original = n;
        int reverse = 0;

        // Step 2: Extract bits one by one and reverse them
        while (n > 0) {
            // Extract the last bit of n (using AND with 1)
            int bit = n & 1;        // Example: if n=9 (1001), bit=1
            
            // Insert extracted bit into reverse
            // Left shift: make space, OR: add the bit
            reverse = (reverse << 1) | bit;
            
            // Remove the last bit by right shifting n
            n = n >> 1;            // Example: 1001 becomes 0100
        }

        // Step 3: Compare original with reversed binary
        if (original == reverse)
            System.out.println("Binary Palindrome");
        else
            System.out.println("Not Binary Palindrome");
        
        sc.close();
    }
}