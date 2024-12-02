package com.design.patterns.behavioral.mediator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class OrderCSVReader {
    private final OrderMediator mediator;

    public OrderCSVReader(OrderMediator mediator) {
        this.mediator = mediator;
    }

    public void readCsv(String filePath) {

        try (Stream<String> lines = Files.lines(Path.of(filePath))) {
            lines.skip(1)
                    .map(row -> row.split(","))
                    .forEach(mediator::processOrder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
