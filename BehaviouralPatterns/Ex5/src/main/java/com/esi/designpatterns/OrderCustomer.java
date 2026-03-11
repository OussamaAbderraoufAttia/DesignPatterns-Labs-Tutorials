package com.esi.designpatterns;

public class OrderCustomer {
    private String orderId;
    private double amount;
    private TaxStrategy taxStrategy;

    public OrderCustomer(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateTotal() {
        if (taxStrategy == null) {
            throw new IllegalStateException("Tax strategy not set!");
        }
        double tax = taxStrategy.calculateTax(amount);
        return amount + tax;
    }

    public String getOrderId() { return orderId; }
}
