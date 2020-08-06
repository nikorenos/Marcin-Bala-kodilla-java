package com.kodilla.good.patterns.findflight;

import java.util.HashMap;
import java.util.HashSet;

public class FlightsSupplier {

    public HashSet<Flight> flightsList () {
        Flight flight1 = new Flight(1,"Gdańsk", "Warszawa");
        Flight flight2 = new Flight(2,"Warszawa", "Kraków");
        Flight flight3 = new Flight(3,"Gdańsk", "Kraków");
        Flight flight4 = new Flight(4,"Kraków", "Gdańsk");
        Flight flight5 = new Flight(5,"Gdańsk", "Wrocław");
        Flight flight6 = new Flight(6,"Wrocław", "Warszawa");
        Flight flight7 = new Flight(7,"Warszawa", "Gdańsk");
        Flight flight8 = new Flight(8,"Wrocław", "Kraków");
        HashSet<Flight> flights = new HashSet<>();
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);
        flights.add(flight6);
        flights.add(flight7);
        flights.add(flight8);

        return  flights;
    }
}
