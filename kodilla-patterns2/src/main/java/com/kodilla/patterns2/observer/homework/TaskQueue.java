package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements TaskObservable {
    private final List<TaskObserver> observers;
    private final List<String> tasks;
    private final String name;

    public TaskQueue(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }
    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }


    @Override
    public void registerObserver(TaskObserver taskObserver) {
        observers.add(taskObserver);
    }

    @Override
    public void notifyObservers() {
        for(TaskObserver taskObserver : observers) {
            taskObserver.updateTaskQueue(this);
        }
    }

    @Override
    public void removeObserver(TaskObserver taskObserver) {
        observers.remove(taskObserver);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
