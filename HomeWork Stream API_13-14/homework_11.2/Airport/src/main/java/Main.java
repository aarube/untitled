import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

import static com.skillbox.airport.Flight.Type.DEPARTURE;

public class Main {
    public static void main(String[] args) {
        findPlanesLeavingInTheNextTwoHours(Airport.getInstance()).forEach(System.out::println);

        findPlanesLeavingInTheNextTwoHoursHardCode(Airport.getInstance()).forEach(System.out::println);
    }
    
    public static List<Flight> findPlanesLeavingInTheNextTwoHoursHardCode(Airport airport) {
        ArrayList<Flight> schedule = new ArrayList<>();
        ArrayList<Flight> departSchedule = new ArrayList<>();
        ArrayList<Flight> sortTime = new ArrayList<>();
        for (int i = 0; i < airport.getTerminals().size(); i++) {
            schedule.addAll(airport.getTerminals().get(i).getFlights());
        }
        for (int i = 0; i < schedule.size(); i++) {
            if (schedule.get(i).getType() == DEPARTURE) {
                departSchedule.add(schedule.get(i));
            }
        }
        for (int i = 0; i < departSchedule.size(); i++) {
            if (departSchedule.get(i).getDate().toInstant().isBefore(Instant.now().plusSeconds(3600 * 2))
                    && departSchedule.get(i).getDate().toInstant().isAfter(Instant.now())) {
                sortTime.add(departSchedule.get(i));
            }
        }
        return sortTime;
    }
    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        return airport.getTerminals().stream()
                .flatMap(schedule -> schedule.getFlights().stream())
                .filter(departure -> departure.getType().equals(DEPARTURE))
                .filter(twoH -> twoH.getDate().toInstant().isBefore(Instant.now().plusSeconds(3600 * 2)))
                .filter(a -> a.getDate().toInstant().isAfter(Instant.now())).collect(Collectors.toList());
    }
}