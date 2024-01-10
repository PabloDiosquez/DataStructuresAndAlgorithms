package com.BinaryTrees;

/**
 * Binary Search Tree (BST) implementation.
 */
public class BST {

    /**
     * Main method to test the Binary Search Tree.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a new Binary Search Tree
        BST tree = new BST();

        // Insert values into the tree
        tree.insert(15);
        tree.insert(10);
        tree.insert(20);
        tree.insert(5);
        tree.insert(12);
        tree.insert(8);

        // Display whether the tree is balanced
        System.out.println("Is the tree balanced? " + tree.balanced());

        // Traverse and print nodes in post-order
        tree.postOrder();
    }

    private Node root; // Root node of the Binary Search Tree

    /**
     * Constructor for the Binary Search Tree.
     */
    public BST() {
    }

    /**
     * Get the height of a given node.
     *
     * @param node The node whose height is to be determined.
     * @return The height of the node.
     */
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    /**
     * Check if the Binary Search Tree is empty.
     *
     * @return True if the tree is empty, false otherwise.
     */
    public boolean isEmpty() {
        return this.root == null;
    }

    /**
     * Insert a value into the Binary Search Tree.
     *
     * @param value The value to be inserted.
     */
    public void insert(int value) {
        this.root = insert(value, this.root);
    }

    /**
     * Helper method to insert a value into the Binary Search Tree recursively.
     *
     * @param value The value to be inserted.
     * @param node  The current node being considered.
     * @return The updated node after insertion.
     */
    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }

        if (node.getValue() > value) {
            node.left = insert(value, node.left);
        }

        if (node.getValue() < value) {
            node.right = insert(value, node.right);
        }

        // Update the height of the current node
        node.height = 1 + Math.max(height(node.left), height(node.right));
        return node;
    }

    /**
     * Populate the Binary Search Tree with sorted values.
     *
     * @param nums Array of sorted integers to populate the tree.
     */
    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }

    /**
     * Helper method to populate the Binary Search Tree with sorted values recursively.
     *
     * @param nums  Array of sorted integers to populate the tree.
     * @param start Starting index of the subarray.
     * @param end   Ending index of the subarray.
     */
    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int middle = (start + end) / 2;

        // Insert the middle element into the tree
        this.insert(nums[middle]);
        populatedSorted(nums, start, middle);
        populatedSorted(nums, middle + 1, end);
    }

    /**
     * Check if the Binary Search Tree is balanced.
     *
     * @return True if the tree is balanced, false otherwise.
     */
    public boolean balanced() {
        return balanced(this.root);
    }

    /**
     * Helper method to check if a subtree is balanced.
     *
     * @param node The root of the subtree.
     * @return True if the subtree is balanced, false otherwise.
     */
    public boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1
                && balanced(node.left) && balanced(node.right);
    }

    /**
     * Traverse and print nodes in pre-order.
     */
    public void preOrder() {
        preOrder(this.root);
    }

    /**
     * Helper method to traverse and print nodes in pre-order recursively.
     *
     * @param node The current node being considered.
     */
    private void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.value + " - ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    /**
     * Traverse and print nodes in in-order.
     */
    public void inOrder() {
        inOrder(this.root);
    }

    /**
     * Helper method to traverse and print nodes in in-order recursively.
     *
     * @param node The current node being considered.
     */
    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.value + " - ");
            inOrder(node.right);
        }
    }

    /**
     * Traverse and print nodes in post-order.
     */
    public void postOrder() {
        postOrder(this.root);
    }

    /**
     * Helper method to traverse and print nodes in post-order recursively.
     *
     * @param node The current node being considered.
     */
    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value + " - ");
        }
    }

    /**
     * Display the Binary Search Tree.
     */
    public void display() {
        display(this.root, "Root node: ");
    }

    /**
     * Helper method to display the Binary Search Tree recursively.
     *
     * @param node    The current node being considered.
     * @param details Details to be displayed for the current node.
     */
    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.getValue());

        display(node.left, "Left child of " + node.getValue() + ": ");
        display(node.right, "Right child of " + node.getValue() + ": ");
    }

    /**
     * Node class representing a node in the Binary Search Tree.
     */
    private class Node {
        private int value; // Value stored in the node
        private Node left; // Left child node
        private Node right; // Right child node
        private int height; // Height of the node

        /**
         * Constructor for creating a node with a given value.
         *
         * @param value The value to be stored in the node.
         */
        public Node(int value) {
            this.value = value;
            this.height = 0;
        }

        /**
         * Constructor for creating a node with a given value and child nodes.
         *
         * @param value The value to be stored in the node.
         * @param left  The left child node.
         * @param right The right child node.
         */
        public Node(int value, Node left, Node right) {
            this(value);
            this.left = left;
            this.right = right;
        }

        /**
         * Copy constructor for creating a node with the same value and child nodes as another node.
         *
         * @param node The node to be copied.
         */
        public Node(Node node) {
            this(node.value, node.left, node.right);
        }

        /**
         * Get the value stored in the node.
         *
         * @return The value of the node.
         */
        public int getValue() {
            return this.value;
        }

        /**
         * String representation of the node.
         *
         * @return A formatted string containing the value and height of the node.
         */
        @Override
        public String toString() {
            return "[Node value: %s, Height: %s]".formatted(this.value, this.height);
        }
    }
}