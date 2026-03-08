# Module 3 Notes: Exceptions, Threads & Packages

Handling errors and performing multiple tasks simultaneously.

---

## 1. Exception Handling

An **Exception** is an error event that stops the program.

- **`try`**: Code that might fail.
- **`catch`**: Code that handles the failure.
- **`finally`**: Code that runs no matter what (e.g., closing files).
- **`throw`**: Manually trigger an error.
- **`throws`**: Warning that a method might fail.

---

## 2. Multithreading

Running multiple parts of a program in parallel.

- **Thread**: A single execution path.
- **Creation**:
  1. Extend the `Thread` class.
  2. Implement the `Runnable` interface (Recommended).
- **Life Cycle**: New -> Runnable -> Running -> Blocked -> Terminated.

---

## 3. Thread Synchronization

- **Problem**: "Thread Interference" (threads clashing over data).
- **Solution**: **`synchronized`** keyword. Only one thread can enter a synchronized method at a time.
- **Methods**: `start()`, `sleep()`, `join()`.

---

## 4. Java Annotations

Metadata for the compiler or developer.

- **`@Override`**: Ensures correct method overriding.
- **`@Deprecated`**: Warns that code is old.
- **`@SuppressWarnings`**: Silences compiler warnings.

---

## 5. User-Defined Packages

- **Package**: A folder to organize classes.
- **`package mypack;`**: Declares the package.
- **`import mypack.MyClass;`**: Uses the package elsewhere.
