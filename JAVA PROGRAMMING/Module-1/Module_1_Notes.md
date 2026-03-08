# Module 1 Notes: Java Introduction & Basics

Welcome to Java! This document summarizes the core topics covered in Module 1.

---

## 1. Java Introduction

- **What is Java?** A high-level, object-oriented, and platform-independent language.
- **WORA**: "Write Once, Run Anywhere" – possible due to **Bytecode**.
- **JVM (Java Virtual Machine)**: Executes the bytecode.
- **JRE (Java Runtime Environment)**: JVM + Libraries to run programs.
- **JDK (Java Development Kit)**: JRE + Development tools (like `javac`).

### C++ vs Java

- Java has **Handled Memory** (Garbage Collection).
- Java does **not** support explicit pointers (for security).
- Java is **Platform Independent**, while C++ is platform dependent.

---

## 2. Hello World & Comments

- Every Java program must have a **Class** (Class name = Filename).
- **`public static void main(String[] args)`**: The entry point of the program.
- **Comments**:
  - `//` Single line
  - `/* ... */` Multi-line
  - `/** ... */` Documentation (JavaDoc)

---

## 3. Variables & Data Types

Variables are containers for data.

### Primitive Types

- `int`: Whole numbers (4 bytes)
- `double`: Large decimal numbers (8 bytes)
- `char`: Single character ('A')
- `boolean`: true or false

### Non-Primitive Types

- `String`: Sequence of characters ("Hello")

---

## 4. Operators & Expressions

- **Arithmetic**: `+`, `-`, `*`, `/`, `%` (remainder)
- **Comparison**: `==`, `!=`, `<`, `>`, `<=`, `>=`
- **Logical**: `&&` (AND), `||` (OR), `!` (NOT)
- **Increment/Decrement**: `++`, `--`

---

## 5. Input & Output

- **Output**: `System.out.println()` for a new line, `System.out.printf()` for formatting.
- **Input**: Use the `Scanner` class from `java.util`.
  ```java
  Scanner sc = new Scanner(System.in);
  int age = sc.nextInt();
  ```

---

## 6. Flow Control

### Conditionals

- **if...else**: Choose between two paths based on a condition.
- **switch**: Choose between multiple fixed values.

### Loops

- **for**: Use when iterations are known.
- **while**: Use when iterations depend on a condition.
- **for-each**: Ideal for iterating through arrays.
- **break**: Exit the loop.
- **continue**: Skip to the next iteration.
