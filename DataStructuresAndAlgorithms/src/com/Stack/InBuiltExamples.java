package com.Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(32);
        stack.push(9);
        stack.push(3);
        stack.push(91);
        stack.push(54);

        System.out.println("Stack:");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);
        queue.add(12);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        System.out.println("\nQueue:");
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());


    }
}
