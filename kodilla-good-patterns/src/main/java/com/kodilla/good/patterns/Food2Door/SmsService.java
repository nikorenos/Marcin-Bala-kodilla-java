package com.kodilla.good.patterns.Food2Door;

public class SmsService implements InformationService {

    @Override
    public void inform(Client client) {
        System.out.println("Sms sent to client with order confirmation.");
    }
}
