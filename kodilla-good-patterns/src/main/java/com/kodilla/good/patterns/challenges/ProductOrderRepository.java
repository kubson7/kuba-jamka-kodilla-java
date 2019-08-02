package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {
    public boolean orderToRepo (final User user, final LocalDateTime ordered, final String nameProduct) {
        System.out.println("Product ordered by: " + user.getNeme() +" "+ user.getUsername()
                + " by: " + ordered.toString() + "Product: " + nameProduct);
        return true;
    }
}
