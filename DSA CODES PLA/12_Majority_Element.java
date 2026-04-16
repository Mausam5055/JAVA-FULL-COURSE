// Majority Element Problem
// Find an element that appears more than n/2 times in the array
// Example: {2, 2, 1, 2, 3} → Majority element is 2 (appears 3 times, n/2 = 2.5)

public class MajorityEasy {
    public static void main(String[] args) {

        // Sample array
        int arr[] = {2, 2, 1, 2, 3};
        int n = arr.length;

        // Step 1: Pick each element one by one
        for (int i = 0; i < n; i++) {
            int count = 1;  // Count for arr[i] (starts with 1 for itself)

            // Step 2: Compare arr[i] with all elements after it
            for (int j = i + 1; j < n; j++) {
                // If current element matches arr[i], increment count
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Step 3: Check if count is more than n/2 (majority)
            if (count > n / 2) {
                System.out.println("Majority Element: " + arr[i]);
                return;  // Exit after finding majority element
            }
        }

        // If no element appears more than n/2 times
        System.out.println("No Majority Element");
    }
}