package com.Recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * The Permutation class generates permutations of a given string and returns them as a list.
 */
public class Permutation {

    /**
     * The main method initializes the starting string and calls the permutationsList method.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(permutationsList("", s));
    }

    /**
     * Recursively generates all permutations of the given string and returns them as a list.
     *
     * @param p The partial permutation being constructed.
     * @param up The remaining characters to be permuted.
     * @return A list of all permutations of the given string.
     */
    static List<String> permutationsList(String p, String up) {
        // Base case: if all characters are used, add the permutation to the list
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // Choose a character from the remaining characters
        char ch = up.charAt(0);

        // List to store permutations
        ArrayList<String> ans = new ArrayList<>();

        // Iterate through all possible positions to insert the chosen character
        for (int i = 0; i <= p.length(); i++) {
            // Divide the partial permutation into two parts
            String f = p.substring(0, i);
            String s = p.substring(i);

            // Recursively generate permutations with the chosen character inserted
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }

        return ans;
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
