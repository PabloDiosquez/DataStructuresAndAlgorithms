package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * A generic heap implementation.
 *
 * @param <T> the type of elements in this heap, must extend Comparable
 */
public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    /**
     * Constructs an empty heap.
     */
    public Heap() {
        this.list = new ArrayList<>();
    }

    /**
     * Inserts a value into the heap.
     *
     * @param value the value to be inserted
     */
    public void insert(T value) {
        list.add(value);
        upHeap(list.size() - 1);
    }

    /**
     * Removes and returns the smallest value from the heap.
     *
     * @return the smallest value in the heap
     * @throws Exception if the heap is empty
     */
    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Removing from an empty list!");
        }

        T removed = list.get(0);
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }

        return removed;
    }

    /**
     * Performs heap sort and returns a sorted list of the heap's elements.
     *
     * @return a sorted list of the heap's elements
     * @throws Exception if the heap is empty
     */
    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }

    private void downHeap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }

        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if (min != index) {
            swap(index, min);
            downHeap(min);
        }
    }

    private void upHeap(int index) {
        if (index == 0) {
            return;
        }
        int p = parent(index);
        if (list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            upHeap(p);
        }
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return 2 * index + 1;
    }

    private int right(int index) {
        return 2 * index + 2;
    }
}
