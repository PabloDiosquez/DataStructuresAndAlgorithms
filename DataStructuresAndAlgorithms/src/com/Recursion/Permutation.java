package com.Recursion;

/**
 * The Permutation class generates and prints all permutations of a given string.
 */
public class Permutation {

    /**
     * The main method initializes the starting string and calls the permutations method.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        String s = "abc";
        permutations("", s);
    }

    /**
     * Recursively generates and prints all permutations of the given string.
     *
     * @param p The partial permutation being constructed.
     * @param up The remaining characters to be permuted.
     */
    static void permutations(String p, String up) {
        // Base case: if all characters are used, print the permutation
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        // Choose a character from the remaining characters
        char ch = up.charAt(0);

        // Iterate through all possible positions to insert the chosen character
        for (int i = 0; i <= p.length(); i++) {
            // Divide the partial permutation into two parts
            String f = p.substring(0, i);
            String s = p.substring(i);

            // Recursively generate permutations with the chosen character inserted
            permutations(f + ch + s, up.substring(1));
        }
    }
}
