# Anudip
[![Ask DeepWiki](https://devin.ai/assets/askdeepwiki.png)](https://deepwiki.com/vijaybarhate/Anudip)

This repository contains a simple command-line interface (CLI) application written in Java that demonstrates fundamental database operations: Create, Read, Update, and Delete (CRUD). The application manages employee records in a MySQL database using JDBC.

## Features

*   **Add Employee:** Insert a new employee record with name, department, and salary.
*   **View Employees:** Retrieve and display all employee records from the database.
*   **Update Employee:** Modify the details of an existing employee based on their ID.
*   **Delete Employee:** Remove an employee record from the database using their ID.

## Prerequisites

*   Java Development Kit (JDK)
*   A running instance of MySQL Server.
*   MySQL JDBC Driver.

## Setup

1.  **Database and Table Creation**

    Before running the application, you need to set up the database and table. Connect to your MySQL server and execute the following SQL commands:

    ```sql
    -- Create the database
    CREATE DATABASE company;

    -- Switch to the new database
    USE company;

    -- Create the employee table
    CREATE TABLE employee (
        eid INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(255) NOT NULL,
        dept VARCHAR(100),
        sal DOUBLE
    );
    ```

2.  **Database Configuration**

    The database connection details (URL, username, and password) are hardcoded in `CRUD.java`. Open the file and modify these values if they differ from your local MySQL setup.

    ```java
    static final String url="jdbc:mysql://localhost:3306/company";
    static final String uname="root";
    static final String pass="root";
    ```

## How to Run

1.  Clone the repository or download the `CRUD.java` file.

2.  Open a terminal or command prompt and navigate to the directory containing the file.

3.  Compile the Java source code:
    ```sh
    javac CRUD.java
    ```

4.  Run the compiled application. Note that the class name is `EmpCRUD`.
    ```sh
    java EmpCRUD
    ```

5.  The application will present a menu. Follow the on-screen prompts to perform CRUD operations.

    ```
    1. Add Employee
    2. View All Employee
    3. Update Employee
    4. Delete Employee
    5. Exit
    Enter your choice:
