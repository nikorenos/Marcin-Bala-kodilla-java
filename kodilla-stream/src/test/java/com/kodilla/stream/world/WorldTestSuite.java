package com.kodilla.stream.world;

import com.kodilla.stream.sand.SandStorage;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {


    @Test
    public void testGetPeopleQuantity() {
        //Given
        BigDecimal expectedPeople = new BigDecimal("100");
        Country poland = new Country("Poland", expectedPeople);
        Country germany = new Country("Germany", expectedPeople);
        Country usa = new Country("USA", expectedPeople);
        Country canada = new Country("Canada", expectedPeople);

        Continent europa = new Continent("Europe");
        europa.addCountry(poland);
        europa.addCountry(germany);

        Continent america = new Continent("America");
        europa.addCountry(usa);
        europa.addCountry(canada);

        World world = new World();
        world.addContinent(europa);
        world.addContinent(america);


        //List<Continent> world = new ArrayList<>();
        //europe.add(europe);
        //europe.add(germany);


        //When
        BigDecimal allPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedAllPeople = new BigDecimal("400");
        Assert.assertEquals(expectedAllPeople, allPeople);
    }
}
