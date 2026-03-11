package com.esi.designpatterns;

public class MasterHandler extends CardHandler {
    @Override
    public CreditCard handle(String number, String expiry, String owner) {
        if (number.length() == 16 && number.startsWith("5")) {
            int secondDigit = Character.getNumericValue(number.charAt(1));
            if (secondDigit >= 1 && secondDigit <= 5) {
                return new MasterCC(number, expiry, owner);
            }
        }
        
        if (next != null) {
            return next.handle(number, expiry, owner);
        }
        return null;
    }
}
