package com.esi.designpatterns;

public abstract class CreditCard {
    protected String number;
    protected String expiryDate;
    protected String owner;

    public CreditCard(String number, String expiryDate, String owner) {
        this.number = number;
        this.expiryDate = expiryDate;
        this.owner = owner;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Type: " + getType() + ", Number: " + number + ", Owner: " + owner;
    }
}
