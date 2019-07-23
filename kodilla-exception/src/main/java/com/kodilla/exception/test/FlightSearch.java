package com.kodilla.exception.test;

import java.util.Map;
import java.util.stream.Stream;

public class FlightSearch {

    Map<String, Boolean> airportsName;

    public FlightSearch(Map<String, Boolean> airportsName) {
        this.airportsName = airportsName;
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        boolean firstAirportPresent = airportsName.entrySet().stream()
                .anyMatch(entry -> entry.getKey().equals(flight.getDepartureAirport()));
        System.out.println(firstAirportPresent);
        boolean secondAirportPreset = airportsName.entrySet().stream()
                .anyMatch(entry -> entry.getKey().equals(flight.getArrivalAirport()));
        System.out.println(secondAirportPreset);

        if (firstAirportPresent && secondAirportPreset) {
            return true;
        } else {
            throw new RouteNotFoundException();
        }

//
//


    }
}



