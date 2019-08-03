package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime orderedOnTheDay;
    private String productName;

    public OrderRequest(User user, LocalDateTime orderedOnTheDay, String productName) {
        this.user = user;
        this.orderedOnTheDay = orderedOnTheDay;
        this.productName = productName;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderedOnTheDay() {
        return orderedOnTheDay;
    }

    public String getProductName() {
        return productName;
    }

}
