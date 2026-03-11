package com.esi.designpatterns;

public class VisaCC extends CreditCard {
    public VisaCC(String number, String expiryDate, String owner) {
        super(number, expiryDate, owner);
    }
    @Override
    public String getType() { return "Visa"; }
}
