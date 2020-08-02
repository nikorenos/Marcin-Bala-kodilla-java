package com.kodilla.good.patterns.productorderservice;


public class ProductOrderService implements OrderService {
    public boolean order(final User user, Order order) {
        System.out.println("User: " + user.getName() + " " + user.getSurname()
                + ", Product: " + order.getProductName() + ", Price: " + order.getProductPrice() + "zł, Amount: " + order.getProductAmount());
        return true;
    }

    public static void main(String[] args) {

        OrderRequestSupplier orderRequestSupplier = new OrderRequestSupplier();
        OrderRequest orderRequest = orderRequestSupplier.orderRequest();
        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new SmsService(),
                new ProductOrderService(), new AddOrderToDatabase());
        orderProcessor.process(orderRequest);

    }

}