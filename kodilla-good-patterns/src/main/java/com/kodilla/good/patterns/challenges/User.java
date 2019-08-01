package com.kodilla.good.patterns.challenges;

public class User {
    private String neme;
    private String username;

    public User(String neme, String username) {
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
