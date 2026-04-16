// Equilibrium Index Problem - Find Maximum Equilibrium Sum
// Equilibrium index: leftSum == rightSum (sum of elements before = sum after)
// Example: {1, 3, 5, 2, 2} → Index 2 (3+1 = 2+2) → Max equilibrium sum = 4

public class EquilibriumEasy {
    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 2, 2};
        int n = arr.length;

        int maxSum = -1;  // Stores maximum equilibrium sum (-1 if none found)

        // Step 1: Check each index as a potential equilibrium point
        for (int i = 0; i < n; i++) {

            int leftSum = 0;   // Sum of all elements before index i
            int rightSum = 0;  // Sum of all elements after index i

            // Step 2: Calculate left sum (all elements before index i)
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            // Step 3: Calculate right sum (all elements after index i)
            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }

            // Step 4: Check if left sum equals right sum (equilibrium index found)
            if (leftSum == rightSum) {
                // If this is the maximum equilibrium sum found so far
                if (leftSum > maxSum) {
                    maxSum = leftSum;  // Update max sum
                }
            }
        }

        // Step 5: Print result
        if (maxSum != -1)
            System.out.println("Max Equilibrium Sum = " + maxSum);
        else
            System.out.println("No Equilibrium Index");
    }
}