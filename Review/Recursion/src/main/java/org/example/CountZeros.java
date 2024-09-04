package org.example;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros_v(30204));
    }

    static int countZeros_v(int n){
        return countZerosHelper(n, 0);
    }

    private static int countZerosHelper(int n, int c) {
        if (n == 0){
            return c+1;
        }
        if (n <= 9){
            return c;
        }
        int remainder = n % 10;
        if (remainder == 0){
            return countZerosHelper(n / 10, c+1);
        }
        return countZerosHelper(n / 10, c);
    }

    static int countZeros(int n){
        if(n == 0){
            return 1;
        }
        if (n <= 9){
            return 0;
        }
        int remainder = n % 10;
        return oneIfZeroOtherwise(remainder == 0) + countZeros(n / 10);
    }

    private static int oneIfZeroOtherwise(boolean condition){
        if(condition){
            return 1;
        }
        return 0;
    }
}
