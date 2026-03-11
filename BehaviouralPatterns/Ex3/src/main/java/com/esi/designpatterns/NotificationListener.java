package com.esi.designpatterns;

import java.util.List;

public interface NotificationListener {
    void update(List<TaskComponent> tasks);
}
