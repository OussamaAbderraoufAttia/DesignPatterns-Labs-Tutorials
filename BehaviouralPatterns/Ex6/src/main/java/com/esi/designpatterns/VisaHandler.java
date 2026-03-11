package com.esi.designpatterns;

public class VisaHandler extends CardHandler {
    @Override
    public CreditCard handle(String number, String expiry, String owner) {
        if (number.startsWith("4") && (number.length() == 13 || number.length() == 16)) {
            return new VisaCC(number, expiry, owner);
        } else if (next != null) {
            return next.handle(number, expiry, owner);
        }
        return null;
    }
}
