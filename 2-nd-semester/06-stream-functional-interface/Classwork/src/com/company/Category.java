package com.company;

public enum Category {
    ORDINARY(100),
    VETERAN(200);


    private int priority;

    Category(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
