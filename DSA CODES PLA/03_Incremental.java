// Sieve of Eratosthenes - Incremental Version
// Prints prime numbers as they are found (not at the end)
class IncrementalSieve {

    public static void main(String[] args) {
        // Find and print all primes up to 50
        incrementalSieve(50);
    }

    static void incrementalSieve(int n) {
        // Step 1: Create a boolean array to track prime numbers
        boolean[] isPrime = new boolean[n + 1];

        // Step 2: Initially mark all numbers from 2 to n as prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Step 3: Go through each number and mark its multiples
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            // If i is still marked as prime
            if (isPrime[i]) {
                // Print it immediately (incremental output)
                System.out.print(i + " ");

                // Mark all multiples of i as not prime
                for (int j = i * 2; j <= n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println();
    }
}