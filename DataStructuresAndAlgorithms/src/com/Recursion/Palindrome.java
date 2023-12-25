package com.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(4324));
    }

    static boolean palindrome(int number){
        return number == reverse(number);
    }

    private static int reverse(int number) {
        if(number == 0){
            return 0;
        }
        int numberOfDigits = (int)Math.log10(number);
        int lastDigit = number % 10;
        return (int) (lastDigit * Math.pow(10, numberOfDigits) + reverse(number / 10));
    }
}
