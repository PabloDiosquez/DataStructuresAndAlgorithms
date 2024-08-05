package org.example;
public class Main {
    public static void main(String[] args) {
        try {
            // Create a new heap
            Heap<Integer> heap = new Heap<>();

            // Insert values into the heap
            heap.insert(34);
            heap.insert(23);
            heap.insert(43);
            heap.insert(65);
            heap.insert(7);
            heap.insert(4);

            // Perform heap sort and print the sorted list
            System.out.println("Sorted elements: " + heap.heapSort());
        } catch (Exception e) {
            // Print the exception message if an error occurs
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
