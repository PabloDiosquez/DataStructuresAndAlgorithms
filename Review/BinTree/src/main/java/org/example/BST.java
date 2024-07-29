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
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
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
        return node;
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

}
