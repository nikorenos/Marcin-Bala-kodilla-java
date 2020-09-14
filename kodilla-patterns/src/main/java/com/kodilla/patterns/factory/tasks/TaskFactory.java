package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Pizza delivery", "Warsaw", "Mazda");
            case PAINTINGTASK:
                return new PaintingTask("Painting", "yellow", "walls");
            case SHOPPINGTASK:
                return new ShoppingTask("Buy mineral water", "Water", 2);
            default:
                return null;
        }
    }
}
