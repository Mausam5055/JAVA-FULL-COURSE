import java.util.Scanner;

public class AliceApple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of apples
        System.out.print("Enter the number of apples: ");
        int n = sc.nextInt();
        
        // Calculate layers needed
        int layer = 0;
        int sum = 0;
        
        for (int i = 1; i <= 1000; i++) {
            layer = i;
            sum += 12 * layer * layer;
            if (sum >= n) {
                break;
            }
        }
        
        // Alternative approach using while loop (commented out):
        // while (sum < n) {
        //     layer++;
        //     sum += 12 * layer * layer;
        // }
        
        // Print result (number of apples on outermost layer)
        System.out.println("Apples on outermost layer: " + (8 * layer));
        
        sc.close();
    }
}