# Module 4 Exam Questions: Arrays, Collections & I/O

Test your understanding of advanced data structures and file handling in Java.

## Section 1: Multiple Choice Questions (MCQs)

1. **What is a "Jagged Array" in Java?**
   - A) An array with irregular values
   - B) A multi-dimensional array with different row lengths
   - C) An array that cannot be resized
   - D) A single-dimensional array

2. **Which class provides a LIFO (Last-In-First-Out) stack?**
   - A) ArrayList
   - B) Vector
   - C) Stack
   - D) LinkedList

3. **Which class is mutable and should be used for frequent string modifications in a single-threaded environment?**
   - A) String
   - B) StringBuffer
   - C) StringBuilder
   - D) StringReader

4. **Which stream is best suited for handling images or binary files?**
   - A) FileReader
   - B) FileInputStream (Byte Stream)
   - C) FileWriter
   - D) StringReader

5. **Is `ArrayList` synchronized by default?**
   - A) Yes
   - B) No
   - C) Only in newer Java versions
   - D) It depends on the size

6. **Which keyword is used to automatically close resources like files?**
   - A) finalize
   - B) static
   - C) try-with-resources (Automatic Resource Management)
   - D) synchronized

---

## Section 2: Coding Challenges

### Challenge 1: Jagged Arrays

Create a jagged array with 2 rows. Row 1 should have 3 elements and Row 2 should have 5 elements. Print the total number of elements in the entire array.

### Challenge 2: Collections

Create an `ArrayList` of your top 3 favorite movies. Add "Inception", "Arrival", and "Interstellar". Remove the second movie and print the final list.

---

## Answer Key

**MCQs:**

1. B (Different row lengths)
2. C (Stack)
3. B (FileInputStream)
4. B (No - Vector is synchronized)
5. C (try-with-resources)
