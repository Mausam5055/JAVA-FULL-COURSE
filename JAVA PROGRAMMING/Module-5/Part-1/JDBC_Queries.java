/*
 * -------------------------------------------------------------------------
 * MODULE 5: JDBC QUERIES & RESULT SETS
 * -------------------------------------------------------------------------
 * Program: Connect to a database using JDBC driver, submit queries,
 *          and get results from the database.
 * 
 * Database: SQLite (Embedded - no server required)
 * Driver:   org.sqlite.JDBC (sqlite-jdbc.jar)
 * 
 * CONCEPTS DEMONSTRATED:
 * 1. Loading JDBC Driver & Establishing Connection
 * 2. Creating Tables using Statement
 * 3. INSERT (Create) - Adding records
 * 4. SELECT (Read)   - Querying & displaying records using ResultSet
 * 5. UPDATE          - Modifying existing records
 * 6. DELETE          - Removing records
 * 7. Proper resource management with try-with-resources
 * -------------------------------------------------------------------------
 */

import java.sql.*;

public class JDBC_Queries {

    // SQLite database file (created automatically if not present)
    static final String DB_URL = "jdbc:sqlite:student_database.db";

    public static void main(String[] args) {

        System.out.println("==========================================================");
        System.out.println("   JDBC DATABASE OPERATIONS DEMO (SQLite)");
        System.out.println("==========================================================");

        // ------------------------------------------------------------------
        // STEP 1: Load JDBC Driver & Establish Connection
        // ------------------------------------------------------------------
        try {
            // Load the SQLite JDBC driver class
            Class.forName("org.sqlite.JDBC");
            System.out.println("\n[INFO] SQLite JDBC Driver loaded successfully.");
        } catch (ClassNotFoundException e) {
            System.err.println("[ERROR] SQLite JDBC Driver not found!");
            System.err.println("Make sure sqlite-jdbc.jar is in the classpath.");
            return;
        }

        // try-with-resources ensures Connection is closed automatically
        try (Connection conn = DriverManager.getConnection(DB_URL)) {

            System.out.println("[INFO] Connected to database: " + DB_URL);
            System.out.println("[INFO] Database Product: "
                    + conn.getMetaData().getDatabaseProductName()
                    + " " + conn.getMetaData().getDatabaseProductVersion());

            // Create a Statement object for executing SQL
            Statement stmt = conn.createStatement();

            // ----------------------------------------------------------
            // STEP 2: CREATE TABLE
            // ----------------------------------------------------------
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Students ("
                    + " id      INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + " name    TEXT    NOT NULL,"
                    + " branch  TEXT    NOT NULL,"
                    + " marks   REAL    NOT NULL"
                    + ")";
            stmt.executeUpdate(createTableSQL);
            System.out.println("\n[INFO] Table 'Students' created / already exists.");

            // Clear any old data for a clean demo run
            stmt.executeUpdate("DELETE FROM Students");
            // Reset auto-increment counter
            stmt.executeUpdate("DELETE FROM sqlite_sequence WHERE name='Students'");

            // ----------------------------------------------------------
            // STEP 3: INSERT Records (Create Operation)
            // ----------------------------------------------------------
            System.out.println("\n----------------------------------------------------------");
            System.out.println("  INSERT OPERATION (Adding Records)");
            System.out.println("----------------------------------------------------------");

            String[] insertQueries = {
                "INSERT INTO Students (name, branch, marks) VALUES ('Aman Sharma',   'CSE', 87.5)",
                "INSERT INTO Students (name, branch, marks) VALUES ('Priya Singh',   'ECE', 92.0)",
                "INSERT INTO Students (name, branch, marks) VALUES ('Rahul Verma',   'CSE', 78.3)",
                "INSERT INTO Students (name, branch, marks) VALUES ('Sneha Patel',   'IT',  95.1)",
                "INSERT INTO Students (name, branch, marks) VALUES ('Vikram Reddy',  'ME',  81.7)"
            };

            int totalInserted = 0;
            for (String query : insertQueries) {
                totalInserted += stmt.executeUpdate(query);
            }
            System.out.println("[SUCCESS] " + totalInserted + " records inserted.");

            // ----------------------------------------------------------
            // STEP 4: SELECT Records (Read Operation) using ResultSet
            // ----------------------------------------------------------
            System.out.println("\n----------------------------------------------------------");
            System.out.println("  SELECT OPERATION (Reading All Records)");
            System.out.println("----------------------------------------------------------");

            String selectSQL = "SELECT id, name, branch, marks FROM Students";
            ResultSet rs = stmt.executeQuery(selectSQL);

            // Print table header
            System.out.printf("%-5s | %-18s | %-8s | %-6s%n", "ID", "Name", "Branch", "Marks");
            System.out.println("------|--------------------| ---------|-------");

            while (rs.next()) {
                int id        = rs.getInt("id");
                String name   = rs.getString("name");
                String branch = rs.getString("branch");
                double marks  = rs.getDouble("marks");
                System.out.printf("%-5d | %-18s | %-8s | %-6.1f%n", id, name, branch, marks);
            }
            rs.close();

            // ----------------------------------------------------------
            // STEP 5: SELECT with WHERE clause (Conditional Query)
            // ----------------------------------------------------------
            System.out.println("\n----------------------------------------------------------");
            System.out.println("  SELECT WITH WHERE CLAUSE (marks > 85)");
            System.out.println("----------------------------------------------------------");

            String filterSQL = "SELECT id, name, branch, marks FROM Students WHERE marks > 85";
            ResultSet rs2 = stmt.executeQuery(filterSQL);

            System.out.printf("%-5s | %-18s | %-8s | %-6s%n", "ID", "Name", "Branch", "Marks");
            System.out.println("------|--------------------| ---------|-------");

            while (rs2.next()) {
                System.out.printf("%-5d | %-18s | %-8s | %-6.1f%n",
                        rs2.getInt("id"),
                        rs2.getString("name"),
                        rs2.getString("branch"),
                        rs2.getDouble("marks"));
            }
            rs2.close();

            // ----------------------------------------------------------
            // STEP 6: UPDATE Records (Update Operation)
            // ----------------------------------------------------------
            System.out.println("\n----------------------------------------------------------");
            System.out.println("  UPDATE OPERATION");
            System.out.println("----------------------------------------------------------");

            String updateSQL = "UPDATE Students SET marks = 91.0 WHERE name = 'Rahul Verma'";
            int rowsUpdated = stmt.executeUpdate(updateSQL);
            System.out.println("[SUCCESS] Rows updated: " + rowsUpdated);
            System.out.println("  -> Rahul Verma's marks changed to 91.0");

            // Show updated data
            System.out.println("\n  Updated Records:");
            ResultSet rs3 = stmt.executeQuery(selectSQL);
            System.out.printf("  %-5s | %-18s | %-8s | %-6s%n", "ID", "Name", "Branch", "Marks");
            System.out.println("  ------|--------------------| ---------|-------");
            while (rs3.next()) {
                System.out.printf("  %-5d | %-18s | %-8s | %-6.1f%n",
                        rs3.getInt("id"),
                        rs3.getString("name"),
                        rs3.getString("branch"),
                        rs3.getDouble("marks"));
            }
            rs3.close();

            // ----------------------------------------------------------
            // STEP 7: DELETE Records (Delete Operation)
            // ----------------------------------------------------------
            System.out.println("\n----------------------------------------------------------");
            System.out.println("  DELETE OPERATION");
            System.out.println("----------------------------------------------------------");

            String deleteSQL = "DELETE FROM Students WHERE name = 'Vikram Reddy'";
            int rowsDeleted = stmt.executeUpdate(deleteSQL);
            System.out.println("[SUCCESS] Rows deleted: " + rowsDeleted);
            System.out.println("  -> Vikram Reddy removed from table.");

            // Show final data
            System.out.println("\n  Final Records After Deletion:");
            ResultSet rs4 = stmt.executeQuery(selectSQL);
            System.out.printf("  %-5s | %-18s | %-8s | %-6s%n", "ID", "Name", "Branch", "Marks");
            System.out.println("  ------|--------------------| ---------|-------");
            while (rs4.next()) {
                System.out.printf("  %-5d | %-18s | %-8s | %-6.1f%n",
                        rs4.getInt("id"),
                        rs4.getString("name"),
                        rs4.getString("branch"),
                        rs4.getDouble("marks"));
            }
            rs4.close();

            // ----------------------------------------------------------
            // STEP 8: Aggregate Query (COUNT, AVG)
            // ----------------------------------------------------------
            System.out.println("\n----------------------------------------------------------");
            System.out.println("  AGGREGATE QUERIES");
            System.out.println("----------------------------------------------------------");

            ResultSet rs5 = stmt.executeQuery(
                    "SELECT COUNT(*) AS total, AVG(marks) AS avg_marks FROM Students");
            if (rs5.next()) {
                System.out.println("  Total Students : " + rs5.getInt("total"));
                System.out.printf("  Average Marks  : %.2f%n", rs5.getDouble("avg_marks"));
            }
            rs5.close();

            // Close statement
            stmt.close();

            System.out.println("\n==========================================================");
            System.out.println("  ALL JDBC OPERATIONS COMPLETED SUCCESSFULLY!");
            System.out.println("==========================================================");

        } catch (SQLException e) {
            System.err.println("\n[DATABASE ERROR] " + e.getMessage());
            e.printStackTrace();
        }
    }
}
