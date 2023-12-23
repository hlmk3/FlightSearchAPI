// The AirportService class contains business logic related to airports. It interacts with the AirportRepository to perform operations such as retrieving all airports, searching for airports, creating airports, and deleting airports.

package com.example.flightsearch.service;

import com.example.flightsearch.repository.AirportRepository;
import com.example.flightsearch.entity.Airport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;

    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    public Airport getAirportById(Long id) {
        return airportRepository.findById(id).orElse(null);
    }

    public Airport createAirport(Airport airport) {
      
        return airportRepository.save(airport);
    }

    public void deleteAirport(Long id) {
        airportRepository.deleteById(id);
    }

    public List<Airport> searchAirports(String city) {
       
        return airportRepository.findByCityContaining(city);
    }
}
