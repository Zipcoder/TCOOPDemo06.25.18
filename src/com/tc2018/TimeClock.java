package com.tc2018;

public class TimeClock {
    TimeCard[] timecards;

    TimeClock(TimeCard[] timecards) {
        this.timecards = timecards;
    }

    public void setStartTime(int start, int employeeId) {
        for(TimeCard timeCard : this.timecards) {
            if(employeeId == timeCard.getId()) {
                System.out.println("Employee Id: " + employeeId);
                timeCard.setStartTime(start);
            }
        }
    }

    public void setEndTime(int end, int employeeId) {
        for(TimeCard timeCard : this.timecards) {
            if(employeeId == timeCard.getId()) {
                System.out.println("Employee Id: " + employeeId);
                timeCard.setEndTime(end);
            }
        }
    }
}
