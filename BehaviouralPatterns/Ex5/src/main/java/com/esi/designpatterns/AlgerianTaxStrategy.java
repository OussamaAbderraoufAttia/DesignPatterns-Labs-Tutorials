package com.esi.designpatterns;

public class AlgerianTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.19; // 19% TVA
    }
}
