package com.OOP.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human("Kunal Kushwaha", 25, 10100F);

        System.out.println(Human.population);

    }
}
