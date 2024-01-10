package com.StringBuffer;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        System.out.println(generate(6));
    }
    static String generate(int size){
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randomChar = random.nextInt(97, 123);
            sb.append((char)randomChar);
        }
        return sb.toString();
    }
}
