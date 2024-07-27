package org.example;

import java.util.Scanner;

public class BinaryTree {
    private static class Node{
        private int value;
        private Node left;
        private Node right;
        public Node(int data) {
            this.value = data;
        }
        public Node(Node old) {
            this(old.value);
        }
    }

    private Node root;

    public BinaryTree() {
    }

    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
        Node root = new Node(scanner.nextInt());
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();

        if(left){
            System.out.println("Enter the value: ");
            node.left = new Node(scanner.nextInt());
            populate(scanner, node.left);
        }
    }
}
