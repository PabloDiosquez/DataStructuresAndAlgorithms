package com.Recursion;

/**
 * The Stream class demonstrates two methods for skipping occurrences of a specific character in a given String.
 */
public class Stream {

    /**
     * The main method serves as an entry point for the program, showcasing the usage of the skipV1 and skipV2 methods.
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        String str = "Batman is the best hero ever!";

        // Using skipV1 method
        skipV1(str, 'e');

        // Using skipV2 method and printing the result
        System.out.println(skipV2(str, 'e'));
    }

    /**
     * Skips occurrences of a specified character in the given String using recursion.
     * @param p The input String to process.
     * @param ch The character to skip.
     * @return The resulting String after skipping the specified character.
     */
    static String skip(String p, char ch) {
        if (p.isEmpty()) {
            return "";
        }

        char c = p.charAt(0);

        if (c == ch) {
            // If the current character matches the specified character, skip it and continue with the rest of the String
            return skip(p.substring(1), ch);
        } else {
            // If the current character does not match, include it in the result and continue with the rest of the String
            return c + skip(p.substring(1), ch);
        }
    }

    /**
     * Skips occurrences of a specified character in the given String using recursion.
     * @param up The input String to process.
     * @param ch The character to skip.
     */
    static void skipV1(String up, char ch) {
        _skipV1("", up, ch);
    }

    /**
     * Helper method for skipV1, implements the actual skipping logic using recursion.
     * @param p The partial result accumulated so far.
     * @param up The remaining input String to process.
     * @param ch The character to skip.
     */
    private static void _skipV1(String p, String up, char ch) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);
        if (c == ch) {
            _skipV1(p, up.substring(1), ch);
        } else {
            _skipV1(p + c, up.substring(1), ch);
        }
    }

    /**
     * Skips occurrences of a specified character in the given String using StringBuilder and recursion.
     * @param str The input String to process.
     * @param c The character to skip.
     * @return The resulting String after skipping the specified character.
     */
    static String skipV2(String str, char c) {
        return _skipV2(str, c, new StringBuilder(), 0);
    }

    /**
     * Helper method for skipV2, implements the actual skipping logic using StringBuilder and recursion.
     * @param str The input String to process.
     * @param c The character to skip.
     * @param sb The StringBuilder to accumulate the result.
     * @param index The current index in the input String.
     * @return The resulting String after skipping the specified character.
     */
    private static String _skipV2(String str, char c, StringBuilder sb, int index) {
        if (index == str.length()) {
            return sb.toString();
        }

        if (str.charAt(index) != c) {
            sb.append(str.charAt(index));
        }
        return _skipV2(str, c, sb, index + 1);
    }
}
