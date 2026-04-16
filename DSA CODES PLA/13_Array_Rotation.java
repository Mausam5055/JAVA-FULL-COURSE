import java.util.*;

// Array Rotation using Three-Step Reversal Algorithm
// Rotate array to the left by k positions in O(n) time
// Example: {1, 2, 3, 4, 5, 6, 7, 8, 9} rotated by 4 → {5, 6, 7, 8, 9, 1, 2, 3, 4}

public class RotateOptimized {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = a.length;
        
        System.out.println("Array before rotation: " + Arrays.toString(a));

        int k = 4;  // Rotate by 4 positions
        k = k % n;  // Handles k >= n (for cases like k=13, n=9)

        // Three-step reversal algorithm:
        // Step 1: Reverse first k elements
        reverse(a, 0, k - 1);
        
        // Step 2: Reverse remaining elements
        reverse(a, k, n - 1);
        
        // Step 3: Reverse entire array
        reverse(a, 0, n - 1);

        System.out.println("Array after rotation:  " + Arrays.toString(a));
        // Output: [5, 6, 7, 8, 9, 1, 2, 3, 4]
    }

    // Helper method: Reverse a subarray from index start to end
    static void reverse(int[] a, int start, int end) {
        while (start < end) {
            // Swap elements at start and end
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}