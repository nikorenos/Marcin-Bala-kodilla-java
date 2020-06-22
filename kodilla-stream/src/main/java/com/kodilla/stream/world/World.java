package com.kodilla.stream.world;

import com.kodilla.stream.sand.SandStorage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class World {

    BigDecimal allPeopleQuantity;
    List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public boolean removeContinent(Continent continent) {
        return continents.remove(continent);
    }

    public BigDecimal getPeopleQuantity() {

        BigDecimal allPeopleQuantity = (BigDecimal) continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
                return allPeopleQuantity;
    }

}
