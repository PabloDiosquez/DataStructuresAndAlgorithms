package com.Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9};
        System.out.println(sorted(arr));
    }

    static boolean sorted(int[] arr){
        return _sorted(arr, 0);
    }
    static boolean _sorted(int[] arr, int start){
        if(start == arr.length - 1){
            return true;
        }
        return arr[start] < arr[start+1] && _sorted(arr, start+1);
    }
}
