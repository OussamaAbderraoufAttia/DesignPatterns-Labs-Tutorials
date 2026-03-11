package com.esi.designpatterns;

public class FanHandler extends MailHandler {
    @Override
    public void handleMail(Mail mail) {
        if (mail.getContent().contains("love") || mail.getContent().contains("great") || mail.getContent().contains("thanks")) {
            System.out.println("[FAN] Mail forwarded to CEO.");
        } else if (next != null) {
            next.handleMail(mail);
        }
    }
}
