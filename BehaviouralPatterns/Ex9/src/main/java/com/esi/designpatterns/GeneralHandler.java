package com.esi.designpatterns;

public class GeneralHandler extends MailHandler {
    @Override
    public void handleMail(Mail mail) {
        System.out.println("[GENERAL] Mail forwarded to local office.");
    }
}
