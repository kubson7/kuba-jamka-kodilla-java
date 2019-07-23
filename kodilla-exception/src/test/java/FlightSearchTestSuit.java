import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightSearch;
import com.kodilla.exception.test.RouteNotFoundException;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchTestSuit {
    @Test
    public void testSearchingFlight() {
        //Given
        Flight flight1 = new Flight("Lotnisko 1", "Lotnisko 6");
        Flight flight2 = new Flight("Lotnisko 2", "Lotnisko 7");
        Flight flight3 = new Flight("Lotnisko 3", "Lotnisko 8");
        Flight flight4 = new Flight("Lotnisko 4", "Lotnisko 9");
        Flight flight5 = new Flight("Lotnisko 5", "Lotnisko 10");

        Map<String, Boolean> airportsName = new HashMap<>();

        airportsName.put("Lotnisko 6", true);
        airportsName.put("Lotnisko 7", false);
        airportsName.put("Lotnisko 8", false);
        airportsName.put("Lotnisko 9", true);
        airportsName.put("Lotnisko 10", true);
        airportsName.put("Lotnisko 5", true);
        airportsName.put("Lotnisko 4", true);

        FlightSearch flightSearch = new FlightSearch(airportsName);
        try {
            //Then
            Assert.assertEquals(false, flightSearch.findFlight(flight4));
        } catch (RouteNotFoundException r){};

    }
}
