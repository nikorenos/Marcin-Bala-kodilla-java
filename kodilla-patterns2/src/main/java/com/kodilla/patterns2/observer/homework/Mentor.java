package com.kodilla.patterns2.observer.homework;

public class Mentor implements TaskObserver {
    private final String firstname;
    private final String lastname;
    private int updateCount;

    public Mentor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public void updateTaskQueue(TaskQueue taskQueue) {
        System.out.println(firstname + " "+ lastname + ": New tasks in queue " + taskQueue.getName() + "\n" +
                " total: " + taskQueue.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}