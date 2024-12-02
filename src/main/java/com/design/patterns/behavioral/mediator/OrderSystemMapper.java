package com.design.patterns.behavioral.mediator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

public class OrderSystemMapper {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/order_system";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    /* columnMapping :
            "OrderID", "order_identifier",
            "Customer", "customer_name",
            "TotalAmount", "total_value",
            "Status", "order_status"
    */

    public void mapToOrderSystem(Map<String, Object> orderData) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            // Prepare SQL insert statement
            String sql = "INSERT INTO orders (order_identifier, customer_name, total_value, order_status) VALUES (?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                // Map data keys to corresponding database columns
                preparedStatement.setString(1, (String) orderData.get("OrderID"));
                preparedStatement.setString(2, (String) orderData.get("Customer"));
                preparedStatement.setDouble(3, (Double) orderData.get("TotalAmount"));
                preparedStatement.setString(4, (String) orderData.get("Status"));

                // Execute the insertion
                int rowsInserted = preparedStatement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Order successfully inserted into ERP system: " + orderData);
                }
            }
        } catch (SQLException e) {
            System.err.println("Failed to insert order into ERP system: " + e.getMessage());
        }
    }
}
