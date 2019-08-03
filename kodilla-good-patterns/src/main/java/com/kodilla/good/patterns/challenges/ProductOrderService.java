package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest rentRequest) {
        boolean isRented = orderService.createOrder(rentRequest.getUser(), rentRequest.getOrderedOnTheDay(), rentRequest.getProductName());

        if (isRented) {
            informationService.inform(rentRequest.getUser());
            orderRepository.orderToRepo(rentRequest.getUser(), rentRequest.getOrderedOnTheDay(), rentRequest.getProductName());
            return new OrderDto(rentRequest.getUser(), true);
        } else {
            return new OrderDto(rentRequest.getUser(), false);
        }
    }
}
