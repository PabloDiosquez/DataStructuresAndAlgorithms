package com.LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) throws Exception {
        System.out.println(search("Hello World!", 'l'));
    }

    // Method to search for a character in a string
    static boolean search(String str, char target) throws Exception {
        // Check if the input string is empty, and throw an exception if true
        if (str.isEmpty()) throw new Exception("The string is empty.");

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is equal to the target character
            if (str.charAt(i) == target)
                // Return true if a match is found
                return true;
        }

        // Return false if no match is found
        return false;
    }

    // An alternative version of the search method using a foreach loop
    static boolean searchV2(String str, char target) throws Exception {
        // Check if the input string is empty, and throw an exception if true
        if (str.isEmpty()) throw new Exception("The string is empty.");

        // Loop through each character in the string using a foreach loop
        for (char ch : str.toCharArray()) {
            // Check if the current character is equal to the target character
            if (ch == target)
                // Return true if a match is found
                return true;
        }

        // Return false if no match is found
        return false;
    }
}
