package com.OOP.StaticExample;

/**
 * The {@code Human} class represents a basic human entity with attributes
 * such as name, age, and salary.
 */
public class Human {

    /**
     * The name of the human.
     */
    String name;

    /**
     * The age of the human.
     */
    int age;

    /**
     * The salary of the human.
     */
    float salary;

    /**
     * The total population of humans (static variable shared among all instances).
     */
    static int population = 7000000;

    /**
     * Default constructor for creating a {@code Human} object with default values.
     * The default name is "Default human", age is 0, and salary is 0.0F.
     */
    public Human() {
        this("Default human", 0, 0.0F);
    }

    /**
     * Parameterized constructor for creating a {@code Human} object with specified values.
     *
     * @param name    The name of the human.
     * @param age     The age of the human.
     * @param salary  The salary of the human.
     */
    public Human(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        Human.population++;
    }
}
