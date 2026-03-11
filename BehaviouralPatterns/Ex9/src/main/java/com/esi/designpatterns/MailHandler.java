package com.esi.designpatterns;

public abstract class MailHandler {
    protected MailHandler next;

    public void setNext(MailHandler next) {
        this.next = next;
    }

    public abstract void handleMail(Mail mail);
}
