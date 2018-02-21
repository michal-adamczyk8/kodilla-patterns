package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "Shopping";
    public static final String PAINTING = "Painting";
    public static final String DRIVING = "Driving";

    public Task makeTask(final String task) {
        switch (task) {
            case SHOPPING :
                return new ShoppingTask("Shopping List", "Carrots", 15);
            case PAINTING :
                return new PaintingTask("Da Vinci", "Red", "Mona Lisa");
            case  DRIVING :
                return new DrivingTask("Taxi", "School", "Ferrari");
            default :
                return null;
        }
    }
}
