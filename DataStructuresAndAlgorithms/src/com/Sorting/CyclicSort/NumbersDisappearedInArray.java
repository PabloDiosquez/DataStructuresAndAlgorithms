package com.Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersDisappearedInArray {
    public static void main(String[] args) {
        int[] arr = {3,2,3,4,8,2,7,1};
        cyclicSort(arr);
        System.out.println(numbersDisappeared(arr));
    }

    static List<Integer> numbersDisappeared(int[] numbers){
        cyclicSort(numbers);
        List<Integer> missingNumbers = new ArrayList<>();

        for (int i = 1; i <= numbers.length; i++) {
            if(numbers[i-1] != i){
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }

    static void cyclicSort(int[] numbers){
        int i = 0;
        while(i < numbers.length){
            int correct = numbers[i] - 1;
            if(numbers[i] != numbers[correct]){
                swap(numbers, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] numbers, int first, int second){
        int temp        = numbers[first];
        numbers[first]  = numbers[second];
        numbers[second] = temp;
    }
}
