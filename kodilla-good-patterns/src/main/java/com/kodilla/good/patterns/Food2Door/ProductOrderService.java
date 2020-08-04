package com.kodilla.good.patterns.Food2Door;

public class ProductOrderService implements OrderService {
    public boolean order (final Client client, Order order) {
        System.out.println("Order from: " + client.getName() + " " + client.getSurname() + ", Address: " + client.getAddress());
        System.out.println("Vendor: " + order.getVendor().getName() + ", Address: " + order.getVendor().getAddress() +
                ", Product: " + order.getProductName() + ", Price: " + order.getProductPrice() + ", Amount : " + order.getProductAmount());
        return true;
    }

    public static void main(String[] args) {
        OrderRequestSupplier orderRequestSupplier = new OrderRequestSupplier();
        OrderRequest orderRequest = orderRequestSupplier.orderRequest();
        OrderProcessor orderProcessor = new OrderProcessor(
                new ProductOrderService(), new SmsService(),new DeliveryService());
        orderProcessor.process(orderRequest);
    }
}

