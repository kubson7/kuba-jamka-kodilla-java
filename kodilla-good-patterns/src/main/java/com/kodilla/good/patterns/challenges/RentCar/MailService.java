package com.kodilla.good.patterns.challenges.RentCar;

public class MailService implements InformationService {
    public void inform(User user){
        System.out.println("Information sent to:" + user.getUsername());
    }
}
