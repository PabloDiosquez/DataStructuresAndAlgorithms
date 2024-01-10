package com.StringBuffer;

// StringBuffer: Advantages over String
// 1. Mutable
// 2. Efficient
// 3. Thread safe (slower)

public class LargeStrings {
    public static void main(String[] args) {
        // Constructor 1°
        StringBuffer buffer1 = new StringBuffer();
        buffer1.append("WeDevs");
        buffer1.append(" is nice!");

        buffer1.insert(2, "Make");

        // Constructor 2°
        StringBuffer buffer2 = new StringBuffer("Lio Messi");

        // Constructor 3°
        StringBuffer buffer3 = new StringBuffer(30);

        String str = buffer1.toString();
        System.out.println(str);
    }
}
