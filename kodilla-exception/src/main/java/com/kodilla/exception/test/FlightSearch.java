package com.kodilla.exception.test;

import java.util.Map;

public class FlightSearch {

    Map<String, Boolean> airportsName;

    public FlightSearch(Map<String, Boolean> airportsName) {
        this.airportsName = airportsName;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        if (airportsName.containsKey(flight.getArrivalAirport())) {
            if (airportsName.get(flight.getArrivalAirport())) {
                System.out.println("Lot dostępny");
            } else System.out.println("Lotnisko niedostępne");
        } else throw new RouteNotFoundException();
    }
}



