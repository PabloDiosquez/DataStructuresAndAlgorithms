package org.example;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(1223221));
        System.out.println(palindrome(1223421));
    }

    static boolean palindrome(int n){
        return n == reverse(n);
    }

    private static int reverse(int n) {
        int digits = (int) Math.log10(n) + 1;
        return helperRev(n, digits);
    }

    private static int helperRev(int n, int digits) {
        int remainder = n % 10;
        if (n == remainder){
            return n;
        }
        return remainder * (int) (Math.pow(10, digits-1)) + helperRev(n / 10, digits-1);
    }


}
