package org.example;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 5, 12, 4, 7, 0, 4,};
        // System.out.println(search(arr, 4));
        System.out.println(getElementPositions(arr, 4));
    }

    static ArrayList<Integer> getElementPositions(int[] arr, int key){
        ArrayList<Integer> positions = new ArrayList<>();
        return helperGetElementPositions(arr, key, positions, 0);
    }

    private static ArrayList<Integer> helperGetElementPositions(int[] arr, int key, ArrayList<Integer> positions, int s) {
        if(s == arr.length){
            return positions;
        }
        if(arr[s] == key){
            positions.add(s);
        }
        return helperGetElementPositions(arr, key, positions, s+1);
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
