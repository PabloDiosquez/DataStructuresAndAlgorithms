package com.OOP.StaticExample;

/**
 * The {@code StaticInit} class demonstrates the usage of static initialization blocks in Java.
 * It initializes static variables 'a' and 'b' in a static block, ensuring they are computed
 * and assigned only once when the first object is created.
 */
public class StaticInit {

    /** Represents the first static variable. */
    static int a;

    /** Represents the second static variable, calculated based on 'a'. */
    static int b;

    /**
     * This static block is executed only once, when the class is loaded into memory.
     * It initializes static variables 'a' and 'b' with predefined values.
     */
    static {
        System.out.println("I am in static block...");
        a = 5;
        b = a * 10;
    }

    /**
     * The main method is the entry point of the program.
     * It demonstrates the usage of the class by creating objects and accessing static variables.
     *
     * @param args The command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create an object of the class to trigger static block execution.
        StaticInit obj = new StaticInit();

        // Display the values of static variables 'a' and 'b'.
        System.out.println("Value of 'a': " + StaticInit.a);
        System.out.println("Value of 'b': " + StaticInit.b);

        // Modify the value of 'b' and display the updated values.
        StaticInit.b += 12;

        // Create another object to show that static block is not executed again.
        StaticInit obj1 = new StaticInit();
        System.out.println("Updated value of 'a': " + StaticInit.a);
        System.out.println("Updated value of 'b': " + StaticInit.b);
    }
}
