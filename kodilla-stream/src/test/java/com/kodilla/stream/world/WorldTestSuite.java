package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given

        Country country1 = new Country("Austria",new BigDecimal("40000000"));
        Country country2 = new Country("Polska",new BigDecimal("36000000"));
        Country country3 = new Country("Egipt",new BigDecimal("88000000"));
        Country country4 = new Country("Brazylia",new BigDecimal("220000000"));
        Country country5 = new Country("Rosja",new BigDecimal("110000000"));

        Continent europa = new Continent();
        Continent afryka = new Continent();

        europa.addCountries(country1);
        europa.addCountries(country2);
        europa.addCountries(country4);
        afryka.addCountries(country3);
        afryka.addCountries(country5);

        World world = new World();

        world.addContinents(europa);
        world.addContinents(afryka);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

            //Then
        BigDecimal expectedPeople = new BigDecimal("494000000");
        Assert.assertEquals(expectedPeople, totalPeople);

        }
}
