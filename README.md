# Java CRUD Application with MySQL Database

This Java application demonstrates basic CRUD (Create, Read, Update, Delete) operations using MySQL database connectivity. It allows you to interact with a "students" table, where you can insert, update, retrieve, and delete student records.

## Overview

This CRUD application showcases how to perform fundamental database operations using Java and MySQL. It provides a command-line interface (CLI) for managing student records stored in a MySQL database. The application connects to MySQL via JDBC (Java Database Connectivity), executes SQL queries, and handles user input through standard input (console).

## Features

- **Create Database and Table**: Automatically creates a MySQL database named `student` and a table named `students` if they do not exist.
  
- **Insert Data**: Allows users to insert new student records into the `students` table with fields for ID, Name, and Email.

- **Retrieve Data**: Retrieves and displays all student records from the `students` table.

- **Update Data**: Updates existing student records based on ID with new Name and Email values.

- **Delete Data**: Deletes a student record from the `students` table based on ID.

## Prerequisites

Before running this application, ensure you have the following installed:

- Java Development Kit (JDK)
- MySQL Server
- MySQL Connector/J (JDBC Driver for MySQL)

## Setup

1. **Clone the repository:**

   ```bash
   git clone https://github.com/diwasbk/java-crud-MySQL.git
   cd java-crud-MySQL

## Author

- [Diwas Bk](https://github.com/diwasbk)