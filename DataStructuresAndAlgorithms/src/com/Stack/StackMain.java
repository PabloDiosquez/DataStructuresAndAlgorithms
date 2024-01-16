package com.Stack;

/**
 * StackMain is a class containing the main method to demonstrate the usage of the CustomStack class.
 */
public class StackMain {

    /**
     * The main method demonstrates the basic functionality of the CustomStack class.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create a custom stack with a specific size
        CustomStack customStack = new CustomStack(5);

        // Push elements onto the stack
        customStack.push(10);
        customStack.push(20);
        customStack.push(30);

        System.out.println("Stack after pushing elements:");
        printStackContents(customStack);

        try {
            // Pop an element from the stack
            int poppedElement = customStack.pop();
            System.out.println("\nPopped element: " + poppedElement);

            // Peek at the top element without removing it
            int peekedElement = customStack.peek();
            System.out.println("Peeked element: " + peekedElement);

            System.out.println("\nStack after pop and peek operations:");
            printStackContents(customStack);

        } catch (StackException e) {
            // Handle exceptions related to stack operations
            System.err.println("Error: " + e.getMessage());
        }
    }

    /**
     * Helper method to print the contents of the CustomStack.
     *
     * @param stack The CustomStack to be printed.
     */
    private static void printStackContents(CustomStack stack) {
        try {
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
        } catch (StackException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
