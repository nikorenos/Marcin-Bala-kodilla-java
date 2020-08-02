package com.kodilla.good.patterns.productorderservice;

public class OrderRequestSupplier {

    public OrderRequest orderRequest() {
        User user = new User ("Andy", "Smith");
        Order order = new Order("PS5", 2000.0, 2);

        return new OrderRequest(user, order);
    }
}
