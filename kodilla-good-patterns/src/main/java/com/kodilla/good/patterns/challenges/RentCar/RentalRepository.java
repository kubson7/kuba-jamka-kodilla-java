package com.kodilla.good.patterns.challenges.RentCar;

import java.time.LocalDateTime;

public interface RentalRepository {
    boolean createRental (User user, LocalDateTime from, LocalDateTime to);
}
