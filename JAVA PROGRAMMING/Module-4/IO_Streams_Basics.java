/*
 * -------------------------------------------------------------------------
 * MODULE 4: JAVA I/O STREAMS (BASICS)
 * -------------------------------------------------------------------------
 * 
 * 1. I/O STREAMS: Used for reading data from a source and writing to a 
 *    destination (like Files).
 * 
 * 2. TYPES OF STREAMS:
 *    A. BYTE STREAMS: Handle binary data (1 byte at a time).
 *       - InputStream (e.g., FileInputStream)
 *       - OutputStream (e.g., FileOutputStream)
 * 
 *    B. CHARACTER STREAMS: Handle text data (2 bytes Unicode).
 *       - Reader (e.g., FileReader)
 *       - Writer (e.g., FileWriter)
 * 
 * -------------------------------------------------------------------------
 */

import java.io.*;

public class IO_Streams_Basics {
    public static void main(String[] args) {
        
        String filename = "demo.txt";

        // --- Writing to a file using Character Stream (FileWriter) ---
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, Module 4 I/O Stream!\n");
            writer.write("This is a Character-oriented stream demo.");
            System.out.println("Data written to " + filename);
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        // --- Reading from a file using Character Stream (FileReader) ---
        System.out.println("\n--- Reading file content ---");
        try (FileReader reader = new FileReader(filename)) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }

        // --- Cleanup (Optional since we used try-with-resources) ---
        // Files created during run can be found in the current directory.
    }
}
