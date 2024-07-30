package org.example;

/**
 * A class representing a Binary Search Tree (BST).
 */
public class BST {
    /**
     * A nested class representing a node in the BST.
     */
    protected class Node {
        protected final int value;
        protected Node left;
        protected Node right;
        protected int height;

        /**
         * Constructs a new Node with the given value.
         *
         * @param value the value of the node
         */
        public Node(int value) {
            this.value = value;
        }

        /**
         * Returns the value of the node.
         *
         * @return the value of the node
         */
        public int getValue() {
            return value;
        }

        /**
         * Returns a string representation of the node.
         *
         * @return a string representation of the node
         */
        @Override
        public String toString() {
            return "{" + value + '}';
        }
    }

    protected Node root;

    /**
     * Returns the height of the BST.
     *
     * @return the height of the BST
     */
    public int height() {
        return height(root);
    }

    /**
     * Returns the height of a given node.
     *
     * @param node the node whose height is to be calculated
     * @return the height of the given node, or -1 if the node is null
     */
    protected int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    /**
     * Checks if the BST is empty.
     *
     * @return true if the BST is empty, false otherwise
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Inserts a value into the BST.
     *
     * @param value the value to be inserted
     */
    public void insert(int value) {
        root = insert(value, root);
    }

    /**
     * Recursively inserts a value into the BST.
     *
     * @param value the value to be inserted
     * @param node  the current node
     * @return the updated node
     */
    protected Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.getValue()) {
            node.left = insert(value, node.left);
        } else if (value > node.getValue()) {
            node.right = insert(value, node.right);
        }
        node.height = 1 + Math.max(height(node.left), height(node.right));
        return node;
    }

    /**
     * Populates the BST with an array of values.
     *
     * @param values the array of values to be inserted into the BST
     */
    public void populate(int[] values) {
        for (int value : values) {
            this.insert(value);
        }
    }

    /**
     * Populates the BST with a sorted array of values.
     *
     * @param sortedArr the sorted array of values to be inserted into the BST
     */
    public void populatedSorted(int[] sortedArr) {
        populatedSorted(sortedArr, 0, sortedArr.length);
    }

    /**
     * Recursively populates the BST with a sorted array of values.
     *
     * @param sortedArr the sorted array of values to be inserted into the BST
     * @param start     the starting index of the subarray
     * @param end       the ending index of the subarray
     */
    private void populatedSorted(int[] sortedArr, int start, int end) {
        if (start >= end) {
            return;
        }
        int middle = start + (end - start) / 2;
        this.insert(sortedArr[middle]);
        populatedSorted(sortedArr, start, middle);
        populatedSorted(sortedArr, middle + 1, end);
    }

    /**
     * Checks if the BST is balanced.
     *
     * @return true if the BST is balanced, false otherwise
     */
    public boolean isBalanced() {
        return isBalanced(root);
    }

    /**
     * Recursively checks if a given node is balanced.
     *
     * @param node the node to be checked
     * @return true if the node is balanced, false otherwise
     */
    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1
                && isBalanced(node.left) && isBalanced(node.right);
    }

    /**
     * Displays the BST.
     */
    public void display() {
        display(root, "Root node: ");
    }

    /**
     * Recursively displays the BST.
     *
     * @param node    the current node
     * @param details the details to be displayed
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
     * Performs a pre-order traversal of the BST.
     */
    public void preOrder() {
        preOrder(root);
    }

    /**
     * Performs an in-order traversal of the BST.
     */
    public void inOrder() {
        inOrder(root);
    }

    /**
     * Performs a post-order traversal of the BST.
     */
    public void postOrder() {
        postOrder(root);
    }

    /**
     * Recursively performs a pre-order traversal of the BST.
     *
     * @param node the current node
     */
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getValue() + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * Recursively performs an in-order traversal of the BST.
     *
     * @param node the current node
     */
    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.getValue() + " ");
        inOrder(node.right);
    }

    /**
     * Recursively performs a post-order traversal of the BST.
     *
     * @param node the current node
     */
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.getValue() + " ");
    }
}
