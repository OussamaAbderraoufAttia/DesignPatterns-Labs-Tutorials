package com.esi.designpatterns;

public class Main {
    public static void main(String[] args) {
        // Setup the chain
        MailHandler spam = new SpamHandler();
        MailHandler complaint = new ComplaintHandler();
        MailHandler fan = new FanHandler();
        MailHandler general = new GeneralHandler();

        spam.setNext(complaint);
        complaint.setNext(fan);
        fan.setNext(general);

        // Test with various mails
        Mail[] inbox = {
            new Mail("I love your product, it is great!"),
            new Mail("I won a free prize in the lottery!"),
            new Mail("There is an error in my bill, this is bad."),
            new Mail("Can you send me a catalog?")
        };

        for (Mail m : inbox) {
            System.out.println("Processing: " + m.getContent());
            spam.handleMail(m);
            System.out.println();
        }
    }
}
