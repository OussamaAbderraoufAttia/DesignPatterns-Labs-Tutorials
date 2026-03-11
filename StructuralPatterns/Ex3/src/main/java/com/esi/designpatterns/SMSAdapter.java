package com.esi.designpatterns;

import java.util.List;

public class SMSAdapter implements NotificationListener {
    private SMS sms;
    private String phoneNumber;

    public SMSAdapter(SMS sms, String phoneNumber) {
        this.sms = sms;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(List<TaskComponent> tasks) {
        StringBuilder msg = new StringBuilder("Your tasks for today:\n");
        for (TaskComponent task : tasks) {
            msg.append("* ").append(task.getDescription()).append("\n");
        }
        sms.send_sms("SYSTEM", phoneNumber, "Today's Tasks", msg.toString());
    }
}
