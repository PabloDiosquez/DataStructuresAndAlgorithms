package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A class that provides an implementation of the Merge Sort algorithm.
 */
public class MergeSort {

    /**
     * Main method to test the Merge Sort implementation.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 2, 6, 21, 12, 8);
        System.out.println(mergeSort(list1));
    }

    /**
     * Sorts a list of integers using the Merge Sort algorithm.
     *
     * @param arr The list of integers to be sorted.
     * @return A new list containing the sorted integers.
     */
    public static List<Integer> mergeSort(List<Integer> arr) {
        return _mergeSort(arr, 0, arr.size() - 1);
    }

    /**
     * Recursively divides the list into smaller sublists and sorts them.
     *
     * @param arr The original list of integers.
     * @param s   The starting index of the current segment.
     * @param e   The ending index of the current segment.
     * @return A sorted list containing the elements from index s to e.
     */
    private static List<Integer> _mergeSort(List<Integer> arr, int s, int e) {
        if (s > e) {
            return new ArrayList<>();
        }

        if (s == e) {
            List<Integer> singleElementList = new ArrayList<>();
            singleElementList.add(arr.get(s));
            return singleElementList;
        }

        int mid = s + (e - s) / 2;

        List<Integer> left = _mergeSort(arr, s, mid);
        List<Integer> right = _mergeSort(arr, mid + 1, e);

        return merge(left, right);
    }

    /**
     * Merges two sorted lists into a single sorted list.
     *
     * @param first  The first sorted list.
     * @param second The second sorted list.
     * @return A merged list that contains all elements from the first and second lists, in sorted order.
     */
    private static List<Integer> merge(List<Integer> first, List<Integer> second) {
        List<Integer> merged = new ArrayList<>();
        _merge(first, second, merged, 0, 0);
        return merged;
    }

    /**
     * Recursively merges two sorted lists into a single list.
     *
     * @param first  The first sorted list.
     * @param second The second sorted list.
     * @param merged The list where the merged result is stored.
     * @param s      The current index in the first list.
     * @param e      The current index in the second list.
     */
    private static void _merge(List<Integer> first, List<Integer> second, List<Integer> merged, int s, int e) {
        if (s == first.size() || e == second.size()) {
            while (s < first.size()) {
                merged.add(first.get(s));
                s++;
            }

            while (e < second.size()) {
                merged.add(second.get(e));
                e++;
            }
            return;
        }
        
        if (first.get(s) <= second.get(e)) {
            merged.add(first.get(s));
            _merge(first, second, merged, s + 1, e);
        } else {
            merged.add(second.get(e));
            _merge(first, second, merged, s, e + 1);
        }
    }
}