package com.Recursion;

public class Digits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
        System.out.println(productOfDigits(1234));
    }

    static int sumOfDigits(int n){
        if(n <= 9){
            return n;
        }

        int digit = n % 10;
        return digit + sumOfDigits(n / 10);
    }

    static int productOfDigits(int n){
        if(n <= 9){
            return n;
        }
        int digit = n % 10;
        return productOfDigits(n / 10) * digit;
    }
}
