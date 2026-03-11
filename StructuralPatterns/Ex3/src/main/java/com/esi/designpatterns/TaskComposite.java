package com.esi.designpatterns;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskComposite extends TaskComponent {
    private List<TaskComponent> subtasks = new ArrayList<>();

    public TaskComposite(String description, String status, Date dueDate, String category) {
        super(description, status, dueDate, category);
    }

    public void addSubtask(TaskComponent task) {
        subtasks.add(task);
    }

    @Override
    public int getPriority() {
        if (subtasks.isEmpty()) return 0;
        double sum = 0;
        for (TaskComponent task : subtasks) {
            sum += task.getPriority();
        }
        return (int) Math.round(sum / subtasks.size());
    }

    public List<TaskComponent> getSubtasks() {
        return subtasks;
    }
}
