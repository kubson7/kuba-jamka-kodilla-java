package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String nameOfTheCountry;
    private final BigDecimal peopleQuantity;

    public Country(String nameOfTheCountry, BigDecimal peopleQuantity) {
        this.nameOfTheCountry = nameOfTheCountry;
        this.peopleQuantity = peopleQuantity;
    }

    public String getNameOfTheCountry() {
        return nameOfTheCountry;
    }
    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return nameOfTheCountry != null ? nameOfTheCountry.equals(country.nameOfTheCountry) : country.nameOfTheCountry == null;
    }

    @Override
    public int hashCode() {
        int result = nameOfTheCountry != null ? nameOfTheCountry.hashCode() : 0;
        result = 31 * result + (peopleQuantity != null ? peopleQuantity.hashCode() : 0);
        return result;
    }
}
