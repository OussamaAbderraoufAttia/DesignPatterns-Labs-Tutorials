package com.esi.designpatterns;

// Existing legacy class
public class Mail {
    public void send(String from, String pwd, String to, String sub, String msg) {
        System.out.println("[Legacy Mail] Sending email to " + to + " with subject: " + sub);
        System.out.println("Message: " + msg);
    }
}
