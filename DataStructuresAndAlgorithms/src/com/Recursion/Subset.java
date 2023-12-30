package com.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        String s = "abc";
        //subsets(s);
        System.out.println(substrings(s));
    }

    /**
     * Generates and prints all possible subsets of the given string.
     *
     * @param input The input string for which subsets are to be generated.
     */
    public static void subsets(String input) {
        subsets("", input);
    }

    /**
     * Recursively generates and prints subsets of the given string.
     *
     * @param currentSubset The current subset being generated.
     * @param remainingChars The remaining characters in the input string.
     */
    private static void subsets(String currentSubset, String remainingChars) {
        if (remainingChars.isEmpty()) {
            // Base case: Print the current subset when no characters are left.
            System.out.println(currentSubset);
            return;
        }

        // Include the first character and recurse
        char firstChar = remainingChars.charAt(0);
        subsets(currentSubset + firstChar, remainingChars.substring(1));

        // Exclude the first character and recurse
        subsets(currentSubset, remainingChars.substring(1));
    }

    // ##############################################

    /**
     * Generates all possible substrings of the given string.
     *
     * @param s The input string.
     * @return An ArrayList containing all possible substrings of the input string.
     */
    public static ArrayList<String> substrings(String s) {
        return _substrings(s, "");
    }

    /**
     * Recursively generates all possible substrings of the given string.
     *
     * @param up The remaining portion of the input string.
     * @param p  The current substring being generated.
     * @return An ArrayList containing all possible substrings of the input string.
     */
    private static ArrayList<String> _substrings(String up, String p) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = _substrings(up.substring(1), ch + p);
        ArrayList<String> right = _substrings(up.substring(1), p);

        left.addAll(right);
        return left;
    }

    public static List<List<Integer>> subsets(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int number: arr){
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(number);
                outer.add(internal);
            }
        }
        return outer;
    }

    /**
     * Unused function: Adds a character to everyone in the list.
     *
     * @param c      The character to add.
     * @param strings The list of strings.
     */
    private static ArrayList<String> addToEveryone(char c, ArrayList<String> strings) {
        return _addToEveryone(c, new ArrayList<>(), strings, 0);
    }

    /**
     * Unused function: Recursively adds a character to everyone in the list.
     *
     * @param c      The character to add.
     * @param actual The current list being generated.
     * @param old    The original list of strings.
     * @param index  The current index in the original list.
     * @return An ArrayList containing strings with the added character.
     */
    private static ArrayList<String> _addToEveryone(char c, ArrayList<String> actual, ArrayList<String> old, int index) {
        if (index == old.size()) {
            return actual;
        }

        String s = c + old.get(index);
        actual.add(s);
        return _addToEveryone(c, actual, old, index + 1);
    }
}
