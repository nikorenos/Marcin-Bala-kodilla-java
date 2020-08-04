package com.kodilla.good.patterns.Food2Door;

public class Order {
    private final Vendor vendor;
    private final String productName;
    private final Double productPrice;
    private final Integer productAmount;

    public Order(Vendor vendor, String productName, Double productPrice, Integer productAmount) {
        this.vendor = vendor;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productAmount = productAmount;
    }

    public Vendor getVendor() {
        return vendor;
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
                "vendor=" + vendor +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productAmount=" + productAmount +
                '}';
    }

}
