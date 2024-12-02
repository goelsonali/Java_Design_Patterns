package com.design.patterns.behavioral.mediator;

import java.util.Map;

public class OrderProcessingMediator implements OrderMediator {

    private final OrderTransformer transformer;
    private final OrderSystemMapper mapper;

    public OrderProcessingMediator() {
        this.transformer = new OrderTransformer();
        this.mapper = new OrderSystemMapper();
    }

    @Override
    public void processOrder(String[] record) {
        //Step 1 : Transform the order
        Map<String, Object> transformedOrder = transformer.transform(record);
        //Step2 : Map to the order system
        mapper.mapToOrderSystem(transformedOrder);
    }
}
