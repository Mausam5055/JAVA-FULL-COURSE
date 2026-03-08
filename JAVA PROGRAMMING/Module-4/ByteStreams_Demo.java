/*
 * -------------------------------------------------------------------------
 * MODULE 4: BYTE-ORIENTED STREAMS
 * -------------------------------------------------------------------------
 * 
 * 1. BYTE STREAMS: Used to read/write 8-bit bytes. 
 *    Perfect for binary data like images, audio, etc.
 * 
 * 2. CLASSES:
 *    - FileInputStream: To read from a file.
 *    - FileOutputStream: To write to a file.
 * 
 * -------------------------------------------------------------------------
 */

import java.io.*;

public class ByteStreams_Demo {
    public static void main(String[] args) {
        
        String source = "source.txt";
        String destination = "copy.txt";

        // Create a dummy source file
        try (FileOutputStream out = new FileOutputStream(source)) {
            String content = "This is binary-compatible data.";
            out.write(content.getBytes());
            System.out.println("Source file created.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // --- Copying file using Byte Streams ---
        try (FileInputStream in = new FileInputStream(source);
             FileOutputStream out = new FileOutputStream(destination)) {
            
            int byteData;
            while ((byteData = in.read()) != -1) {
                out.write(byteData); // Writing 1 byte at a time
            }
            System.out.println("File copied successfully using Byte Streams.");
            
        } catch (IOException e) {
            System.out.println("Error during copy: " + e.getMessage());
        }
    }
}
