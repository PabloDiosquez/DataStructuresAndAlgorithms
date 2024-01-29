package com.OOP.StaticExample;

public class StaticInit {
    static int a;
    static int b;

    //Static block

    // Will only run once, when the first obj is created.
    static{
        System.out.println("I am in static block...");
        a = 5;
        b = a * 10;
    }

    public static void main(String[] args) {
        StaticInit obj = new StaticInit();

        System.out.println(StaticInit.a);
        System.out.println(StaticInit.b);

        StaticInit.b += 12;

        StaticInit obj1 = new StaticInit();
        System.out.println(StaticInit.a);
        System.out.println(StaticInit.b);
    }
}
