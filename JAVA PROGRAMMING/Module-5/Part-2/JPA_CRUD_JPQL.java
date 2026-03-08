/*
 * -------------------------------------------------------------------------
 * MODULE 5: JPA CRUD OPERATIONS & JPQL
 * -------------------------------------------------------------------------
 * 
 * 1. PERSIST: Save a new object to the database (INSERT).
 * 2. FIND: Retrieve an object by its ID (SELECT).
 * 3. REMOVE: Delete an object from the database (DELETE).
 * 
 * 4. JPQL (Java Persistence Query Language):
 *    - Similar to SQL but operates on OBJECTS and FIELDS instead of 
 *      tables and columns.
 *    - Example: "SELECT e FROM Employee e WHERE e.name = :name"
 * 
 * -------------------------------------------------------------------------
 */

import javax.persistence.*;
import java.util.List;

public class JPA_CRUD_JPQL {
    public static void main(String[] args) {
        
        // --- Setting up EntityManager ---
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        try {
            // 1. Transaction Start
            em.getTransaction().begin();

            // --- CREATE (Persist) ---
            Employee newEmp = new Employee("Alice", "Finance");
            em.persist(newEmp);
            System.out.println("Employee saved!");

            // --- READ (Find) ---
            Employee found = em.find(Employee.class, newEmp.getId());
            System.out.println("Found Employee: " + found.getName());

            // --- JPQL (Advanced Mapping/Querying) ---
            String jpql = "SELECT e FROM Employee e WHERE e.department = 'Finance'";
            TypedQuery<Employee> query = em.createQuery(jpql, Employee.class);
            List<Employee> results = query.getResultList();
            
            System.out.println("\n--- JPQL Results ---");
            for (Employee e : results) {
                System.out.println(e.getName());
            }

            // 2. Commit Transaction
            em.getTransaction().commit();

        } finally {
            em.close();
            emf.close();
            System.out.println("\nNote: JPA requires a 'persistence.xml' file in your META-INF folder.");
        }
    }
}
