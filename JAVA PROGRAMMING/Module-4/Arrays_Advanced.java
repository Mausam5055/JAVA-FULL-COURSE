/*
 * -------------------------------------------------------------------------
 * MODULE 4: JAVA ARRAYS (ADVANCED)
 * -------------------------------------------------------------------------
 * 
 * 1. 1-D ARRAY: A linear collection of elements of same type.
 * 
 * 2. 2-D ARRAY: An array of arrays (Table structure with rows & columns).
 *    Syntax: [Type][][] name = new [Type][rows][cols];
 * 
 * 3. JAGGED ARRAY: A multi-dimensional array where each row has a 
 *    different number of columns.
 * 
 * -------------------------------------------------------------------------
 */

public class Arrays_Advanced {
    public static void main(String[] args) {
        
        // --- 1-D Array Recap ---
        int[] scores = {85, 90, 78, 92};
        System.out.println("First score: " + scores[0]);

        // --- 2-D Array (3x3 Matrix) ---
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\n--- 2-D Array Elements ---");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // --- Jagged Array ---
        // Array where rows have different lengths
        int[][] jagged = new int[3][];
        jagged[0] = new int[2]; // Row 0 has 2 columns
        jagged[1] = new int[4]; // Row 1 has 4 columns
        jagged[2] = new int[3]; // Row 2 has 3 columns

        // Initializing jagged array
        int count = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = count++;
            }
        }

        System.out.println("\n--- Jagged Array Elements ---");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
