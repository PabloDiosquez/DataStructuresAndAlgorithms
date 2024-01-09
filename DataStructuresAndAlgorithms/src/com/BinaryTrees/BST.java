package com.BinaryTrees;

public class BST {
    public static void main(String[] args) {

    }

    private Node root;

    public BST(){

    }

    public int height(Node node){
        return node == null ? -1 : node.height;
    }

    public boolean isEmpty(){
        return this.root == null;
    }

    private class Node{
        private int value;

        private Node left;

        private Node right;

        private int height;

        public Node(int value){
            this.value = value;
            this.height = 0;
        }

        public Node(int value, Node left, Node right){
            this(value);
            this.left  = left;
            this.right = right;
        }

        public Node(Node node){
            this(node.value, node.left, node.right);
        }

        @Override
        public String toString() {
            return "[Node value: %s, Height: %s]".formatted(this.value, this.height);
        }
    }
}
