package com.esi.designpatterns;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Setup Composite Tasks
        TaskComposite mainTask = new TaskComposite("Project Alpha", "in progress", new Date(), "Work");
        
        mainTask.addSubtask(new TaskLeaf("Feature A", "completed", new Date(), "Dev", 4));
        mainTask.addSubtask(new TaskLeaf("Feature B", "in progress", new Date(), "Dev", 2));
        
        TaskComposite designSubtask = new TaskComposite("Design Phase", "pending", new Date(), "Design");
        designSubtask.addSubtask(new TaskLeaf("UI Mockups", "pending", new Date(), "Design", 5));
        designSubtask.addSubtask(new TaskLeaf("UX Flow", "pending", new Date(), "Design", 3));
        
        mainTask.addSubtask(designSubtask);
        
        System.out.println("Main Task Priority (Rounded Average): " + mainTask.getPriority());
        System.out.println(mainTask);

        // 2. Setup Notification System (Observer + Adapter)
        NotificationManager notificationManager = new NotificationManager();
        
        Mail legacyMail = new Mail();
        SMS legacySMS = new SMS();
        
        MailAdapter mailAdapter = new MailAdapter(legacyMail, "user@example.com");
        SMSAdapter smsAdapter = new SMSAdapter(legacySMS, "0550123456");
        
        notificationManager.subscribe(mailAdapter);
        notificationManager.subscribe(smsAdapter);
        
        // 3. Trigger Notification
        List<TaskComponent> dailyTasks = new ArrayList<>();
        dailyTasks.add(mainTask);
        
        System.out.println("\n--- Triggering Daily Notifications ---");
        notificationManager.notify(dailyTasks);
    }
}
