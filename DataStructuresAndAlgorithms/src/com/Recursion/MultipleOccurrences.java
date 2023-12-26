package com.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 3, 5, 3, 3, 7};
        List<Integer> indices = indices(arr, 3);

        for (int  i: indices){
            System.out.println(i);
        }
    }

    static List<Integer> indices(int[] arr, int target){
        return _indices(arr, target, new ArrayList<>(), 0);
    }

    static List<Integer> _indices(int[] arr, int target, ArrayList<Integer> indices, int index){
        if(index == arr.length){
            return indices;
        }

        if(arr[index] == target){
            indices.add(index);
            return _indices(arr, target, indices, index+1);
        }
        return _indices(arr, target, indices, index+1);
    }
}
