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

    public T remove() throws Exception{
        if(this.list.isEmpty()){
            throw new Exception("Removing from an empty heap!");
        }

        T removed = this.list.get(0);

        T last = this.list.get(this.list.size()-1);
        if(!this.list.isEmpty()){
            this.list.set(0, last);
            this.downheap(0);
        }
        return removed;
    }

    private void downheap(int index) {
        int min = index;
        int left = this.left(index);
        int right = this.right(index);

        if(left < this.list.size() &&
                this.list.get(min).compareTo(this.list.get(left)) > 0){
            min = left;
        }

        if(right < this.list.size() &&
                this.list.get(min).compareTo(this.list.get(right)) > 0){
            min = right;
        }

        if(min != index){
            swap(min, index);
            downheap(min);
        }
    }
}
