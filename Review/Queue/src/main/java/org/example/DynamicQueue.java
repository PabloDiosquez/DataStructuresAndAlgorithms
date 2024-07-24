package org.example;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(int size) {
        super(size);
    }

    public DynamicQueue() {
        this(DEFAULT_SIZE);
    }

    @Override
    public void insert(int item) {
        if(isFull()){
            int[] temp = new int[2* data.length];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front+i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        super.insert(item);
    }
}
