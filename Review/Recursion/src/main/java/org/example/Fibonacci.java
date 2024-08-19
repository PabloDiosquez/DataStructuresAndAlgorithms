package org.example;

public class Fibonacci {

    public static int nthFibonacciNumber(int n){
        if(n <= 1){
            return n;
        }
        return nthFibonacciNumber(n-1) + nthFibonacciNumber(n-2);
    }
}
