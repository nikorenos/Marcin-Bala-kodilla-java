package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;
    private final String taskListName;

    public TaskList(final String taskListName) {
        this.taskListName = taskListName;
        tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getTaskListName() {
        return taskListName;
    }

    public void addTask(String taskName) {
        tasks.add(taskName);
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                ", taskListName='" + taskListName + '\'' +
                '}';
    }
}
