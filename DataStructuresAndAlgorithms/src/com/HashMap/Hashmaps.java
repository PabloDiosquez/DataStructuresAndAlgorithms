package com.HashMap;

/**
 * The Hashmaps class demonstrates the usage of HashMaps in Java.
 */
public class Hashmaps {

    /**
     * The main method is the entry point of the program.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Step 1: Initialize a string
        String name = "Kunal";

        // Step 2: Generate the hash code for the string
        int hashCode = generateHashCode(name);

        // Step 3: Print the generated hash code
        printHashCode(hashCode);
    }

    /**
     * Generates the hash code for a given string.
     *
     * @param str The input string for which the hash code is to be generated.
     * @return The hash code of the input string.
     */
    private static int generateHashCode(String str) {
        return str.hashCode();
    }

    /**
     * Prints the hash code to the console.
     *
     * @param hashCode The hash code to be printed.
     */
    private static void printHashCode(int hashCode) {
        System.out.println("Generated Hash Code: " + hashCode);
    }
}
