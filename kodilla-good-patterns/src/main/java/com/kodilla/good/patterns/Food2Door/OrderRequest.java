package com.kodilla.good.patterns.Food2Door;


public class OrderRequest {
    private Client client;
    private Order order;

    public OrderRequest(Client client, Order order) {
        this.client = client;
        this.order = order;
    }

    public Client getClient() {
        return client;
    }

    public Order getOrder() {
        return order;
    }
}
