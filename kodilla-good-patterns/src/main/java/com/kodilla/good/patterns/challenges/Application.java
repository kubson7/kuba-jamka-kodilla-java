package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();



        ProductOrderService productOrderService = new ProductOrderService(new MailServiceProduct(), new ProductOrder(), new ProductOrderRepository());
        productOrderService.process(orderRequest);
    }
}
