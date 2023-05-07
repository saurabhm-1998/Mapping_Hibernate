# Mapping_Hibernate

This project is a sample implementation of a web application built using Java, Hibernate, Spring Boot, and MySQL. The application demonstrates the usage of Hibernate for Object Relational Mapping (ORM) and the Spring framework for creating RESTful APIs. The project uses Maven as a build tool.

## FrameWorks and Language Used

Java

Hibernate

Spring Boot

MySQL

Maven

## Data Flow

1- The client sends a request to the server through a RESTful API.

2- The request is handled by the controller, which interacts with the repository.

3- The repository performs the required database operations using Hibernate.
The data is returned to the controller, which returns a response to the client.

## Database Design

The database design for this project consists of two tables, employee and address. The employee table has a one-to-one relationship with the address table. The employee table has three columns: id, first_name, and last_name. The address table has four columns: id, street, city, state, and zip_code. The id column in both tables is used as a foreign key to create the one-to-one relationship between the two tables.

## Project Summary

This project demonstrates how to build a web application using Java, Hibernate, and Spring Boot. It shows how to use Hibernate for Object Relational Mapping (ORM) and how to create RESTful APIs using the Spring framework. The project also demonstrates how to use Maven as a build tool and how to connect to a MySQL database. Overall, this project provides a good starting point for building a more complex web application using Java, Hibernate, and Spring Boot.
