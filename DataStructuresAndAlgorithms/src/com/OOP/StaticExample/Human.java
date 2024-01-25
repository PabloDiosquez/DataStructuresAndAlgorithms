package com.OOP.StaticExample;

public class Human {
    String name;
    int age;
    float salary;
    static int population = 7000000;

    public Human() {
        this("Default human", 0, 0.0F);
    }
    public Human(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        Human.population++;
    }
}
