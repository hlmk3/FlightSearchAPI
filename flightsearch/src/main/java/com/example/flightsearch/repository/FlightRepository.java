// The FlightRepository interface extends JpaRepository and provides methods for CRUD operations on flight entities. It also includes a custom query method for searching flights based on specified criteria.

package com.example.flightsearch.repository;

import com.example.flightsearch.entity.Flight;

import java.time.LocalDateTime;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    
        // This methods finds by departure airport, arrival airport, departure date/time, and return date/time.
        List<Flight> findflight(
        String departureAirport, 
        String arrivalAirport, 
        LocalDateTime departureDateTime, 
        LocalDateTime returnDateTime
    );
}
