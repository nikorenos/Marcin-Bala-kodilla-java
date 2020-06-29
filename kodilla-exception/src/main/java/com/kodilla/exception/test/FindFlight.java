package com.kodilla.exception.test;

import com.kodilla.exception.nullpointer.MessageNotSentException;
import com.kodilla.exception.nullpointer.MessageSender;
import com.kodilla.exception.nullpointer.User;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public void findFlight (Flight flight) throws RouteNotFoundException {
        Boolean flightAvailable = false;
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", false);
        flights.put("Moscow", true);
        flights.put("New York", true);

        //System.out.println((flight.getArrivalAirport()) + " " + flights.get(flight.getArrivalAirport()));

        if ((flights.containsKey(flight.getArrivalAirport())) && (flights.get(flight.getArrivalAirport()))) {
                System.out.println("Flight to " + flight.getArrivalAirport() + " is available!");
        } else {
            throw new RouteNotFoundException("Flight to " + flight.getArrivalAirport() + " is not available!");
        }

    }

    public static void main(String[] args) {
        Flight flight = new Flight ("London", "Boston");
        FindFlight checkFlight = new FindFlight();
        try {
            checkFlight.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Flight flight2 = new Flight ("London", "Warsaw");
        FindFlight checkFlight2 = new FindFlight();
        try {
            checkFlight2.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }


        Flight flight3 = new Flight ("London", "New York");
        FindFlight checkFlight3 = new FindFlight();
        try {
            checkFlight3.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
