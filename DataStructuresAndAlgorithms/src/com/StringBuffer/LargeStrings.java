package com.StringBuffer;

/**
 * The LargeStrings class demonstrates the usage of the StringBuffer class,
 * highlighting its advantages over String.
 *
 * StringBuffer advantages over String:
 * 1. Mutable
 * 2. Efficient
 * 3. Thread safe (but slower)
 */
public class LargeStrings {

    /**
     * The main method demonstrates the usage of the StringBuffer class.
     *
     * @param args Command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Constructor 1°
        StringBuffer buffer1 = new StringBuffer();

        // Some methods

        // Append strings to the end of the StringBuffer
        buffer1.append("WeDevs");
        buffer1.append(" is nice!");

        // Insert a string at a specific position
        buffer1.insert(2, "Make");

        // Replace a portion of the StringBuffer with a new string
        buffer1.replace(2, 6, "Kushwaha");

        // Delete a portion of the StringBuffer
        buffer1.delete(1, 6);

        // Reverse the content of the StringBuffer
        buffer1.reverse();

        // Constructor 2°
        StringBuffer buffer2 = new StringBuffer("Lio Messi");

        // Constructor 3°
        StringBuffer buffer3 = new StringBuffer(30);

        // Convert StringBuffer to String
        String str = buffer1.toString();

        // Print the final string
        System.out.println(str);
    }
}
