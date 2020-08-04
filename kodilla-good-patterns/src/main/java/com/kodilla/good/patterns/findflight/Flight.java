package com.kodilla.good.patterns.findflight;

public class Flight {
    Integer id;
    String departureAirport;
    String arrivalAirport;


    public Flight(Integer id, String departureAirport, String arrivalAirport) {
        this.id = id;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Integer getId() {
        return id;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        return getId().equals(flight.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}


