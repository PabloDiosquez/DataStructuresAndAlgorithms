package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //BinaryTree tree = new BinaryTree();
        //tree.populate(scanner);
        //tree.display();
        //tree.prettyDisplay();

        BST bst = new BST();
        bst.populate(new int[] {32, 12, 34, 5, 7, 2});
        bst.display();
    }
}