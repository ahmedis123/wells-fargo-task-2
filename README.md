# Task 2 Starter Repo
Contains Everything you need to get started on task 2 of Forage's Wells Fargo software engineering program
---


## Task 2: Implement a Data Model

In this task, I implemented the data model based on the UML diagram provided earlier. The following steps were completed:

### Implemented Entities:
- **FinancialAdvisor**: Contains name, email, phone, and business hours.
- **Client**: Contains first name, last name, date of birth, and contact info. Linked to FinancialAdvisor.
- **Portfolio**: Represents a client’s investment portfolio.
- **Security**: Contains details about each investment/security.
- **ClientSecurity**: A join table to map clients to the securities they own.

### Key Features:
- All entities are annotated with `@Entity` from `jakarta.persistence`.
- All IDs are auto-generated using `@GeneratedValue`.
- Relationships like `@ManyToOne`, `@OneToMany`, and `@ManyToMany` are implemented.
- Used `@EmbeddedId` and `@Embeddable` for the composite key in the join table.
- Constructors, getters, and setters are provided for all instance variables.

### Folder Structure:
All entity classes are located under:

src/main/java/com/wellsfargo/softwareengineering/entities/

### Technologies Used:
- Java
- Spring Boot
- JPA (Jakarta Persistence API)

### How to Run:
1. Clone the repo
2. Open with IntelliJ
3. Run the Spring Boot application


---

