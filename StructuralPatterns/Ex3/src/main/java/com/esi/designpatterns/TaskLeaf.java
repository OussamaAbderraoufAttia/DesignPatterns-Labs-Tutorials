package com.esi.designpatterns;

import java.util.Date;

public class TaskLeaf extends TaskComponent {
    private int priority;

    public TaskLeaf(String description, String status, Date dueDate, String category, int priority) {
        super(description, status, dueDate, category);
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority;
    }
}
