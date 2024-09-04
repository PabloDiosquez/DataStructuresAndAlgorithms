package org.example;

public class NumberOfSteps {
    //Given an integer num, return the number of steps
    // to reduce it to zero.
    // In one step, if the current number is even, you have
    // to divide it by 2; otherwise, you have to subtract 1 from it.
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    static int numberOfSteps(int n){
        if(n == 0){
            return 0;
        }
        if(n % 2 == 0){
            return 1 + numberOfSteps(n / 2);
        }
        return 1 + numberOfSteps(n-1);
    }
}