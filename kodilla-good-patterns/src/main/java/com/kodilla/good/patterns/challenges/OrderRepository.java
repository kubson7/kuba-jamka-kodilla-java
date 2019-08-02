package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean orderToRepo(User user, LocalDateTime ordered,String product);
}
