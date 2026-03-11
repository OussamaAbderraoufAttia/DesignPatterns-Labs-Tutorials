package com.esi.designpatterns;

// Existing legacy class
public class SMS {
    public void send_sms(String from, String tel, String sub, String msg) {
        System.out.println("[Legacy SMS] Sending SMS to " + tel + " with subject: " + sub);
        System.out.println("Message Content: " + msg);
    }
}
