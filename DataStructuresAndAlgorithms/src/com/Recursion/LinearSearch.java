package com.Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 7, 8, -4, 9};
        System.out.println(search(arr, 4));
    }

    static boolean search(int[] arr, int target){
        return _search(arr, target, 0);
    }

    private static boolean _search(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || _search(arr, target, index+1);
    }
}
