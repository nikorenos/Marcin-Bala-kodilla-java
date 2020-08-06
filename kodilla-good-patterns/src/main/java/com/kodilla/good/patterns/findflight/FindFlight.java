package com.kodilla.good.patterns.findflight;


import java.util.HashSet;


public class FindFlight {

    public HashSet<Flight> findFlightFrom (HashSet<Flight> flights, String departureAirport) {
        HashSet<Flight> findFlightFrom = new HashSet<>();

        flights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .forEach(findFlightFrom::add);

        return findFlightFrom;
    }

    public HashSet<Flight> findFlightTo (HashSet<Flight> flights, String arrivalAirport) {
        HashSet<Flight> findFlightFrom = new HashSet<>();

        flights.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .forEach(findFlightFrom::add);

        return findFlightFrom;
    }

    public HashSet<Flight> findFlightToWithChange (HashSet<Flight> flights, String departureAirport, String arrivalAirport) {
        HashSet<Flight> flightsFrom = findFlightFrom(flights, departureAirport);
        HashSet<Flight> flightsTo = findFlightTo(flights, arrivalAirport);
        HashSet<Flight> flightsWithChange = new HashSet<>();

        for (Flight flightFrom : flightsFrom) {
            for (Flight flightTo : flightsTo) {
                if (flightFrom.getArrivalAirport().equals(flightTo.getDepartureAirport())) {
                    flightsWithChange.add(flightFrom);
                }
            }
        }
        for (Flight flightTo : flightsTo) {
            for (Flight flightFrom : flightsFrom) {
                if (flightTo.getDepartureAirport().equals(flightFrom.getArrivalAirport())) {
                    flightsWithChange.add(flightTo);
                }
            }
        }
        return flightsWithChange;
    }

    public static void main(String[] args) {

        String departureAirport = "Gdańsk";
        String arrivalAirport = "Kraków";

        FlightsSupplier flightsSupplier = new FlightsSupplier();
        HashSet<Flight>  flights = flightsSupplier.flightsList();
        FindFlight checkFlight = new FindFlight();
        DisplayFlights displayFlights = new DisplayFlights();

        HashSet<Flight> findFlightFrom = checkFlight.findFlightFrom(flights, departureAirport);
        displayFlights.displayFlightsFrom(findFlightFrom, departureAirport);

        HashSet<Flight> findFlightTo = checkFlight.findFlightTo(flights, arrivalAirport);
        displayFlights.displayFlightsTo(findFlightTo, arrivalAirport);

        HashSet<Flight> findFlightWithChange = checkFlight.findFlightToWithChange(flights, departureAirport, arrivalAirport);
        displayFlights.displayFlightsWithChange(findFlightWithChange, departureAirport, arrivalAirport);

    }
}
