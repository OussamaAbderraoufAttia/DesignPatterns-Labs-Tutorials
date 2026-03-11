package com.esi.designpatterns;

public class Main {
    public static void main(String[] args) {
        OrderCustomer order = new OrderCustomer("ORD-123", 1000.0);

        System.out.println("Processing order: " + order.getOrderId());
        
        System.out.println("\nCase 1: Algerian Order");
        order.setTaxStrategy(new AlgerianTaxStrategy());
        System.out.println("Total with tax: " + order.calculateTotal() + " DZD");

        System.out.println("\nCase 2: French Order");
        order.setTaxStrategy(new FrenchTaxStrategy());
        System.out.println("Total with tax: " + order.calculateTotal() + " EUR");

        System.out.println("\nCase 3: Canadian Order");
        order.setTaxStrategy(new CanadianTaxStrategy());
        System.out.println("Total with tax: " + order.calculateTotal() + " CAD");
    }
}
