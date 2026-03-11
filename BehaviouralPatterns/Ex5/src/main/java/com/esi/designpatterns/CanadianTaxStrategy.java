package com.esi.designpatterns;

public class CanadianTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.15; // Mixed tax average
    }
}
