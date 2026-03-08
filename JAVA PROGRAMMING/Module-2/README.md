# Module 2 Notes: Java Object-Oriented Programming (OOP)

OOP is the core of Java. It focuses on objects and data rather than logic alone.

---

## 1. OOP Basics

- **Class**: A blueprint (e.g., `Dog`).
- **Object**: An instance of a class (e.g., `myDog`).
- **Methods**: Actions an object can perform.
- **`this`**: Refers to the current object.
- **`instanceof`**: Checks if an object belongs to a class.

---

## 2. Constructors & Final

- **Constructor**: A special method to initialize objects. Has the same name as the class and no return type.
- **Overloading**: Multiple constructors with different parameters.
- **`final` keyword**:
  - Variable: Value is fixed (Constant).
  - Method: Cannot be overridden.
  - Class: Cannot be inherited.

---

## 3. The Four Pillars of OOP

1. **Encapsulation**: Private data + Public getters/setters.
2. **Inheritance**: `extends` keyword. Reusing code from a parent class.
3. **Polymorphism**:
   - **Overloading** (Compile-time): Same method name, different parameters.
   - **Overriding** (Run-time): Child class changes parent method logic.
4. **Abstraction**:
   - **Abstract Class**: Can have implementation; cannot be instantiated.
   - **Interface**: A complete blueprint; supports multiple inheritance.

---

## 4. Advanced Class Types

- **Nested/Inner Classes**: Class inside a class.
- **Static Nested Classes**: Can be accessed without an outer class object.
- **Anonymous Classes**: Classes without a name (one-time use).
- **Singleton**: Ensures only one object is ever created (e.g., Database connection).

---

## 5. Miscellaneous

- **Strings**: Immutable text objects.
- **Recursion**: A method calling itself.
- **Enums**: Group of constants (unmutable values).
- **Reflection**: Inspecting class structure at runtime.
