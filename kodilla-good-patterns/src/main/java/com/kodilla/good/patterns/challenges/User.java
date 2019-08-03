package com.kodilla.good.patterns.challenges;

public class User {
    private final String neme;
    private final String username;

    public User(final String neme, final String username) {
        this.neme = neme;
        this.username = username;
    }

    public String getNeme() {
        return neme;
    }

    public String getUsername() {
        return username;
    }
}
