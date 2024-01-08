package com.BinaryTrees;

import java.util.Scanner;

public class BT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BT tree = new BT();
        tree.populate(sc);
        tree.display();
    }

    private Node root;

    public BT(){
    }

    public void populate(Scanner scanner){
        System.out.println("Enter the root node:");
        this.root = new Node(scanner.nextInt());
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value + "?");
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of " + node.value + "?");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value + "?");
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of " + node.value + "?");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(this.root, "");
    }
    private void display(Node node, String indent) {
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent);
        display(node.right, indent + "\t");
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
