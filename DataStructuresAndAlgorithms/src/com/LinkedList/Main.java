package com.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();

        list.insert(12);
        list.insert(14);
        list.insert(-1);
        list.insert(10);
        list.insert(8);

        try {
            list.insertAt(5, 23);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        list.show();

        list.delete(2);

        System.out.println();
        list.show();
    }
}
