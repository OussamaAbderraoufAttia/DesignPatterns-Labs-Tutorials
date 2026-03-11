package com.esi.designpatterns;

public class ComplaintHandler extends MailHandler {
    @Override
    public void handleMail(Mail mail) {
        if (mail.getContent().contains("bad") || mail.getContent().contains("error") || mail.getContent().contains("complaint")) {
            System.out.println("[COMPLAINT] Mail forwarded to legal/customer service department.");
        } else if (next != null) {
            next.handleMail(mail);
        }
    }
}
