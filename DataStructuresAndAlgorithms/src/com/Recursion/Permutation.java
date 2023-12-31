package com.Recursion;

import java.util.ArrayList;
import java.util.List;

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
        // permutations("", s);
        System.out.println(permutationsList("", s));
    }

    static List<String> permutationsList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            ans.addAll(permutationsList(f+ch+s, up.substring(1)));

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
