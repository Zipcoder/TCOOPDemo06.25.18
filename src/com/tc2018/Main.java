package com.tc2018;

public class Main {

    public static void main(String[] args) {
    	// Time Clock Example
    	Employee e1 = new Employee(); // static int lastId = 0
    	Employee e2 = new Employee(); // static int lastId = 1
    	Employee e3 = new Employee(); // static int lastId = 2

    	System.out.println(e1.getId());
    	System.out.println(e2.getId());
    	System.out.println(e3.getId());

    	TimeCard tc1 = new TimeCard(e1.getId()); // 1
    	TimeCard tc2 = new TimeCard(e2.getId()); // 2
    	TimeCard tc3 = new TimeCard(e3.getId()); // 3

		TimeCard[] timecards = {tc1, tc2, tc3};

    	TimeClock timeClock = new TimeClock(timecards);

    	timeClock.setStartTime(9, e1.getId());

    	timeClock.setEndTime(17, e2.getId());

    	// Person example

		int money = 2000;

	    Person domi = new Person("Domi", 26, money);
	    Person tariq = new Person("Tariq", 21, money);

	    System.out.println(money);

	    System.out.println(domi.getName());
	    System.out.println(tariq.getName());
    }
}
