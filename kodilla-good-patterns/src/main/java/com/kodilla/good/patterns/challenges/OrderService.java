package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface OrderService {
    boolean createOrder (User user, LocalDateTime ordered, String product);
}
