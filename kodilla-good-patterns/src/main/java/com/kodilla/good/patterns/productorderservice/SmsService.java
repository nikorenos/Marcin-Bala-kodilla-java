package com.kodilla.good.patterns.productorderservice;

public class SmsService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Sms sent to user with order confirmation.");
    }
}
