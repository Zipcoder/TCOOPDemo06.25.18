package com.tc2018;

public class Person {
    private String name;
    private int age;
    private int money;

    Person(String name, int age, int money) {
        money += 20;
        this.name = name;
        this.age = age;
        this.money = money;
        System.out.println(this.money);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void acceptMoney(int money) {
        this.money += money;
    }

    public void giveMoney(Person person, int money) {
        person.acceptMoney(money);
        this.money -= money;
        System.out.println(this.money);
        System.out.println(person.money);
    }
}
