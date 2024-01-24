package com.OOP.Intro;

public class WrapperExample {
    public static void main(String[] args) {
        final A obj1 = new A(10);
        final B obj2 = new B(12);

        // obj1 = new A(16); Error!!

        System.out.println("Before:");
        System.out.println("Object 1 - Value: " + obj1.value);
        System.out.println("Object 2 - Value: " + obj2.value);

        swap(obj1, obj2);

        System.out.println("After:");
        System.out.println("Object 1 - Value: " + obj1.value);
        System.out.println("Object 2 - Value: " + obj2.value);
    }

    static void swap(A object1, B object2){
        int temp = object1.value;
        object1.value = object2.value;
        object2.value = temp;
    }


}

class A{
    int value;
    public A() {
        this(-1);
    }

    public A(int value){
        this.value = value;
    }
}

class B{
    int value;

    public B(){
        this(-1);
    }
    public B(int value){
        this.value = value;
    }
}
