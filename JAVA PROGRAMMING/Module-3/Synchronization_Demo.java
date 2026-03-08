/*
 * -------------------------------------------------------------------------
 * MODULE 3: THREAD SYNCHRONIZATION & METHODS
 * -------------------------------------------------------------------------
 * 
 * 1. THREAD INTERFERENCE: Occurs when multiple threads try to access 
 *    the same resource at the same time, leading to inconsistent data.
 * 
 * 2. SYNCHRONIZATION: Ensures ONLY ONE thread accesses a resource 
 *    at a time. Keyword: 'synchronized'.
 * 
 * 3. KEY METHODS:
 *    - start(): Starts thread execution.
 *    - sleep(ms): Pauses execution for specified time.
 *    - join(): Waits for a thread to finish before continuing.
 * 
 * -------------------------------------------------------------------------
 */

class Counter {
    int count = 0;

    // 'synchronized' prevents multiple threads from incrementing at once
    public synchronized void increment() {
        count++;
    }
}

public class Synchronization_Demo {
    public static void main(String[] args) throws InterruptedException {
        
        Counter c = new Counter();

        // Create two threads that increment the same counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        t1.start();
        t2.start();

        // wait for threads to finish
        t1.join(); 
        t2.join();

        System.out.println("Final Counter Value (Should be 2000): " + c.count);
        
        // --- Sleep Example ---
        System.out.println("\nMain thread sleeping for 1 second...");
        Thread.sleep(1000);
        System.out.println("Main thread awake!");
    }
}
