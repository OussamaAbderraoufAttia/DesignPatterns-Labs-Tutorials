package com.esi.designpatterns;

public class SpamHandler extends MailHandler {
    @Override
    public void handleMail(Mail mail) {
        if (mail.getContent().contains("win") || mail.getContent().contains("money") || mail.getContent().contains("free")) {
            System.out.println("[SPAM] Mail deleted or sent to spam folder.");
        } else if (next != null) {
            next.handleMail(mail);
        }
    }
}
