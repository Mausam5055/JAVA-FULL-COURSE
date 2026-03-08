# JPA: Java Persistence API

JPA is a specification that provides an easier way to handle relational data in Java using **Object-Relational Mapping (ORM)**.

---

## 1. JPA Architecture

JPA works by mapping Java objects directly to database tables.

- **Persistence Unit**: Group of all entity classes. Defined in `persistence.xml`.
- **EntityManagerFactory**: Used to create an `EntityManager`. (Heavyweight)
- **EntityManager**: The primary interface for CRUD operations. (Lightweight)
- **Persistence Context**: A set of entity instances in which for any persistent entity identity there is a unique entity instance.

---

## 2. ORM Components

**ORM (Object-Relational Mapping)** involves:

- **Entities**: Java classes mapped to tables.
- **Mapping Metadata**: Annotations telling JPA how to map fields (e.g., `@Column`, `@Id`).
- **Entity Manager**: Handles lifecycle of objects (Managed, Detached, Removed).

---

## 3. Why use JPA over JDBC?

- **Less Code**: No need to write complex SQL strings manually.
- **Object-Oriented**: Work with Java objects instead of rows and columns.
- **Database Independence**: Easily switch from MySQL to Oracle without changing code.
- **Automatic Caching**: Improved performance.
