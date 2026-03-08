/*
 * -------------------------------------------------------------------------
 * MODULE 5: JPA ENTITY (MODEL)
 * -------------------------------------------------------------------------
 * 
 * 1. @Entity: Marks this class as a JPA entity.
 * 2. @Table: Specifies the table name in the DB.
 * 3. @Id: Marks the primary key field.
 * 4. @GeneratedValue: Automatically generates ID values.
 * 5. @Column: Maps the field to a specific database column.
 * 
 * -------------------------------------------------------------------------
 */

import javax.persistence.*;

@Entity
@Table(name = "employee_table")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "emp_name", nullable = false)
    private String name;

    @Column(name = "emp_department")
    private String department;

    // Default Constructor (Required by JPA)
    public Employee() {}

    // Parametrized Constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}
