/*
 * -------------------------------------------------------------------------
 * MODULE 5: JDBC SETUP & CONNECTIVITY
 * -------------------------------------------------------------------------
 * 
 * 1. JDBC API: Java Database Connectivity allows Java programs to interact 
 *    with any relational database.
 * 
 * 2. CORE COMPONENTS:
 *    - DriverManager: Manages database drivers.
 *    - Connection: Interface to interact with the database.
 *    - Statement: Used to execute SQL queries.
 * 
 * 3. STEPS TO CONNECT:
 *    A. Load the Driver.
 *    B. Establish Connection using URL, User, Pass.
 *    C. Execute Queries.
 *    D. Close Connection.
 * 
 * -------------------------------------------------------------------------
 */

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;

public class JDBC_Setup {
    public static void main(String[] args) {
        
        // --- External Configuration ---
        Properties props = new Properties();
        
        try (FileInputStream fis = new FileInputStream("db.properties")) {
            props.load(fis);
            
            String driver = props.getProperty("db.driver");
            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String pass = props.getProperty("db.password");

            // 1. Loading the JDBC Driver
            Class.forName(driver);
            System.out.println("Driver loaded successfully: " + driver);

            // 2. Establishing Connection
            try (Connection conn = DriverManager.getConnection(url, user, pass)) {
                if (conn != null) {
                    System.out.println("Successfully connected to the database!");
                }
            }
            
        } catch (Exception e) {
            System.err.println("JDBC Error: " + e.getMessage());
            System.out.println("\nNote: To run this code, you need a database driver (JAR file) and a running database.");
        }
    }
}
