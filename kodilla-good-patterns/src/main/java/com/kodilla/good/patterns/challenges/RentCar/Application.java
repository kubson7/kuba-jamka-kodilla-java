package com.kodilla.good.patterns.challenges.RentCar;

public class Application {
    public static void main (String[] args) {
        RentRequestRetriver rentRequestRetriver = new RentRequestRetriver();
        RentRequest rentRequest = rentRequestRetriver.retrive();

        RentalProcessor rentalProcessor = new RentalProcessor(new MailService(),new CarRentalService(), new CarRentalRepository());
        rentalProcessor.process(rentRequest);
    }
}
