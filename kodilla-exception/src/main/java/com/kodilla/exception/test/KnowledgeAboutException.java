package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class KnowledgeAboutException {
    public static void main (String[] args) {

        Flight flight1 = new Flight("Lotnisko 1", "Lotnisko 6");
        Flight flight2 = new Flight("Lotnisko 2", "lokomotywa");
        Flight flight3 = new Flight("Lotnisko 3", "Lotnisko 8");
        Flight flight4 = new Flight("Lotnisko 4", "Lotnisko 9");
        Flight flight5 = new Flight("Lotnisko 5", "Lotnisko 10");

        Map<String,Boolean> airportsName = new HashMap<>();

        airportsName.put("Lotnisko 1",true);
        airportsName.put("Lotnisko 2",false);
        airportsName.put("Lotnisko 3",false);
        airportsName.put("Lotnisko 4",true);
        airportsName.put("Lotnisko 5",true);
        airportsName.put("Lotnisko 6",false);
        airportsName.put("Lotnisko 7",true);
        airportsName.put("Lotnisko 8",false);
        airportsName.put("Lotnisko 9",true);
        airportsName.put("Lotnisko 10",false);

        FlightSearch flightSearch = new FlightSearch(airportsName);

        try {
            flightSearch.findFlight(flight1);
            System.out.println("Lot się odbędzie");
        }catch (RouteNotFoundException e){
            System.out.println(e);
        }
    }
}
