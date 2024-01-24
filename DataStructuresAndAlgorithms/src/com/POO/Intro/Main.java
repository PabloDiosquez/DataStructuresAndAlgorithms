package com.POO.Intro;

import java.util.Arrays;

/**
 * The Main class represents the main entry point of the program.
 */
public class Main {

    /**
     * The main method is the starting point of the program execution.
     *
     * @param args Command-line arguments passed to the program.
     */
    public static void main(String[] args) {

        // Array to store integers representing roll numbers of students
        int[] numbers = new int[5];

        // Array to store strings representing names of students
        String[] names = new String[5];

        // Array to store doubles representing marks of students
        double[] marks = new double[5];

        // Array to store information about 5 students {roll number, name, marks}
        Student[] students = new Student[5];

        // Compile time  -- Runtime
        Student student1 =  new Student();

        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        student1.rno   = 10;
        student1.name  = "Harry Potter";
        student1.marks = 7.1;

        System.out.println("\n"+student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);
    }

}

/**
 * The Student class represents a student with attributes such as roll number, name, and marks.
 */
class Student {
    /**
     * The roll number of the student.
     */
    int rno = 1;

    /**
     * The name of the student.
     */
    String name;

    /**
     * The marks obtained by the student.
     */
    double marks;
}
