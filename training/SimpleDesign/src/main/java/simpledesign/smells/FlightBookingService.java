package simpledesign.smells;

import simpledesign.smells.domain.Flight;
import simpledesign.smells.domain.FlightSearchService;
import simpledesign.smells.domain.FlightTicketingService;

import java.util.Date;

public class FlightBookingService {
    private FlightTicketingService flightTicketingService = new FlightTicketingService();
    private FlightSearchService flightSearchService = new FlightSearchService();

    boolean bookFlight(int flightNumber, String departureAirport, String arrivalAirport, Date departureDate, UserDetails user, String creditCardNumber, String ccName, String ccExpiration) {
        if (flightNumber < 0) throw new IllegalArgumentException("Flight number must be > 0");
        if (creditCardNumber == null || ccExpiration == null || ccName == null)
            throw new IllegalArgumentException("Invalid credit card information");
        departureAirport = departureAirport.trim();
        arrivalAirport = arrivalAirport.trim();
        creditCardNumber = creditCardNumber.trim();

        Flight flight = flightSearchService.findFlight(flightNumber, departureAirport, arrivalAirport, departureDate);
        if (!flightSearchService.isFlightAvailable(flight))
            return false;
        return flightTicketingService.purchaseFlight(flight, user, creditCardNumber, ccName, ccExpiration);
    }
}
