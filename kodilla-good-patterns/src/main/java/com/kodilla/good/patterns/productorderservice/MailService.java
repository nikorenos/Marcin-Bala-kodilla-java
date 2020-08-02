package com.kodilla.good.patterns.productorderservice;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Email sent to user with order confirmation.");
    }
}
