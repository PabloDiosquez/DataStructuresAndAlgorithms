package com.OOP.Intro;

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

        // Compile time instantiation of a Student object
        Student student1 =  new Student();

        // Print default values for roll number, name, and marks
        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        // Set values for roll number, name, and marks
        student1.rno   = 10;
        student1.name  = "Rahul";
        student1.marks = 7.1;

        // Print updated values for roll number, name, and marks
        System.out.println("\n"+student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        // Call the greeting method for student1
        student1.greeting();

        // Parameterized instantiation of a Student object
        Student student2 = new Student(11, "Kunal", 9.5);

        // Print values for roll number, name, and marks for student2
        System.out.println("\n"+student2.rno);
        System.out.println(student2.name);
        System.out.println(student2.marks);

        // Call the greeting method for student2
        student2.greeting();

        // Change the name for student2
        student2.changeName("Civo");

        // Call the greeting method for student2 after changing the name
        student2.greeting();

        // Copy constructor instantiation of a Student object
        Student student3 = new Student(student1);

        // Call the greeting method for student3
        student3.greeting();

        // Default constructor instantiation of a Student object (one)
        Student one = new Student();

        // Call the greeting method for one
        one.greeting();

        // Assign the reference of one to two (both refer to the same object)
        Student two = one;

        // Change the name for one
        one.changeName("Annis");

        // Call the greeting method for two (reflecting the change made to one)
        two.greeting();
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

    /**
     * Default constructor that internally calls the parameterized constructor with default values.
     */
    Student(){
        this(-1, "Default person", 0.0);
    }

    /**
     * Parameterized constructor to initialize a Student object with specific values.
     *
     * @param rno   The roll number of the student.
     * @param name  The name of the student.
     * @param marks The marks obtained by the student.
     */
    Student(int rno, String name, double marks){
        this.rno   = rno;
        this.name  = name;
        this.marks = marks;
    }

    /**
     * Copy constructor to create a new Student object by copying values from another Student object.
     *
     * @param student The Student object to be copied.
     */
    Student(Student student){
        this(student.rno, student.name, student.marks);
    }

    /**
     * Method to print a greeting message with the student's name.
     */
    void greeting(){
        System.out.println("Hello! My name is " + this.name);
    }

    /**
     * Method to change the name of the student.
     *
     * @param name The new name for the student.
     */
    void changeName(String name){
        this.name = name;
    }
}
