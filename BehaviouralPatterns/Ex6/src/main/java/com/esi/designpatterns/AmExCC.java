package com.esi.designpatterns;

public class AmExCC extends CreditCard {
    public AmExCC(String number, String expiryDate, String owner) {
        super(number, expiryDate, owner);
    }
    @Override
    public String getType() { return "AmericanExpress"; }
}
