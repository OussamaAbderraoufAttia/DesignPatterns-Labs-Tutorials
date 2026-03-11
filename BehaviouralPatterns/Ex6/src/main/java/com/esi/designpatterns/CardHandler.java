package com.esi.designpatterns;

public abstract class CardHandler {
    protected CardHandler next;

    public void setNext(CardHandler next) {
        this.next = next;
    }

    public abstract CreditCard handle(String number, String expiry, String owner);
}
