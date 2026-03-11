package com.esi.designpatterns;

import java.util.HashMap;
import java.util.Map;

public class VehicleOrder {
    private String orderId;
    // Maps the flyweight (option) to the extrinsic state (price for this order)
    private Map<VehicleOption, Double> optionsWithPrices = new HashMap<>();

    public VehicleOrder(String orderId) {
        this.orderId = orderId;
    }

    public void addOption(VehicleOption option, double price) {
        optionsWithPrices.put(option, price);
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        double total = 0;
        for (Map.Entry<VehicleOption, Double> entry : optionsWithPrices.entrySet()) {
            entry.getKey().display(entry.getValue());
            total += entry.getValue();
        }
        System.out.println("Total Options Price: " + total + " DA");
    }
}
