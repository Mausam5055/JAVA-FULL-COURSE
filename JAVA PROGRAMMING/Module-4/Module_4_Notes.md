# Module 4 Notes: Arrays, Collections & I/O Streams

This module covers efficient data handling and persistent storage.

---

## 1. Advanced Arrays

- **1-D Array**: Fixed-size sequence of elements.
- **2-D Array**: Matrix or table (rows and columns).
- **Jagged Array**: Rows can have different column counts. Useful for saving memory when row lengths vary.

---

## 2. Collections Framework (List)

The **Collections Framework** provides a high-level API for handling data.

- **ArrayList**: Most popular. Fast access, but slow at inserting in the middle.
- **Vector**: Thread-safe (Synchronized), similar to ArrayList.
- **Stack**: Implements LIFO (Last-In-First-Out).

---

## 3. String Operations & Classes

- **String**: Immutable (cannot be changed). Changes create new objects.
- **StringBuilder**: Mutable, efficient for single-threaded modifications.
- **StringBuffer**: Mutable and Thread-safe (Synchronized), slower than StringBuilder.
- **Common Methods**: `append()`, `insert()`, `reverse()`, `delete()`.

---

## 4. Java I/O Streams

How programs talk to the outside world (Files, Network).

- **Byte-Oriented Streams**: Handle raw 8-bit bytes. Used for binary files (Images, Executables).
  - Classes: `FileInputStream`, `FileOutputStream`.
- **Character-Oriented Streams**: Handle 16-bit Unicode characters. Used for text files.
  - Classes: `FileReader`, `FileWriter`.
- **Reader/Writer**: The base abstract classes for all character-oriented streams.

---

## 5. Best Practices

- Always use **try-with-resources** when working with files to avoid memory leaks.
- Prefer **ArrayList** over Vector/Stack unless thread safety is specifically needed.
