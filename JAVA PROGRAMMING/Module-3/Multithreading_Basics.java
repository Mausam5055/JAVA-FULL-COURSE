/*
 * -------------------------------------------------------------------------
 * MODULE 3: MULTITHREADING BASICS
 * -------------------------------------------------------------------------
 * 
 * 1. MULTITHREADING: Background execution of multiple tasks simultaneously.
 *    - A thread is the smallest unit of processing.
 * 
 * 2. THREAD CREATION:
 *    A. Extending 'Thread' class: Override run() and call start().
 *    B. Implementing 'Runnable' interface: Pass to Thread object and start().
 * 
 * 3. THREAD LIFE CYCLE (States):
 *    - New: Thread object created.
 *    - Runnable: start() called; waiting for CPU.
 *    - Running: CPU is executing the run() method.
 *    - Blocked/Waiting: Waiting for resource or another thread.
 *    - Terminated: run() finished.
 * 
 * -------------------------------------------------------------------------
 */

// Method 1: Extending Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread 1 (Extends Thread) is running...");
    }
}

// Method 2: Implementing Runnable interface (Better practice)
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread 2 (Implements Runnable) is running...");
    }
}

public class Multithreading_Basics {
    public static void main(String[] args) {
        
        System.out.println("Main Thread starts...");

        // Start thread using Method 1
        MyThread t1 = new MyThread();
        t1.start(); // Moves thread to Runnable state
        
        // Start thread using Method 2
        MyRunnable myRunnable = new MyRunnable();
        Thread t2 = new Thread(myRunnable);
        t2.start();
        
        System.out.println("Main Thread ends.");
        // Note: The execution order between threads is managed by OS Scheduler.
    }
}
