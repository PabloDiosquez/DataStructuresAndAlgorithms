package com.OOP.StaticExample;

/**
 * The {@code Main} class contains the main method to demonstrate the usage of the {@code Human} class.
 */
public class Main {

    /**
     * The main method that serves as the entry point of the program.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Display the initial population of humans
        System.out.println("Initial Human Population: " + Human.population);

        // Create two Human objects using different constructors
        Human human1 = new Human(); // Using the default constructor
        Human human2 = new Human("Kunal Kushwaha", 25, 10100F); // Using the parameterized constructor

        // Display the updated population of humans after creating instances
        System.out.println("Updated Human Population: " + Human.population);
    }
}
