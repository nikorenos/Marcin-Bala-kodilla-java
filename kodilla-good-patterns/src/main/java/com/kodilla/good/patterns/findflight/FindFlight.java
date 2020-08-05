package com.kodilla.good.patterns.findflight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FindFlight {

    public void findFlightFrom (HashMap<Integer,Flight> flights, String departureAirport)  {
        System.out.println("Flights from " + departureAirport + ":");
        flights.entrySet().stream()
                .filter(flight -> flight.getValue().getDepartureAirport().equals(departureAirport))
                .forEach(flight -> System.out.println("Flight no." + flight.getKey() +
                        ", " + flight.getValue().getDepartureAirport()
                        + " to " + flight.getValue().getArrivalAirport()));

    }

    public void findFlightTo (HashMap<Integer,Flight> flights, String arrivalAirport)  {
        System.out.println("Flights to " + arrivalAirport + ":");
        flights.entrySet().stream()
                .filter(flight -> flight.getValue().getArrivalAirport().equals(arrivalAirport))
                .forEach(flight -> System.out.println("Flight no." + flight.getKey() +
                        ", " + flight.getValue().getDepartureAirport()
                        + " to " + flight.getValue().getArrivalAirport()));

    }

    public void findFlightToWithChange (HashMap<Integer,Flight> flights, String departureAirport, String arrivalAirport)  {
        System.out.println("Flights from " + departureAirport + " to " + arrivalAirport + " with change:");
        flights.entrySet().stream()
                .filter(flight -> flight.getValue().getArrivalAirport().equals(arrivalAirport) || flight.getValue().getDepartureAirport().equals(departureAirport))
                .forEach(flight -> System.out.println("Flight no." + flight.getKey() +
                        ", " + flight.getValue().getDepartureAirport()
                        + " to " + flight.getValue().getArrivalAirport()));
    }

    public static void main(String[] args) {

        FlightsSupplier flightsSupplier = new FlightsSupplier();
        HashMap<Integer,Flight> flights = flightsSupplier.flightsList();
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
