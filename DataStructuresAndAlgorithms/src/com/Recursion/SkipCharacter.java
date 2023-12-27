package com.Recursion;

public class SkipCharacter {
    public static void main(String[] args) {
        String str = "Batman is the best hero ever!";
        System.out.println(skip(str, 'e'));
    }

    static String skip(String str, char c){
        return _skip(str, c, new StringBuilder(), 0);
    }
    private static String _skip(String str, char c, StringBuilder sb, int index){
        if(index == str.length()){
            return sb.toString();
        }

        if(str.charAt(index) != c){
            sb.append(str.charAt(index));
        }
        return _skip(str, c , sb, index+1);
    }
}
