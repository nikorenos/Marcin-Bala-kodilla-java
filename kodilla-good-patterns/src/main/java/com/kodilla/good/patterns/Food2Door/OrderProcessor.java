package com.kodilla.good.patterns.Food2Door;

public class OrderProcessor {
    private OrderService orderService;
    private InformationService informationServiceSms;
    private TransportService transportService;

    public OrderProcessor(OrderService orderService, InformationService informationServiceSms, TransportService transportService) {
        this.orderService = orderService;
        this.informationServiceSms = informationServiceSms;
        this.transportService = transportService;
    }

    public OrderDto process (final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getClient(), orderRequest.getOrder());
        if (isOrdered) {
            orderRequest.getOrder().getVendor().process();
            informationServiceSms.inform(orderRequest.getClient());
            transportService.deliverOrderToClient(orderRequest.getOrder(), orderRequest.getClient());
            return new OrderDto(orderRequest.getClient(), orderRequest.getOrder(), true);
        } else {
            return new OrderDto(orderRequest.getClient(), orderRequest.getOrder(), false);
        }
    }
}

