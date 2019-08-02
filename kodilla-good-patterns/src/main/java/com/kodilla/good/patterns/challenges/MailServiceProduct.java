package com.kodilla.good.patterns.challenges;

public class MailServiceProduct implements InformationService {
    public void inform(User user){
        System.out.println("Information sent to:" + user.getUsername());
    }
}
