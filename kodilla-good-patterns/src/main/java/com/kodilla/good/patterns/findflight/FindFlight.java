package com.kodilla.good.patterns.findflight;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


public class FindFlight {

    public void findFlightFrom (HashSet<Flight> flights, String departureAirport)  {
        System.out.println("Flights from " + departureAirport + ":");
        flights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .forEach(flight -> System.out.println("Flight no." + flight.getId() +
                        ", " + flight.getDepartureAirport()
                        + " to " + flight.getArrivalAirport()));

    }

    public void findFlightTo (HashSet<Flight> flights, String arrivalAirport)  {
        System.out.println("Flights to " + arrivalAirport + ":");
        flights.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .forEach(flight -> System.out.println("Flight no." + flight.getId() +
                        ", " + flight.getDepartureAirport()
                        + " to " + flight.getArrivalAirport()));

    }

    public void findFlightToWithChange (HashSet<Flight> flights, String departureAirport, String arrivalAirport)  {
        System.out.println("Flights from " + departureAirport + " to " + arrivalAirport + " with change:");
        flights.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport) || flight.getDepartureAirport().equals(departureAirport))
                .forEach(flight -> System.out.println("Flight no." + flight.getId() +
                        ", " + flight.getDepartureAirport()
                        + " to " + flight.getArrivalAirport()));
    }

    public static void main(String[] args) {

        FlightsSupplier flightsSupplier = new FlightsSupplier();
        HashSet<Flight> flights = flightsSupplier.flightsList();
        FindFlight checkFlight = new FindFlight();
        checkFlight.findFlightFrom(flights, "Gdańsk");
        checkFlight.findFlightTo(flights, "Gdańsk");
        checkFlight.findFlightToWithChange(flights, "Gdańsk", "Kraków");










        /*System.out.println();
        Flight flight1 = new Flight(1,"Gdańsk", "Warszawa");
        Flight flight2 = new Flight(2,"Warszawa", "Kraków");
        Flight flight3 = new Flight(3,"Gdańsk", "Kraków");
        Flight flight4 = new Flight(4,"Kraków", "Gdańsk");
        Flight flight5 = new Flight(5,"Gdańsk", "Poznań");
        ArrayList<Flight> list = new ArrayList<>();
        list.add(flight1);
        list.add(flight2);
        list.add(flight3);
        list.add(flight4);
        list.add(flight5);

        list.stream()
                .filter(flight -> flight.getDepartureAirport().equals("Gdańsk") || flight.getArrivalAirport().equals("Kraków"))
                .forEach(s -> System.out.println(s));*/

    }
}
