// The FlightService class contains business logic related to flights. It interacts with the FlightRepository to perform operations such as retrieving all flights, searching for flights, creating flights, and deleting flights.


package com.example.flightsearch.service;

import com.example.flightsearch.repository.FlightRepository;
import com.example.flightsearch.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Flight getFlightById(Long flightId) {
        return flightRepository.findById(flightId).orElse(null);
    }

    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }

   public List<Flight> searchFlights(String departure, String arrival, LocalDateTime departureDateTime, LocalDateTime returnDateTime) {
        return flightRepository.findflight(departure, arrival, departureDateTime, returnDateTime);
    }

    public void deleteFlight(Long flightId) {
        flightRepository.deleteById(flightId);
    }
}
