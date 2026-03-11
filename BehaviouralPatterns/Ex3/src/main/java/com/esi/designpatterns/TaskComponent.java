package com.esi.designpatterns;

import java.util.Date;

public abstract class TaskComponent {
    protected String description;
    protected String status;
    protected Date dueDate;
    protected String category;

    public TaskComponent(String description, String status, Date dueDate, String category) {
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
        this.category = category;
    }

    public abstract int getPriority();

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s (Status: %s, Priority: %d)", 
            category, description, status, getPriority());
    }
}
