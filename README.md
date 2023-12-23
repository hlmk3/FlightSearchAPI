# Amadeus Travel to Future Program - Case Study
Flight Search API (Backend Developer)

## Overview
An easy-to-use API for handling flight and airport data is offered by the Flight Search App, a Spring Boot application. 
It features scheduled background jobs for retrieving flight information, CRUD operations on flights and airports, and flight search capabilities based on predefined criteria.

## Features
- **Database Schema:** The application uses SQLite as the database and defines two entities: Flight and Airport.

- **CRUD Operations:** CRUD operations are implemented for both flights and airports, allowing users to manage and retrieve information.

- **Search API:** The API includes an endpoint for searching flights based on departure and arrival airports, departure date, and return date.

- **Scheduled Background Jobs:** A scheduled job runs daily to fetch flight information from a mock third-party API and saves it to the database.

- **RESTful Endpoints:** RESTful endpoints are provided for flights and airports, allowing users to interact with the application programmatically.

## Dependencies
- Spring Boot 
- Spring Data JPA
- SQLite JDBC
- Springfox Swagger



