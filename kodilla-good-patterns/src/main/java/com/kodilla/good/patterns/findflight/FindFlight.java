package com.kodilla.good.patterns.findflight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FindFlight {

    public HashMap<Integer,Flight> flightsList () {
        Flight flight1 = new Flight(1,"Gdańsk", "Warszawa");
        Flight flight2 = new Flight(2,"Warszawa", "Kraków");
        Flight flight3 = new Flight(3,"Gdańsk", "Kraków");
        Flight flight4 = new Flight(4,"Kraków", "Gdańsk");
        HashMap<Integer,Flight> flights = new HashMap<>();
        flights.put(flight1.id, flight1);
        flights.put(flight2.id, flight2);
        flights.put(flight3.id, flight3);
        flights.put(flight4.id, flight4);
        return  flights;
    }

    public void findFlightFrom (HashMap<Integer,Flight> flights, String departureAirport)  {

        System.out.println("Flights from " + departureAirport + ":");
        flights.entrySet().stream()
                .filter(flight -> flight.getValue().getDepartureAirport().equals(departureAirport))
                .forEach(flight -> System.out.println("Flight no." + flight.getKey() +
                        ", " + flight.getValue().getDepartureAirport()
                        + " to " + flight.getValue().getArrivalAirport()));

        /*for(Map.Entry<Integer, Flight> entry : flights.entrySet()){
            System.out.println("Flight no. " + entry.getKey() + " from: "  + entry.getValue().getDepartureAirport() + " to: " + entry.getValue().getArrivalAirport());
        }*/

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
                //.reduce(flight -> flight.getValue().getArrivalAirport().equals(arrivalAirport) && flight.getValue().getDepartureAirport().equals(departureAirport))
                .filter(flight -> flight.getValue().getArrivalAirport().equals(arrivalAirport) || flight.getValue().getDepartureAirport().equals(departureAirport))
                .forEach(flight -> System.out.println("Flight no." + flight.getKey() +
                        ", " + flight.getValue().getDepartureAirport()
                        + " to " + flight.getValue().getArrivalAirport()));

    }
    public static void main(String[] args) {

        FindFlight checkFlight = new FindFlight();
        checkFlight.flightsList();
        checkFlight.findFlightFrom(checkFlight.flightsList(), "Gdańsk");
        checkFlight.findFlightTo(checkFlight.flightsList(), "Gdańsk");
        checkFlight.findFlightToWithChange(checkFlight.flightsList(), "Gdańsk", "Kraków");


    }
}
