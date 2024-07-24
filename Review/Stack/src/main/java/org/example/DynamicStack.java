package org.example;

import java.util.Arrays;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }

    @Override
    public boolean push(int item) {
        if(isFull()){
            int[] temp = new int[2*data.length];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        return super.push(item);
    }
}
