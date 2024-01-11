package com.StringBuffer;

import java.util.Random;

/**
 * The RandomString class generates random strings of specified lengths.
 */
public class RandomString {

    /**
     * The main method demonstrates the usage of the generate method.
     *
     * @param args Command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Generate and print a random string of length 10
        System.out.println(generate(10));

        // Generate and print a random string of length 20
        System.out.println(generate(20));
    }

    /**
     * Generates a random string of the specified length.
     *
     * @param size The length of the random string to generate.
     * @return A randomly generated string.
     */
    static String generate(int size) {
        // Create a StringBuffer to efficiently build the random string
        StringBuffer sb = new StringBuffer();

        // Create a Random object for generating random characters
        Random random = new Random();

        // Loop through each position in the string
        for (int i = 0; i < size; i++) {
            // Generate a random ASCII value for lowercase letters (97-122)
            int randomChar = random.nextInt(26) + 97;

            // Append the random character to the StringBuffer
            sb.append((char) randomChar);
        }

        // Convert the StringBuffer to a String and return
        return sb.toString();
    }
}
