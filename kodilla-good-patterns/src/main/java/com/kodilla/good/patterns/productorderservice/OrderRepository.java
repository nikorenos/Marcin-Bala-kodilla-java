package com.kodilla.good.patterns.productorderservice;

public interface OrderRepository {
    public void sendToRepository(User user, Order order);
}
