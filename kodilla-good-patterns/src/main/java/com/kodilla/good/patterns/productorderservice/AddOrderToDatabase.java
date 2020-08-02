package com.kodilla.good.patterns.productorderservice;

public class AddOrderToDatabase implements OrderRepository {

    @Override
    public void sendToRepository(User user, Order order) {
        System.out.println("Order sent to database.");
    }
}
