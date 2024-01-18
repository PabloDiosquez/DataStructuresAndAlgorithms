package com.Heap;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap(){
        this.list = new ArrayList<>();
    }
    private void swap(int first, int second){
        T temp = this.list.get(first);
        this.list.set(first, this.list.get(second));
        this.list.set(second, temp);
    }
}
