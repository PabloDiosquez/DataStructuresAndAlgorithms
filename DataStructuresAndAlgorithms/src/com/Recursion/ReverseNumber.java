package com.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1823));
    }

    static int reverse(int number){
        if(number == 0){
            return 0;
        }
        int lastDigit = number % 10;
        return (int) (lastDigit * Math.pow(10, (int)Math.log10(number)) + reverse(number / 10));
    }
}
