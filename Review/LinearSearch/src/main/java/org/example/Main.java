package org.example;

public class Main {

    public static void main(java.lang.String[] args) {
        // Test case 1: Character is found in the string
        java.lang.String str1 = "hello";
        char target1 = 'e';
        boolean result1 = String.search(str1, target1);
        System.out.println("Test case 1 - Expected: true, Result: " + result1);

        // Test case 2: Character is not found in the string
        java.lang.String str2 = "world";
        char target2 = 'z';
        boolean result2 = String.search(str2, target2);
        System.out.println("Test case 2 - Expected: false, Result: " + result2);

        // Test case 3: String is empty
        java.lang.String str3 = "";
        char target3 = 'a';
        boolean result3 = String.search(str3, target3);
        System.out.println("Test case 3 - Expected: false, Result: " + result3);

        // Test case 4: Character is the first character in the string
        java.lang.String str4 = "apple";
        char target4 = 'a';
        boolean result4 = String.search(str4, target4);
        System.out.println("Test case 4 - Expected: true, Result: " + result4);

        // Test case 5: Character is the last character in the string
        java.lang.String str5 = "banana";
        char target5 = 'a';
        boolean result5 = String.search(str5, target5);
        System.out.println("Test case 5 - Expected: true, Result: " + result5);
    }
}
