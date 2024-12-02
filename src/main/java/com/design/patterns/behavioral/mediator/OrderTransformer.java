package com.design.patterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class OrderTransformer {


    /**
     * Process each order line and transform it as per business logic.
     * @param record order
     * @return transformed
     */
    public Map<String, Object> transform(String[] record) {
        Map<String, Object> transformed = new HashMap<>();

        transformed.put("OrderID", record[0].trim());
        transformed.put("Customer", record[1].trim());
        transformed.put("TotalAmount", Double.parseDouble(record[2].trim()));

        // Map status (e.g., from "PENDING" to "Awaiting Fulfillment")
        String status = record[3].trim().toUpperCase();
        if ("PENDING".equals(status)) {
            transformed.put("Status", "Awaiting Fulfillment");
        } else if ("SHIPPED".equals(status)) {
            transformed.put("Status", "Completed");
        } else {
            throw new IllegalArgumentException("Unknown status: " + status);
        }

        return transformed;
    }
}
