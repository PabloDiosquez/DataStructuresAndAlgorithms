package com.BinaryTrees;

public class BST {
    public static void main(String[] args) {
        BST tree = new BST();
        //tree.insert(15);
        //tree.insert(10);
        //tree.insert(20);
        //tree.insert(5);
        //tree.insert(12);
        //tree.insert(8);

        //tree.display();
        //System.out.println(tree.balanced());

        int[] nums = new int[] {1, 2, 4, 5, 7, 8, 9, 12, 14};
        tree.populatedSorted(nums);
        tree.display();
    }
    private Node root;
    public BST(){
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return this.root == null;
    }

    public void insert(int value){
        this.root = insert(value, this.root);
    }

    private Node insert(int value, Node node){
        if(node == null){
            return new Node(value);
        }

        if(node.getValue() > value){
            node.left = insert(value, node.left);
        }

        if(node.getValue() < value){
            node.right = insert(value, node.right);
        }
        node.height = 1 + Math.max(height(node.left), height(node.right));
        return node;
    }

    public void populatedSorted(int[] nums){
        populatedSorted(nums, 0, nums.length);
    }
    private void populatedSorted(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int middle = (start + end) / 2;

        this.insert(nums[middle]);
        populatedSorted(nums, start, middle);
        populatedSorted(nums, middle+1, end);
    }

    public boolean balanced(){
        return balanced(this.root);
    }

    public boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1
                && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(this.root, "Root node: ");
    }

    private void display(Node node, String details) {
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());

        display(node.left, "Left child of " + node.getValue() + ": ");
        display(node.right, "Right child of " + node.getValue() + ": ");
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

        public int getValue(){
            return this.value;
        }

        @Override
        public String toString() {
            return "[Node value: %s, Height: %s]".formatted(this.value, this.height);
        }
    }
}
