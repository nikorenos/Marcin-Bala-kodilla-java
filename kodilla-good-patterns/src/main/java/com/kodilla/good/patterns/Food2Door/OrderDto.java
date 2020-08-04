package com.kodilla.good.patterns.Food2Door;


public class OrderDto {
    public Client client;
    public Order order;
    public boolean isOrdered;

    public OrderDto(Client client, Order order, boolean isOrdered) {
        this.client = client;
        this.order = order;
        this.isOrdered = isOrdered;
    }

    public Client getClient() {
        return client;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
