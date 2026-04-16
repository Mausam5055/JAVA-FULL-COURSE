// A leader is an element greater than all elements to its right
// Example: {16, 17, 4, 3, 5, 2} → Leaders are: 17, 5, 2

public class LeadersEasy {
    public static void main(String[] args) {

        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        // Check each element from left to right
        for (int i = 0; i < n; i++) {
            int j;

            // Check all elements to the right of arr[i]
            for (j = i + 1; j < n; j++) {
                // If arr[i] is smaller or equal, it's not a leader
                if (arr[i] <= arr[j]) {
                    break;   // not a leader
                }
            }

            // If loop reached end (j == n), arr[i] is a leader
            if (j == n) {   // reached end → leader
                System.out.print(arr[i] + " ");
            }
        }
    }
}