package com.esi.designpatterns;

public class Main {
    public static void main(String[] args) {
        OptionFactory factory = new OptionFactory();
        Customer customer = new Customer("Oussama");

        // Create an order
        VehicleOrder order = new VehicleOrder("ORD-001");
        
        // Use factory to get flyweight options
        order.addOption(factory.getOption("Air Bag"), 12000.0);
        order.addOption(factory.getOption("Electric Window"), 10000.0);
        order.addOption(factory.getOption("Power Steering"), 20000.0);
        
        customer.addOrder(order);

        // Create another order for the same options but different prices (demonstrating flyweight)
        VehicleOrder order2 = new VehicleOrder("ORD-002");
        order2.addOption(factory.getOption("Air Bag"), 11500.0); // Discounted
        order2.addOption(factory.getOption("Power Steering"), 20000.0);
        
        customer.addOrder(order2);

        customer.displayCustomerOrders();
        
        System.out.println("Unique VehicleOption objects in memory: " + factory.getPoolSize());
    }
}
