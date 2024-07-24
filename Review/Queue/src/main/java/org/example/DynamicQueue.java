package org.example;

/**
 * The DynamicQueue class represents a dynamic circular queue data structure that can resize itself
 * when it becomes full. It extends the CircularQueue class and overrides the insert method.
 */
public class DynamicQueue extends CircularQueue {

    /**
     * Constructs a DynamicQueue with the specified size.
     *
     * @param size the initial size of the queue
     */
    public DynamicQueue(int size) {
        super(size);
    }

    /**
     * Constructs a DynamicQueue with the default size.
     */
    public DynamicQueue() {
        this(DEFAULT_SIZE);
    }

    /**
     * Inserts an item at the end of the queue. If the queue is full, it resizes the queue to double
     * its current size before inserting the item.
     *
     * @param item the item to be inserted
     */
    @Override
    public void insert(int item) {
        if (isFull()) {
            int[] temp = new int[2 * data.length];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        super.insert(item);
    }
}

