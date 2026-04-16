public class Josephus {

    // function to find safe position
    public static int josephus(int n, int k) {

        int result = 0;   // base case: J(1) = 0

        for (int i = 2; i <= n; i++) {

            // shift position by k and wrap around
            result = (result + k) % i;
        }

        return result;   // 0-based index
    }

    public static void main(String[] args) {

        System.out.println(josephus(5, 2) + 1);  // 3
        System.out.println(josephus(7, 3) + 1);  // 4
        System.out.println(josephus(10, 2) + 1); // 5
    }
}