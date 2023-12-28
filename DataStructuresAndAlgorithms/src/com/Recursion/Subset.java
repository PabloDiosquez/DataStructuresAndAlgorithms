package com.Recursion;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        String s = "abc";
        subsets(s);
    }

    static void subsets(String up){
        subsets("", up);
    }
    private static void subsets(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subsets(ch + p, up.substring(1));
        subsets(p, up.substring(1));
    }
}
