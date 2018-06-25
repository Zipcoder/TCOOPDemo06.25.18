package com.tc2018;

public class TimeCard {
    private int id;
    private int startTime;
    private int endTime;

    TimeCard(int id) {
        this.id = id;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
        System.out.println(" " + this.startTime);
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
        System.out.println(" " + this.endTime);
    }

    public int getId() {
        return this.id;
    }

    public TimeCard getById(int id) {
        if(id == this.id) {
            return this;
        }
        return null;
    }
}
