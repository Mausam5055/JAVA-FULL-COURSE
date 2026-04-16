// Simple Dynamic Programming example to count paths in a grid

public class SimpleDP {

    static int countPaths(int m, int n) {

        int[][] dp = new int[m][n];

        // Fill first row
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        // Fill first column
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        // Fill remaining cells
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(countPaths(3, 3)); // Output: 6
    }
}



// import java.util.Scanner;

// public class SimpleMove {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter direction: ");
//         String dir = sc.nextLine();

//         switch (dir.toLowerCase()) {
//             case "forward":
//                 System.out.println("Move forward");
//                 break;
//             case "left":
//                 System.out.println("Turn left");
//                 break;
//             case "right":
//                 System.out.println("Turn right");
//                 break;
//             case "back":
//                 System.out.println("Move back");
//                 break;
//             default:
//                 System.out.println("Invalid input");
//         }

//         sc.close();
//     }
// }