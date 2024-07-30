package org.example;

/**
 * The AVL class extends the BST class to implement an AVL Tree.
 * An AVL Tree is a self-balancing Binary Search Tree where the difference
 * in heights between the left and right subtrees of any node is at most one.
 */
public class AVL extends BST {

    /**
     * Inserts a value into the AVL tree and balances the tree if necessary.
     *
     * @param value The value to be inserted.
     * @param node  The root node of the subtree where the value is to be inserted.
     * @return The new root of the subtree after insertion and balancing.
     */
    @Override
    protected Node insert(int value, Node node) {
        node = super.insert(value, node);
        return balance(node);
    }

    /**
     * Balances the given node if it is unbalanced.
     *
     * @param node The node to be checked and balanced.
     * @return The new root of the subtree after balancing.
     */
    private Node balance(Node node) {
        if (node == null) {
            return null;
        }

        if (height(node.left) - height(node.right) > 1) {
            // Left heavy
            if (height(node.left.left) >= height(node.left.right)) {
                // Left-Left case
                node = rightRotate(node);
            } else {
                // Left-Right case
                node.left = leftRotate(node.left);
                node = rightRotate(node);
            }
        } else if (height(node.right) - height(node.left) > 1) {
            // Right heavy
            if (height(node.right.right) >= height(node.right.left)) {
                // Right-Right case
                node = leftRotate(node);
            } else {
                // Right-Left case
                node.right = rightRotate(node.right);
                node = leftRotate(node);
            }
        }

        // Update the height of the current node
        node.height = 1 + Math.max(height(node.left), height(node.right));
        return node;
    }

    /**
     * Performs a left rotation on the given node.
     *
     * @param c The node to be rotated.
     * @return The new root of the subtree after rotation.
     */
    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        // Update heights
        c.height = 1 + Math.max(height(c.left), height(c.right));
        p.height = 1 + Math.max(height(p.left), height(p.right));

        return p;
    }

    /**
     * Performs a right rotation on the given node.
     *
     * @param p The node to be rotated.
     * @return The new root of the subtree after rotation.
     */
    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        // Update heights
        p.height = 1 + Math.max(height(p.left), height(p.right));
        c.height = 1 + Math.max(height(c.left), height(c.right));

        return c;
    }
}
