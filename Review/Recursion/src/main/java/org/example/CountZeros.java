package org.example;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(34));
    }

    static int countZeros(int n){
        if(n == 0){
            return 1;
        }
        if (n <= 9){
            return 0;
        }
        int remainder = n % 10;
        return helper(remainder == 0) + countZeros(n / 10);
    }

    private static int helper(boolean condition){
        if(condition){
            return 1;
        }
        return 0;
    }
}
