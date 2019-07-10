package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class KnowledgeAboutException {
    public static void main (String[] args) {

        Flight flight1 = new Flight("Lotnisko1", "Lotnisko 6");
        Flight flight2 = new Flight("Lotnisko2", "Lotnisko 7");
        Flight flight3 = new Flight("Lotnisko3", "Lotnisko 8");
        Flight flight4 = new Flight("Lotnisko4", "Lotnisko 9");
        Flight flight5 = new Flight("Lotnisko5", "Lotnisko 10");

        Map<String,Boolean> airportsName = new HashMap<>();

        airportsName.put("Lotnisko 6",true);
        airportsName.put("Lotnisko 7",false);
        airportsName.put("Lotnisko 8",false);
        airportsName.put("Lotnisko 9",false);
        airportsName.put("Lotnisko 10",true);


        FlightSearch flightSearch = new FlightSearch(airportsName);

        try {
            flightSearch.findFlight(flight4);
        }catch (RouteNotFoundException e){
            System.out.println("Brak takiego lotniska w bazie");
        }

    }
}
