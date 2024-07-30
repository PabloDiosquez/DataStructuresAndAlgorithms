package org.example;

public class BST {
    private class Node{
        private final int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "{" + value +
                    '}';
        }
    }

    private Node root;

    public int height(){
        return height(root);
    }

    private int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if(node == null){
            return new Node(value);
        }
        if(value < node.getValue()){
            node.left = insert(value, node.left);
        } else if(value > node.getValue()){
            node.right = insert(value, node.right);
        }
        node.height = 1 + Math.max(height(node.left), height(node.right));
        return node;
    }

    public void populate(int[] values){
        for (int value : values) {
            this.insert(value);
        }
    }

    public void populatedSorted(int[] sortedArr){
        populatedSorted(sortedArr, 0, sortedArr.length);
    }

    // O(N log(N))
    private void populatedSorted(int[] sortedArr, int start, int end) {
        if(start >= end){
            return;
        }
        int middle = start + (end - start) / 2;
        this.insert(sortedArr[middle]);
        populatedSorted(sortedArr, start, middle);
        populatedSorted(sortedArr, middle+1, end);
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1
                && isBalanced(node.left) && isBalanced(node.right);
    }

    public void display(){
        display(root, "Root node: ");
    }

    private void display(Node node, String details) {
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + ": ");
        display(node.right, "Right child of " + node.getValue() + ": ");
    }

    public void preOrder(){
        preOrder(root);
    }

    public void inOrder(){
        inOrder(root);
    }

    public void postOrder(){
        postOrder(root);
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.getValue() + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        preOrder(node.left);
        System.out.println(node.getValue() + " ");
        preOrder(node.right);
    }

    private void postOrder(Node node){
        if(node == null){
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.getValue() + " ");
    }

}
