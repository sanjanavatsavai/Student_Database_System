# Student Database Application

## Description

This Java application manages a student database, allowing users to enroll students, add courses, manage tuition payments, and view student information. It's a console-based application that demonstrates object-oriented programming concepts in Java.

## Features

- Enroll multiple students
- Generate unique student IDs
- Add courses for each student
- Calculate and manage tuition balances
- Display comprehensive student information

## Classes

### Student

The `Student` class represents individual students and contains methods for:

- Collecting student details (name, grade year)
- Generating a unique student ID
- Enrolling in courses
- Viewing and paying tuition balance
- Displaying student information

### StudentDbApp

The `StudentDbApp` class contains the main method and serves as the entry point for the application. It handles:

- User input for the number of students to enroll
- Creation of Student objects
- Enrollment and tuition payment processes
- Displaying information for all enrolled students

## How to Run

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Compile the Java files:
3. Run the application:
4. Follow the on-screen prompts to enroll students, add courses, and manage tuition payments.

## Usage Example

1. Enter the number of students to enroll.
2. For each student:
- Provide first name, last name, and grade year.
- Enter courses to enroll (type 'Q' to finish adding courses).
- Make tuition payments as prompted.
3. View the summary of all enrolled students.
