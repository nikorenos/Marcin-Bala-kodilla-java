package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {

    private final String nameContinent;

    public Continent(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    private final Set<Country> countries = new HashSet<>();

    public void addCountry(Country country) {
        countries.add(country);
    }

    public boolean removeCountry(Country country) {
        return countries.remove(country);
    }

    public Set<Country> getCountries() {
        return countries;
    }
}
