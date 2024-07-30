package org.example;

public class AVL extends BST{

    @Override
    protected Node insert(int value, Node node) {
        return rotate(super.insert(value, node));
    }

    private Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1){
            // left heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                // left - left case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                // left - right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.left) - height(node.right) < -1){
            // right heavy
            if(height(node.right.left) - height(node.right.right) < 0){
                // right - right case
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0){
                // right - left case
                node.right = rightRotate(node.left);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node leftRotate(Node left) {
        return null;
    }

    private Node rightRotate(Node node) {
        return null;
    }
}
