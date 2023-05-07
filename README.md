# Mapping_Hibernate

This project is a basic Employee-Address Management System built using Java, Spring Boot, Hibernate, and a SQL database. It demonstrates the use of one-to-one mapping between the Employee and Address entities.
## FrameWorks and Language Used

Java

Hibernate

Spring Boot

Spring Web

MySQL

Maven

## Data Flow

1- The client sends a request to the server through a RESTful API.

2- The request is handled by the controller, which interacts with the repository. 

3- The server processes the requests and interacts with the database using JDBC.

4- The database returns data to the server.

5- The server processes the data and sends an HTTP response to the client.

## Database Design

The database design for this project consists of two tables, employee and address. The employee table has a one-to-one relationship with the address table. The employee table has three columns: id, first_name, and last_name. The address table has four columns: id, street, city, state, and zip_code. The id column in both tables is used as a foreign key to create the one-to-one relationship between the two tables.

## Project Summary

TThe project demonstrates the basic implementation of a one-to-one mapping between the Employee and Address entities using Hibernate. It also showcases the use of CRUD operations on a SQL database using Spring Boot. The project uses Maven to manage dependencies and Spring Web Tools and Spring Web for development.
