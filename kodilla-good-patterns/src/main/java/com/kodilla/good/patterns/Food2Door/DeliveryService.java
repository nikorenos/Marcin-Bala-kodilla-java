package com.kodilla.good.patterns.Food2Door;

public class DeliveryService implements TransportService {


    @Override
    public void deliverOrderToClient(Order order, Client client) {
        System.out.println("Order: " + order.getProductName() +" has been delivered to: " + client.getName() + " " + client.getSurname() + ", " + client.getAddress());
    }
}
