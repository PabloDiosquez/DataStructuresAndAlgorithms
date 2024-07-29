package org.example;

import java.util.Scanner;

/**
 * This class represents a simple Binary Tree with functionality to populate
 * and display the tree structure.
 */
public class BinaryTree {

    /**
     * This class represents a node in the binary tree.
     */
    private static class Node {
        private final int value;
        private Node left;
        private Node right;

        /**
         * Constructs a Node with a given value.
         *
         * @param value the value of the node
         */
        public Node(int value) {
            this.value = value;
        }

        /**
         * Constructs a Node by copying an existing node.
         *
         * @param old the node to copy
         */
        public Node(Node old) {
            this(old.value);
        }

        @Override
        public String toString() {
            return String.format("%s", value);
        }
    }

    private Node root;

    /**
     * Constructs an empty BinaryTree.
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * Populates the tree using a Scanner object for input.
     *
     * @param scanner the Scanner object to read input from
     */
    public void populate(Scanner scanner) {
        System.out.println("Enter the root node: ");
        root = new Node(scanner.nextInt());
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value + "?");
        if (scanner.nextBoolean()) {
            System.out.println("Enter the value: ");
            node.left = new Node(scanner.nextInt());
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value + "?");
        if (scanner.nextBoolean()) {
            System.out.println("Enter the value: ");
            node.right = new Node(scanner.nextInt());
            populate(scanner, node.right);
        }
    }

    /**
     * Displays the tree in a simple format.
     */
    public void display() {
        display(root, " ");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    /**
     * Displays the tree in a pretty format.
     */
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|-------> " + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }
}
