package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();

        //NIE SKONCZONE
        //należy stworzyć klasy, które przekażemy jako parametry ??
        ProductOrderService productOrderService = new ProductOrderService();
        productOrderService.process(orderRequest);
    }
}
