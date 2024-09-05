package org.example;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 5, 12, 6, 7, 0, 21,};
        System.out.println(search(arr, 4));
    }

    static int search(int[] arr, int key){
        return helper(arr, key, 0);
    }

    private static int helper(int[] arr, int key, int s) {
        if(s == arr.length){
            return -1;
        }
        return (arr[s] == key) ? s : helper(arr, key, s+1);
    }
}
