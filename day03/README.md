# Day 03 – Spring Data JPA & H2 Database

## 📌 Overview
On Day 3, I integrated Spring Data JPA with an H2 database to persist data.
This project demonstrates how Spring Boot simplifies database operations
using repositories instead of writing SQL manually.

---

## 🧠 Concepts & Annotations Covered

### JPA & Persistence
- @Entity
- @Table
- @Id
- @GeneratedValue
- @Repository

### REST APIs
- @RestController
- @RequestMapping
- @GetMapping
- @PostMapping
- @RequestParam
- @PathVariable
- @RequestBody

### Database & Configuration
- H2 database integration
- Hibernate auto table creation
- application.properties configuration

---

## 🧩 Key Implementations

### Entity Layer
- Created `EmployeeEntity` to map Java objects to database tables
- Used `LocalDate` with `@JsonFormat` for date handling

### Repository Layer
- Implemented `JpaRepository<EmployeeEntity, Long>`
- Used built-in CRUD methods (`save`, `findAll`, `findById`)

### Controller Layer
- Exposed REST APIs to create and fetch employee records
- Connected controller directly with repository

---

## 🗄️ H2 Database
- Enabled H2 Console for inspection
- Used file-based H2 database
- Auto-generated schema via Hibernate

---

## 🚀 Key Takeaways
- JPA removes boilerplate SQL
- Spring Boot auto-configures database connections
- Repositories simplify CRUD operations
- Clean separation of layers improves maintainability

---
