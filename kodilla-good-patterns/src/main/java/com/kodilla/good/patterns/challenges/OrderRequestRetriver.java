package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriver {

    public OrderRequest retrieve () {

        User user = new User ("John","Lincoln");
        LocalDateTime ordered = LocalDateTime.of(2019,7,31,4,12,2);
        String product = "buty";

        return new OrderRequest(user,ordered,product);
    }
}
