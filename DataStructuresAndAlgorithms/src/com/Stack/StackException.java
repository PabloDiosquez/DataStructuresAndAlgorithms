package com.Stack;

/**
 * StackException is a custom exception class used to indicate exceptional conditions specific to a stack.
 * It extends the standard Exception class.
 */
public class StackException extends Exception {

    /**
     * Constructs a new StackException with the specified detail message.
     *
     * @param message The detail message, which is saved for later retrieval by the getMessage() method.
     */
    public StackException(String message) {
        super(message);
    }
}
