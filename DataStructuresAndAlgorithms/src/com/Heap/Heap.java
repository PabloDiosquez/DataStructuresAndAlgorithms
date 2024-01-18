package com.Heap;

import java.util.ArrayList;

/**
 * A generic heap implementation using an ArrayList.
 *
 * @param <T> the type of elements stored in the heap, must extend Comparable
 */
public class Heap<T extends Comparable<T>> {

    /**
     * The internal ArrayList to store elements in the heap.
     */
    private ArrayList<T> list;

    /**
     * Constructs an empty heap.
     */
    public Heap() {
        this.list = new ArrayList<>();
    }

    /**
     * Swaps two elements in the internal ArrayList.
     *
     * @param first  the index of the first element
     * @param second the index of the second element
     */
    private void swap(int first, int second) {
        T temp = this.list.get(first);
        this.list.set(first, this.list.get(second));
        this.list.set(second, temp);
    }

    /**
     * Returns the index of the parent node for the given index.
     *
     * @param index the index of the node
     * @return the index of the parent node
     */
    public int parent(int index) {
        return (index - 1) / 2;
    }

    /**
     * Returns the index of the left child node for the given index.
     *
     * @param index the index of the node
     * @return the index of the left child node
     */
    public int left(int index) {
        return 2 * index + 1;
    }

    /**
     * Returns the index of the right child node for the given index.
     *
     * @param index the index of the node
     * @return the index of the right child node
     */
    public int right(int index) {
        return 2 * index + 2;
    }

    /**
     * Inserts a value into the heap and maintains the heap property.
     *
     * @param value the value to be inserted
     */
    public void insert(T value) {
        this.list.add(value);
        upheap(this.list.size() - 1);
    }

    /**
     * Helper method to move the element up the heap to maintain the heap property.
     *
     * @param index the index of the element to be moved up
     */
    private void upheap(int index) {
        if (index == 0) {
            return;
        }
        int p = this.parent(index);
        if (this.list.get(index).compareTo(this.list.get(p)) < 0) {
            swap(index, p);
            upheap(p);
        }
    }

    /**
     * Removes and returns the root element of the heap.
     *
     * @return the root element of the heap
     * @throws Exception if removing from an empty heap
     */
    public T remove() throws Exception {
        if (this.list.isEmpty()) {
            throw new Exception("Removing from an empty heap!");
        }

        T removed = this.list.get(0);

        T last = this.list.get(this.list.size() - 1);
        if (!this.list.isEmpty()) {
            this.list.set(0, last);
            this.downheap(0);
        }
        return removed;
    }

    /**
     * Helper method to move the element down the heap to maintain the heap property.
     *
     * @param index the index of the element to be moved down
     */
    private void downheap(int index) {
        int min = index;
        int left = this.left(index);
        int right = this.right(index);

        if (left < this.list.size() &&
                this.list.get(min).compareTo(this.list.get(left)) > 0) {
            min = left;
        }

        if (right < this.list.size() &&
                this.list.get(min).compareTo(this.list.get(right)) > 0) {
            min = right;
        }

        if (min != index) {
            swap(min, index);
            downheap(min);
        }
    }
}
