import java.util.Scanner;

public class SwapNibble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (0-255): ");
        int n = sc.nextInt();

        // Step 1: get right nibble and shift left
        int right = (n & 0x0F) << 4;

        // Step 2: get left nibble and shift right
        int left = (n & 0xF0) >> 4;

        // Step 3: combine both
        int result = right | left;

        System.out.println("After swapping nibble: " + result);
    }
}