package com.esi.designpatterns;

public class AmExHandler extends CardHandler {
    @Override
    public CreditCard handle(String number, String expiry, String owner) {
        if (number.length() == 15 && number.startsWith("3")) {
            int secondDigit = Character.getNumericValue(number.charAt(1));
            if (secondDigit == 4 || secondDigit == 7) {
                return new AmExCC(number, expiry, owner);
            }
        }
        
        if (next != null) {
            return next.handle(number, expiry, owner);
        }
        return null;
    }
}
