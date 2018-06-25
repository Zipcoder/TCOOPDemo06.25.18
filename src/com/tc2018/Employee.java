package com.tc2018;

public class Employee {
    private int id;
    private static int lastId;

    Employee() {
        this.id = lastId + 1;
        incrementId();
    }

    public int getId() {
        return this.id;
    }

    private static void incrementId() {
        lastId++;
    }
}
