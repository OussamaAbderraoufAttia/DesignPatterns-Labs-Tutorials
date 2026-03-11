package com.esi.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
    private List<NotificationListener> listeners = new ArrayList<>();

    public void subscribe(NotificationListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(NotificationListener listener) {
        listeners.remove(listener);
    }

    public void notify(List<TaskComponent> tasksForDay) {
        for (NotificationListener listener : listeners) {
            listener.update(tasksForDay);
        }
    }
}
