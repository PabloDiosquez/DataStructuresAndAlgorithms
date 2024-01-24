package com.OOP.Intro;

/**
 * The WrapperExample class demonstrates swapping values between two objects of different classes.
 */
public class ValueSwapper {

    public static void main(String[] args) {
        final A obj1 = new A(10);
        final B obj2 = new B(12);

        // obj1 = new A(16); // Error!! Final variable cannot be reassigned.

        System.out.println("Before:");
        System.out.println("Object 1 - Value: " + obj1.value);
        System.out.println("Object 2 - Value: " + obj2.value);

        // Swap values between obj1 and obj2
        swap(obj1, obj2);

        System.out.println("After:");
        System.out.println("Object 1 - Value: " + obj1.value);
        System.out.println("Object 2 - Value: " + obj2.value);
    }

    /**
     * Swaps the values of two objects of different classes.
     *
     * @param object1 An object of class A.
     * @param object2 An object of class B.
     */
    static void swap(A object1, B object2){
        int temp = object1.value;
        object1.value = object2.value;
        object2.value = temp;
    }
}

/**
 * The A class represents an object with an integer value.
 */
class A {
    int value;

    /**
     * Default constructor sets the value to -1.
     */
    public A() {
        this(-1);
    }

    /**
     * Parameterized constructor initializes the value with the specified parameter.
     *
     * @param value The integer value for the object.
     */
    public A(int value){
        this.value = value;
    }
}

/**
 * The B class represents another object with an integer value.
 */
class B {
    int value;

    /**
     * Default constructor sets the value to -1.
     */
    public B(){
        this(-1);
    }

    /**
     * Parameterized constructor initializes the value with the specified parameter.
     *
     * @param value The integer value for the object.
     */
    public B(int value){
        this.value = value;
    }
}
