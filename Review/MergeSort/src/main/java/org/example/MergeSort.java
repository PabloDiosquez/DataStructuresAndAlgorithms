package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 6, 12);
        List<Integer> list2 = Arrays.asList(2, 3, 14, 15,65,100);
        List<Integer> merged = new ArrayList<>();

        merge(list1, list2, merged, 0, 0);

        System.out.println(merged);
    }




    private static void merge(List<Integer> list1, List<Integer> list2, List<Integer> merged, int s, int e){
        if(s == list1.size() || e == list2.size()){
            while(s < list1.size()){
                merged.add(list1.get(s));
                s++;
            }

            while(e < list2.size()){
                merged.add(list2.get(e));
                e++;
            }
            return;
        }

        if(list1.get(s) < list2.get(e)){
            merged.add(list1.get(s));
            merge(list1, list2, merged, s+1, e);
        }else {
            merged.add(list2.get(e));
            merge(list1, list2, merged, s, e+1);
        }
    }
}