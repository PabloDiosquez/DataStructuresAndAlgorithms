package com.Queue;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if(this.isFull()){
            int[] temp = new int[this.data.length * 2];
            for (int i = 0; i < this.data.length; i++) {
                temp[i] = this.data[(this.front + i) % this.data.length];
            }
            this.front = 0;
            this.end   = this.data.length;
            this.data  = temp;
        }
        return super.insert(item);
    }
}
