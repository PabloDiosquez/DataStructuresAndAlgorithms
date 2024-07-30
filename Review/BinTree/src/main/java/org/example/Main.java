package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of BST
        BST bst = new BST();

        // Populate the BST with a predefined set of values
        int[] values = {32, 12, 34, 5, 7, 2};
        bst.populate(values);

        // Display the BST
        //System.out.println("Binary Search Tree (BST) in order:");
        //bst.display();

        AVL avl = new AVL();

        for (int i = 0; i < 1000; i++) {
            avl.insert(i);
        }
        System.out.println("height = " + avl.height());

        // Close the scanner
        scanner.close();
    }
}