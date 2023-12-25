package com.Recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZerosV1(30204));
        System.out.println(countZerosV2(30204));
    }

    static int countZerosV1(int number){
        return _countZerosV1(number, 0);
    }
    private static int _countZerosV1(int number, int count){
        if(number == 0){
            return count;
        }

        if(number % 10 == 0){
            return _countZerosV1(number / 10, count + 1);
        }
        return _countZerosV1(number / 10, count);
    }
    static int countZerosV2(int number){
        if(number == 0){
            return 0;
        }
        return countZerosV2(number / 10) + zero(number % 10);
    }
    private static int zero(int digit){
        if(digit == 0) return 1;
        return 0;
    }
}
