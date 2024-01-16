package com.Stack;

import java.util.*;
import java.util.Stack;

import java.util.*;

/**
 * This class demonstrates the usage of Java built-in data structures: Stack, Queue, and Deque.
 */
public class InBuiltExamples {

    /**
     * The main method demonstrates the usage of Stack, Queue, and Deque with various operations.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Using Stack for LIFO (Last-In-First-Out) behavior
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(32);
        stack.push(9);
        stack.push(3);
        stack.push(91);
        stack.push(54);

        System.out.println("Stack:");
        // Pop elements from the stack and print them
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // Using Queue for FIFO (First-In-First-Out) behavior
        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);
        queue.add(12);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        System.out.println("\nQueue:");
        // Peek at the front element of the queue without removing it
        System.out.println(queue.peek());
        // Remove and print elements from the front of the queue
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        // Using Deque for double-ended queue operations
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(99);
        // Add an element to the front of the deque
        deque.addFirst(123);
        // Add an element to the end of the deque
        deque.addLast(123);
        // Remove the first element from the deque
        deque.removeFirst();
    }
}
