package com.kodilla.good.patterns.productorderservice;

public class OrderProcessor {
    private InformationService informationServiceMail;
    private InformationService informationServiceSms;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationServiceMail, InformationService informationServiceSms, OrderService orderService, OrderRepository orderRepository) {
        this.informationServiceMail = informationServiceMail;
        this.informationServiceSms = informationServiceSms;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process (final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getOrder());
        if (isOrdered) {
            informationServiceMail.inform(orderRequest.getUser());
            informationServiceSms.inform(orderRequest.getUser());
            orderRepository.sendToRepository(orderRequest.getUser(), orderRequest.getOrder());
            return new OrderDto(orderRequest.getUser(), orderRequest.getOrder(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getOrder(), false);
        }
    }
}