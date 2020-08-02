package com.kodilla.good.patterns.productorderservice;

public class OrderDto {
    public User user;
    public Order order;
    public boolean isOrdered;

    public OrderDto(User user, Order order, boolean isOrdered) {
        this.user = user;
        this.order = order;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
