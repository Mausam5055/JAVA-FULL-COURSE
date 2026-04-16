// /* ============================================
   SELECTION SORT - COMMENTED LOGIC
   ============================================
   // find min → swap with i
   // int[] arr = {5,3,2,4,1};
   // for(int i=0;i<arr.length;i++){
   //     int min = i;
   //     for(int j=i+1;j<arr.length;j++){
   //         if(arr[j] < arr[min]){
   //             min = j;
   //         }
   //     }
   //     int temp = arr[i];
   //     arr[i] = arr[min];
   //     arr[min] = temp;
   // }
   ============================================ */

public class SelectionSort {
    
    // Method to print array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Selection Sort Method
    static void selectionSort(int[] arr) {
        int n = arr.length;
        
        // Outer loop: For each position
        for (int i = 0; i < n; i++) {
            
            // Start with current position as minimum
            int min = i;
            
            // Inner loop: Find the minimum element in remaining array
            for (int j = i + 1; j < n; j++) {
                
                // If we found a smaller element, update min
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            
            // Swap minimum element with current position
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    
    // Main method
    public static void main(String[] args) {
        // Example array
        int[] arr = {5, 3, 2, 4, 1};
        
        System.out.println("Original Array:");
        printArray(arr);
        
        // Call selection sort
        selectionSort(arr);
        
        System.out.println("\nSorted Array:");
        printArray(arr);
    }
}

