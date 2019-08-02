package com.kodilla.good.patterns.challenges.RentCar;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {
    public boolean createRental(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {
        System.out.println("Renting Car for: " + user.getName() + user.getUsername()
                + " from: " + carRentFrom.toString() + "to: " + carRentTo.toString());
        return true;
    }
}
