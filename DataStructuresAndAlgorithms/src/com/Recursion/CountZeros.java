package com.Recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(100101));
    }

    static int countZeros(int number){
        if(number == 0){
            return 0;
        }
        return countZeros(number / 10) + zero(number % 10);
    }

    private static int zero(int digit){
        if(digit == 0) return 1;
        return 0;
    }










}
