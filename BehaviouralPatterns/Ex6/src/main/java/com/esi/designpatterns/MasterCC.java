package com.esi.designpatterns;

public class MasterCC extends CreditCard {
    public MasterCC(String number, String expiryDate, String owner) {
        super(number, expiryDate, owner);
    }
    @Override
    public String getType() { return "MasterCard"; }
}
