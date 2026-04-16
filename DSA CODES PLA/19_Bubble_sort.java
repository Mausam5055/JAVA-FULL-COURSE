/* ============================================
   BUBBLE SORT - COMMENTED LOGIC
   ============================================
   // compare j and j+1 → swap
   // int[] arr = {5,3,2,4,1};
   // for(int i=0;i<arr.length;i++){
   //     for(int j=0;j<arr.length-1;j++){
   //         if(arr[j] > arr[j+1]){
   //             int temp = arr[j];
   //             arr[j] = arr[j+1];
   //             arr[j+1] = temp;
   //         }
   //     }
   // }
   ============================================ */

public class BubbleSort {
    
    // Method to print array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Bubble Sort Method
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        // Outer loop: Run n times (number of passes needed)
        for (int i = 0; i < n; i++) {
            
            // Inner loop: Compare adjacent elements
            for (int j = 0; j < n - 1; j++) {
                
                // If left element is GREATER than right element, SWAP
                if (arr[j] > arr[j + 1]) {
                    // Swap using temporary variable
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Main method
    public static void main(String[] args) {
        // Example array
        int[] arr = {5, 3, 2, 4, 1};
        
        System.out.println("Original Array:");
        printArray(arr);
        
        // Call bubble sort
        bubbleSort(arr);
        
        System.out.println("\nSorted Array:");
        printArray(arr);
    }
}