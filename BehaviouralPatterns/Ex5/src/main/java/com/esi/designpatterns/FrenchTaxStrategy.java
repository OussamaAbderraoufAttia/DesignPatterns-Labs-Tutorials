package com.esi.designpatterns;

public class FrenchTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.20; // 20% TVA
    }
}
