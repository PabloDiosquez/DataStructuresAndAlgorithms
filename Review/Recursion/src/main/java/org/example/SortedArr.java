package org.example;

public class SortedArr {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 5, 7, 9, 4};
        System.out.println(sorted(arr));
    }

    static boolean sorted(int[] arr){
        return sortedHelper(arr, 0);
    }

    private static boolean sortedHelper(int[] arr, int s) {
        if(s == arr.length-1){
            return true;
        }
        return arr[s] <= arr[s+1] && sortedHelper(arr, s+1);
    }

}
