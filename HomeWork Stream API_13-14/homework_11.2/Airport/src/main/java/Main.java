import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        findPlanesLeavingInTheNextTwoHours(Airport.getInstance()).forEach(System.out::println);
    }

        public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        return airport.getTerminals().stream()
                .flatMap(schedule -> schedule.getFlights().stream())
                .filter(plane -> plane.getType().equals(Flight.Type.DEPARTURE))
                .filter(a -> a.getDate().toInstant().isBefore(Instant.now().plusSeconds(3600*2)))
                .filter(a -> a.getDate().toInstant().isAfter(Instant.now()))
                .collect(Collectors.toList());
    }
}