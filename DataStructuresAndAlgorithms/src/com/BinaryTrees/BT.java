package com.BinaryTrees;

import java.util.Scanner;

public class BT {
    public static void main(String[] args) {

    }

    private Node root;

    public BT(){

    }

    public void populate(Scanner scanner){
        System.out.println("Enter the root node:");
        this.root = new Node(scanner.nextInt());
    }
    private class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node left, Node right){
            this(value);
            this.left = left;
            this.right = right;
        }

        public Node(Node node){
            this(node.value, node.left, node.right);
        }

        @Override
        public String toString() {
            return "Node value: %s".formatted(this.value);
        }
    }
}
