/*
 * -------------------------------------------------------------------------
 * MODULE 5: JDBC QUERIES & RESULT SETS
 * -------------------------------------------------------------------------
 * 
 * 1. STATEMENT: Used to execute static SQL queries.
 * 
 * 2. RESULTSET: A table of data representing a database result set.
 *    - next(): Moves the cursor to the next row.
 *    - getInt(), getString(): Get column values.
 * 
 * 3. CRUD OPERATIONS:
 *    - Create (INSERT)
 *    - Read (SELECT)
 *    - Update (UPDATE)
 *    - Delete (DELETE)
 * 
 * -------------------------------------------------------------------------
 */

import java.sql.*;

public class JDBC_Queries {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/my_database";
        String user = "root";
        String pass = "password";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            
            // 1. Creating a Statement
            Statement stmt = conn.createStatement();

            // --- SELECT Query (Read) ---
            String selectSql = "SELECT id, name, salary FROM Employees";
            ResultSet rs = stmt.executeQuery(selectSql);
            
            System.out.println("ID | Name | Salary");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                System.out.println(id + " | " + name + " | " + salary);
            }

            // --- UPDATE Query ---
            String updateSql = "UPDATE Employees SET salary = 55000 WHERE id = 101";
            int rowsUpdated = stmt.executeUpdate(updateSql);
            System.out.println("\nRows updated: " + rowsUpdated);

        } catch (SQLException e) {
            System.err.println("Database Error: " + e.getMessage());
        }
    }
}
