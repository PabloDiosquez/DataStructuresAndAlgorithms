package com.Recursion;

public class Triangles {
    public static void main(String[] args) {
        triangle(4);
    }

    static void triangle(int n){
        if(n == 0){
            return;
        }

        paint('*', n);

        System.out.println();
        triangle(n-1);
    }

    static void paint(char c, int n){
        if(n == 0){
            return;
        }
        System.out.print(c);
        paint(c, n-1);
    }
}
