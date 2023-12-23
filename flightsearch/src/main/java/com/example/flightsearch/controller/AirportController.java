// The AirportController class exposes RESTful endpoints for airport-related operations. It handles HTTP requests and delegates the processing to the AirportService. It includes endpoints for retrieving all airports and searching for airports based on city.

package com.example.flightsearch.controller;

import com.example.flightsearch.service.AirportService;
import com.example.flightsearch.entity.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airports")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping
    public ResponseEntity<List<Airport>> getAllAirports() {
        List<Airport> airports = airportService.getAllAirports();
        return new ResponseEntity<>(airports, HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Airport>> searchAirports(@RequestParam String city) {
        // Input validation logic
        if (city == null || city.isEmpty()) {
            // Handle invalid input
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        List<Airport> foundAirports = airportService.searchAirports(city);
        return new ResponseEntity<>(foundAirports, HttpStatus.OK);
    }

}

