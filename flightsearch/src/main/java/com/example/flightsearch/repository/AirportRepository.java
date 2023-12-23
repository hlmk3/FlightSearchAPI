// The AirportRepository interface extends JpaRepository and provides methods for CRUD operations on airport entities. It includes a custom query method for searching airports based on city.

package com.example.flightsearch.repository;

import com.example.flightsearch.entity.Airport;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Long> {

    List<Airport> findByCityContaining(String city);


}
