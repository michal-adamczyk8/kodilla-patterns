package com.kodilla.patterns.factory.tasks;

import java.time.LocalDate;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }


    @Override
    public void executeTask() {
        System.out.println("You're going to " + where + " by " + using);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean result = false;
        if (LocalDate.now().getDayOfMonth() % 2 == 0) {
            result = true;
        }
        return result;
    }
}
