package com.esi.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<VehicleOrder> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addOrder(VehicleOrder order) {
        orders.add(order);
    }

    public void displayCustomerOrders() {
        System.out.println("Customer: " + name);
        for (VehicleOrder order : orders) {
            order.displayOrder();
            System.out.println("-------------------");
        }
    }
}
