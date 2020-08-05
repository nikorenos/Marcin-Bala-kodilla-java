package com.kodilla.good.patterns.findflight;

import java.util.HashMap;

public class FlightsSupplier {

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
}
