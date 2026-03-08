# Module 5 Exam Questions: JDBC & JPA

Test your understanding of database interactions and Object-Relational Mapping (ORM).

## Section 1: Multiple Choice Questions (MCQs)

1. **What does JDBC stand for?**
   - A) Java Data Base Connection
   - B) Java Database Connectivity
   - C) Java Distributed Binary Connection
   - D) Just Database Connection

2. **Which method is used to retrieve data using a SELECT query in JDBC?**
   - A) executeUpdate()
   - B) executeQuery()
   - C) executeSelect()
   - D) getResultSet()

3. **In JPA, what does "ORM" stand for?**
   - A) Object-Relational Mapping
   - B) Oracle-Relational Management
   - C) Object-Real Memory
   - D) Object-Reporting Mode

4. **Which annotation is used to mark a primary key in a JPA Entity?**
   - A) @PrimaryKey
   - B) @Id
   - C) @Key
   - D) @Main

5. **Where is JDBC driver information commonly stored to keep it separate from Java code?**
   - A) Database tables
   - B) .properties file
   - C) .txt file
   - D) System environment variables

---

## Section 2: Coding Challenges

### Challenge 1: JDBC Connectivity

Write a code snippet to load the MySQL JDBC driver and establish a connection. Assume you have the URL, user, and password strings.

### Challenge 2: JPA Entity

Create a JPA Entity class called `Product` with two fields: `int id` (Primary Key) and `String name` (Mapped to column "product_name").

---

## Answer Key

**MCQs:**

1. B (Java Database Connectivity)
2. B (executeQuery)
3. A (Object-Relational Mapping)
4. B (@Id)
5. B (.properties file)
