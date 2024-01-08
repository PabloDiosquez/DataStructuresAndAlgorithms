package com.BinaryTrees;

import java.util.Scanner;

/**
 * Binary Tree class with methods to populate, display, and pretty display the tree.
 */
public class BT {

    /**
     * Main method to execute the binary tree operations.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BT tree = new BT();
        tree.populate(sc);
        // Uncomment the next line to display the tree in a simple format
        // tree.display();
        tree.prettyDisplay();
    }

    private Node root;

    /**
     * Default constructor to initialize the binary tree.
     */
    public BT() {
    }

    /**
     * Populates the binary tree with user input values.
     *
     * @param scanner Scanner object to read user input.
     */
    public void populate(Scanner scanner) {
        System.out.println("Enter the root node:");
        this.root = new Node(scanner.nextInt());
        populate(scanner, root);
    }

    /**
     * Recursively populates the binary tree based on user input.
     *
     * @param scanner Scanner object to read user input.
     * @param node    Current node to populate.
     */
    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value + "?");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.value + "?");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value + "?");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.value + "?");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    /**
     * Displays the binary tree in a simple format.
     */
    public void display() {
        display(this.root, "");
    }

    /**
     * Recursively displays the binary tree.
     *
     * @param node   Current node to display.
     * @param indent Current indentation for formatting.
     */
    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    /**
     * Pretty displays the binary tree with proper indentation.
     */
    public void prettyDisplay() {
        prettyDisplay(this.root, 0);
    }

    /**
     * Recursively pretty displays the binary tree with proper indentation.
     *
     * @param node  Current node to display.
     * @param level Current level of the tree.
     */
    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------> " + node.value);
        } else {
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level + 1);
    }

    /**
     * Node class representing a node in the binary tree.
     */
    private class Node {
        private int value;
        private Node left;
        private Node right;

        /**
         * Constructor to create a node with a given value.
         *
         * @param value Value of the node.
         */
        public Node(int value) {
            this.value = value;
        }

        /**
         * Constructor to create a node with a given value, left, and right child nodes.
         *
         * @param value Value of the node.
         * @param left  Left child node.
         * @param right Right child node.
         */
        public Node(int value, Node left, Node right) {
            this(value);
            this.left = left;
            this.right = right;
        }

        /**
         * Copy constructor to create a node based on another node.
         *
         * @param node Node to copy.
         */
        public Node(Node node) {
            this(node.value, node.left, node.right);
        }

        /**
         * String representation of the node.
         *
         * @return String representation of the node.
         */
        @Override
        public String toString() {
            return "Node value: %s".formatted(this.value);
        }
    }
}
