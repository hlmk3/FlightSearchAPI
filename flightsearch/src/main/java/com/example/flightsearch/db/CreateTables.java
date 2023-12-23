// This class is responsible for creating the necessary database tables (flights and airports) by defining their schema using SQL statements. It is typically used for database initialization.

package com.example.flightsearch.db;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTables {

    public static void main(String[] args) {
        try (Connection connection = DatabaseConfig.getConnection();
             Statement statement = connection.createStatement()) {

            // Create Flights table
            String createFlightsTable = "CREATE TABLE IF NOT EXISTS flights ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "departure_airport VARCHAR(255),"
                    + "arrival_airport VARCHAR(255),"
                    + "departure_datetime DATETIME,"
                    + "return_datetime DATETIME,"
                    + "price DECIMAL(10, 2)"
                    + ")";
            statement.execute(createFlightsTable);

            // Create Airports table
            String createAirportsTable = "CREATE TABLE IF NOT EXISTS airports ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "city VARCHAR(255)"
                    + ")";
            statement.execute(createAirportsTable);

            System.out.println("Tables created successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
