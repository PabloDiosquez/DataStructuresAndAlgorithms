package org.example;

public class NumbersExample {

    public static void printsNumbers(int number){
        printsNumbersFrom(number, 1);
    }

    private static void printsNumbersFrom(int number, int start){
        if(start > number){
            return;
        }
        System.out.print(start + " ");
        printsNumbersFrom(number, start+1);
    }
}
