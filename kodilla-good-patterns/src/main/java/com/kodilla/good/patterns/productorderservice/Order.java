package com.kodilla.good.patterns.productorderservice;

public class Order {
    private final String productName;
    private final Double productPrice;
    private final Integer productAmount;

    public Order(String productName, Double productPrice, Integer productAmount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productAmount = productAmount;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice*productAmount;
    }

    public Integer getProductAmount() {
        return productAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", productAmount='" + productAmount + '\'' +
                ", productPrice='" + productPrice + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return productName.equals(order.productName);
    }

    @Override
    public int hashCode() {
        return productName.hashCode();
    }
}
