package org.example;

/**
 * The {@code String} class provides a method to search for a specific character
 * in a given string.
 */
public class String {

    /**
     * Searches for the target character in the given string.
     *
     * @param str    the string in which to search for the character.
     *               If the string is empty, the method returns {@code false}.
     * @param target the character to search for in the string.
     * @return {@code true} if the target character is found in the string,
     *         otherwise {@code false}.
     */
    static boolean search(java.lang.String str, char target) {
        if (str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }
}