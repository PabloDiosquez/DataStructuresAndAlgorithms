package org.example;

import java.util.Scanner;

public class BinaryTree {
    private static class Node{
        private final int value;
        private Node left;
        private Node right;
        public Node(int value) {
            this.value = value;
        }
        public Node(Node old) {
            this(old.value);
        }

        @Override
        public String toString() {
            return String.format("%s", value);
        }
    }

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
        root = new Node(scanner.nextInt());
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        if(scanner.nextBoolean()){
            System.out.println("Enter the value: ");
            node.left = new Node(scanner.nextInt());
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value);
        if(scanner.nextBoolean()){
            System.out.println("Enter the value: ");
            node.right = new Node(scanner.nextInt());
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root, " ");
    }

    private void display(Node node, String indent) {
        if(node == null){
            return;
        }
        System.out.println(indent + node);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if(node == null){
            return;
        }
        prettyDisplay(node.right, level+1);
        if(level != 0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|-------> " + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level+1);
    }
}
