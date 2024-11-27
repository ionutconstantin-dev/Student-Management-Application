---

# Student Management Application

A Spring Boot application for managing student records, including features for listing, creating, updating, and deleting students. This application uses a layered architecture and integrates with a database for persistent storage of student data.

---

## Features

- List all students in the system.
- Add new students via a user-friendly form.
- Edit existing student details.
- Delete students from the system.
- Database integration with JPA and Hibernate.

---

## Prerequisites

Ensure you have the following installed:

- [Java 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven](https://maven.apache.org/)
- [MySQL](https://www.mysql.com/) or another supported database.

---

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/ionutconstantin-dev/Student-Management-Application.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Student-Management-Application
   ```
3. Configure the database connection in the `application.properties` file:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/student_db
   spring.datasource.username=<your-username>
   spring.datasource.password=<your-password>
   spring.jpa.hibernate.ddl-auto=update
   ```

4. Build and run the application:
   ```bash
   mvn spring-boot:run
   ```

---

## Usage

### Running the Application

After starting the application, access the following features through a browser:

1. **List Students**
   - URL: `http://localhost:8080/students`
   - Displays all students in the system.

2. **Add a New Student**
   - URL: `http://localhost:8080/students/new`
   - Provides a form to add a new student.

3. **Edit a Student**
   - URL: `http://localhost:8080/students/edit/{id}`
   - Replace `{id}` with the student's ID to update their details.

4. **Delete a Student**
   - URL: `http://localhost:8080/students/{id}`
   - Replace `{id}` with the student's ID to delete their record.

---

## Project Structure

### **Controller**
- `StudentController`: Handles HTTP requests for listing, creating, editing, and deleting students.

### **Entity**
- `Student`: Represents the student data model with fields for ID, first name, last name, and email.

### **Service**
- `StudentService`: Defines the business logic for managing students.
- `StudentServiceImpl`: Implementation of the service layer using a repository.

### **Repository**
- `StudentRepository`: JPA repository for interacting with the database.

---

## Technologies Used

- **Spring Boot**: Framework for building the application.
- **Spring Data JPA**: For database operations.
- **Hibernate**: For object-relational mapping.
- **Thymeleaf**: For building the web front-end (HTML templates).
- **MySQL**: Database for storing student information.

---

## Example Data Flow

1. **User Request**:
   - The user accesses a URL (e.g., `/students`).
2. **Controller**:
   - The request is handled by `StudentController`, which fetches data from the `StudentService`.
3. **Service Layer**:
   - `StudentServiceImpl` interacts with `StudentRepository` to fetch or modify data.
4. **Repository**:
   - The `StudentRepository` interacts with the database to execute SQL queries.

---

## Contact

If you have any questions or suggestions, feel free to reach out:

- **Email**: ionutconstantin.dev@example.com
- **GitHub**: [ionutconstantin-dev](https://github.com/ionutconstantin-dev)

---
