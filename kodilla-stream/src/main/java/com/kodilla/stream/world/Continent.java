package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Continent {

    private final  List<Country> countries;

    public Continent() {
        countries = new ArrayList<>();
    }

    public void addCountries(Country country) {
        countries.add(country);
    }

    public List<Country> getCountries() {
        return countries;
    }
}

