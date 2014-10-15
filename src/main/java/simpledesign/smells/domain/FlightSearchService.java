package simpledesign.smells.domain;

import java.util.Date;

public class FlightSearchService {
    public boolean isFlightAvailable(Flight flight) {
        return true;
    }

    public Flight findFlight(int flightNumber, String departureAirport, String arrivalAirport, Date departureDate) {
        return new Flight();
    }
}
