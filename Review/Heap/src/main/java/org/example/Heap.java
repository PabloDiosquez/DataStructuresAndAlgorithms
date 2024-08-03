package org.example;

import java.util.ArrayList;
import java.util.List;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap() {
        this.list = new ArrayList<>();
    }

    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
}
