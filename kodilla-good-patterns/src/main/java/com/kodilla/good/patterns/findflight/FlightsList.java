package com.kodilla.good.patterns.findflight;

import java.util.HashMap;

public class FlightsList {
    private final HashMap<Integer,Flight> flightsList;

    public FlightsList(HashMap<Integer, Flight> flightsList) {
        this.flightsList = flightsList;
    }

    public HashMap<Integer, Flight> getFlightsList() {
        return flightsList;
    }

    public void addFlight (Flight flight) {
        flightsList.put(flight.id, flight);
    }

    public void removeFlight (Flight flight) {
        flightsList.remove(flight.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightsList that = (FlightsList) o;

        return getFlightsList().equals(that.getFlightsList());
    }

}
