/* ============================================
   QUICK SORT - COMMENTED LOGIC
   ============================================
   // pivot → split → recursion
   // static void quick(int[] arr, int low, int high){
   //     if(low < high){
   //         int p = part(arr, low, high);
   //         quick(arr, low, p-1);
   //         quick(arr, p+1, high);
   //     }
   // }
   // 
   // static int part(int[] arr, int low, int high){
   //     int pivot = arr[high];
   //     int i = low;
   //     for(int j=low;j<high;j++){
   //         if(arr[j] < pivot){
   //             int t = arr[i];
   //             arr[i] = arr[j];
   //             arr[j] = t;
   //             i++;
   //         }
   //     }
   //     int t = arr[i];
   //     arr[i] = arr[high];
   //     arr[high] = t;
   //     return i;
   // }
   ============================================ */

public class QuickSort {
    
    // Method to print array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Partition method: Place pivot in correct position
    static int partition(int[] arr, int low, int high) {
        // Choose last element as pivot
        int pivot = arr[high];
        
        // i points to smaller elements
        int i = low;
        
        // Compare each element with pivot
        for (int j = low; j < high; j++) {
            // If element is smaller than pivot, swap
            if (arr[j] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        
        // Place pivot in correct position
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        
        // Return pivot's final position
        return i;
    }
    
    // Quick Sort method: Recursive sorting
    static void quickSort(int[] arr, int low, int high) {
        // Base case: if array has 1 or more elements
        if (low < high) {
            // Partition and get pivot position
            int p = partition(arr, low, high);
            
            // Recursively sort left part (before pivot)
            quickSort(arr, low, p - 1);
            
            // Recursively sort right part (after pivot)
            quickSort(arr, p + 1, high);
        }
    }
    
    // Main method
    public static void main(String[] args) {
        // Example array
        int[] arr = {5, 3, 2, 4, 1};
        
        System.out.println("Original Array:");
        printArray(arr);
        
        // Call quick sort
        quickSort(arr, 0, arr.length - 1);
        
        System.out.println("\nSorted Array:");
        printArray(arr);
    }
}