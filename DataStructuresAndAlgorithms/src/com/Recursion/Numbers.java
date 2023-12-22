package com.Recursion;

public class Numbers {
    public static void main(String[] args) {
        // Write a function that takes in a number and prints it.
        // Prints first 5 numbers: 1 2 3 4 5
        printNumbers();
    }

    static void printNumbers(){
        printNumber1();
    }

    static void printNumber1(){
        System.out.println(1);
        printNumber2();
    }

    static void printNumber2(){
        System.out.println(2);
        printNumber3();
    }

    static void printNumber3(){
        System.out.println(3);
        printNumber4();
    }

    static void printNumber4(){
        System.out.println(4);
        printNumber5();
    }

    static void printNumber5(){
        System.out.println(5);
    }
}
