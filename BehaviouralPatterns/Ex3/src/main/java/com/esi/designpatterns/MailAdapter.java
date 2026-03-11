package com.esi.designpatterns;

import java.util.List;

public class MailAdapter implements NotificationListener {
    private Mail mail;
    private String recipientEmail;

    public MailAdapter(Mail mail, String recipientEmail) {
        this.mail = mail;
        this.recipientEmail = recipientEmail;
    }

    @Override
    public void update(List<TaskComponent> tasks) {
        StringBuilder msg = new StringBuilder("Daily Task Notification:\n");
        for (TaskComponent task : tasks) {
            msg.append("- ").append(task.toString()).append("\n");
        }
        mail.send("system@app.com", "secure123", recipientEmail, "Daily Tasks", msg.toString());
    }
}
