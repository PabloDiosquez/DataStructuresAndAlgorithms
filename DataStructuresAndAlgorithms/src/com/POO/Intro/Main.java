package com.POO.Intro;

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
        student1.name  = "Rahul";
        student1.marks = 7.1;

        System.out.println("\n"+student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);
        student1.greeting();

        Student student2 = new Student(11, "Kunal", 9.5);

        System.out.println("\n"+student2.rno);
        System.out.println(student2.name);
        System.out.println(student2.marks);
        student2.greeting();

        student2.changeName("Civo");
        student2.greeting();

        Student student3 = new Student(student1);
        student3.greeting();

    }

}

/**
 * The Student class represents a student with attributes such as roll number, name, and marks.
 */
class Student {
    /**
     * The roll number of the student.
     */
    int rno;

    /**
     * The name of the student.
     */
    String name;

    /**
     * The marks obtained by the student.
     */
    double marks;

    Student(){
        this.rno = -1;
    }
    Student(int rno, String name, double marks){
        this.rno   = rno;
        this.name  = name;
        this.marks = marks;
    }

    Student(Student student){
        this(student.rno, student.name, student.marks);
    }

    void greeting(){
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name){
        this.name = name;
    }
}
