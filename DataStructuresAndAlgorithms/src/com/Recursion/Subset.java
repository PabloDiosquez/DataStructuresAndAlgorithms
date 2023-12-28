package com.Recursion;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        String s = "abc";
        //subsets(s);
        System.out.println(substrings(s, "", new ArrayList<String>(), new ArrayList<String>()));
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

    static ArrayList<String> substrings(String up, String p, ArrayList<String> first, ArrayList<String> second){
        if(up.isEmpty()){
            first.addAll(second);
            return first;
        }

        char ch = up.charAt(0);
        second.add(ch + p);
        first.add(p);
        return substrings(up.substring(1), ch+p, first, second);

    }
    private static void addToEveryone(char c, ArrayList<String> strings){
        _addToEveryone(c, new ArrayList<String>(), strings, 0);
    }

    private static ArrayList<String> _addToEveryone(char c, ArrayList<String> actual, ArrayList<String> old, int index){
        if(index == old.size()){
            return actual;
        }

        String s = c + old.get(index);
        actual.add(s);
        return _addToEveryone(c, actual, old, index+1);
    }
}
