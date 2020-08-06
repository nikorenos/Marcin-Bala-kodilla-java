package com.kodilla.good.patterns.findflight;

import java.util.HashSet;

public class DisplayFlights {

    public void displayFlightsFrom (HashSet<Flight> flights, String departureAirport) {
        System.out.println();
        System.out.println("Flights from " + departureAirport + ":");
        for(Flight flight:flights){
            System.out.println("Flight no." + flight.getId() +
                    ", " + flight.getDepartureAirport()
                    + " to " + flight.getArrivalAirport());
        }
    }

    public void displayFlightsTo (HashSet<Flight> flights, String arrivalAirport) {
        System.out.println();
        System.out.println("Flights to " + arrivalAirport + ":");
        for(Flight flight:flights){
            System.out.println("Flight no." + flight.getId() +
                    ", " + flight.getDepartureAirport()
                    + " to " + flight.getArrivalAirport());
        }
    }

    public void displayFlightsWithChange (HashSet<Flight> flights, String departureAirport, String arrivalAirport) {
        System.out.println();
        System.out.println("Flights from " + departureAirport + " to " + arrivalAirport + " with change:");
        for(Flight flight:flights){
            System.out.println("Flight no." + flight.getId() +
                    ", " + flight.getDepartureAirport()
                    + " to " + flight.getArrivalAirport());
        }
    }
}
