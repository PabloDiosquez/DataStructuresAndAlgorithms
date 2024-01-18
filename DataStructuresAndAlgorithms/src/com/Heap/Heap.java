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

    public int parent(int index){
        return (index-1) / 2;
    }

    public int left(int index){
        return 2 * index + 1;
    }

    public int right(int index){
        return 2 * index + 2;
    }

    public void insert(T value){
        this.list.add(value);
        unheap(this.list.size()-1);
    }

    private void unheap(int index) {
        if(index == 0){
            return;
        }
        int p = this.parent(index);
        if(this.list.get(index).compareTo(this.list.get(p)) < 0){
            swap(index, p);
            unheap(p);
        }
    }
}
