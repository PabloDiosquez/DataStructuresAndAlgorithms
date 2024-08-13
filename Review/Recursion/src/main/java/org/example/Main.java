package org.example;

public class Main {
    public static void main(String[] args) {
        message(5);
    }

    static void message(){
        System.out.println("Hello World!");
    }

    static void message(int times){
        if(times == 0){
            return;
        }
        System.out.println("Hello World!");
        message(times-1);
    }
}