// Sieve of Eratosthenes - Simple Version
// Finds all prime numbers up to n
class SimpleSieve {

    public static void main(String[] args) {
        // Find all primes up to 50
        simpleSieve(50);
    }

    static void simpleSieve(int n) {
        // Step 1: Create a boolean array of size n+1
        // true = prime, false = not prime
        boolean[] isPrime = new boolean[n + 1];

        // Step 2: Mark all numbers as prime initially (2 to n)
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Step 3: Apply sieve algorithm
        // For each number i, mark all its multiples as not prime
        for (int i = 2; i * i <= n; i++) {
            // If i is still marked as prime
            if (isPrime[i]) {
                // Mark all multiples of i as not prime
                // Start from i*i because smaller multiples are already marked
                for (int j = i * i; j <= n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 4: Print all prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}