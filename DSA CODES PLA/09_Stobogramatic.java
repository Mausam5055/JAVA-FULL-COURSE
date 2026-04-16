import java.util.Scanner;

// Strobogrammatic Number: A number that looks the same when rotated 180 degrees
// Valid pairs: 0↔0, 1↔1, 6↔9, 9↔6, 8↔8
public class StrobogrammaticCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input from user
        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        // Step 2: Assume the number is strobogrammatic initially
        boolean isStrobo = true;
        int n = num.length();

        // Step 3: Compare characters from both ends moving towards center
        // We only need to check up to middle because pairs must match
        for (int i = 0; i <= n / 2; i++) {
            // Get character from left side
            char a = num.charAt(i);
            
            // Get character from right side (mirror position)
            char b = num.charAt(n - 1 - i);

            // Step 4: Check if the pair is valid for strobogrammatic
            // Valid pairs: (0,0), (1,1), (6,9), (9,6), (8,8)
            if ((a == '0' && b == '0') ||      // 0 rotated 180° = 0
                (a == '1' && b == '1') ||      // 1 rotated 180° = 1
                (a == '6' && b == '9') ||      // 6 rotated 180° = 9
                (a == '9' && b == '6') ||      // 9 rotated 180° = 6
                (a == '8' && b == '8')) {      // 8 rotated 180° = 8
                // Valid pair found → continue checking
            } else {
                // Invalid pair found → not strobogrammatic
                isStrobo = false;
                break;
            }
        }

        // Step 5: Print result
        if (isStrobo)
            System.out.println("Strobogrammatic Number");
        else
            System.out.println("Not Strobogrammatic");
        
        sc.close();
    }
}