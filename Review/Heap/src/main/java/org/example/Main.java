package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception{
        Heap<Integer> heap = new Heap<>();

        heap.insert(34);
        heap.insert(23);
        heap.insert(43);
        heap.insert(65);
        heap.insert(7);
        heap.insert(4);

        System.out.println("heap.heapSort() = " + heap.heapSort());
    }
}