package com.design.patterns.behavioral.mediator;

public class MainOrderProcessing {

    public void main(String[] args) {
        String filePath = "path/to/orders.csv";

        OrderProcessingMediator mediator = new OrderProcessingMediator();
        OrderCSVReader csvReader = new OrderCSVReader(mediator);
        csvReader.readCsv(filePath);
    }
}
