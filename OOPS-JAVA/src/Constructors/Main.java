package Constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         constructor = a special method to initialize objects
                        you can pass arguments
                        and set up initial values
         */
        Student student1 = new Student("Vedant",21,8.25);

        System.out.println(student1.age);

        student1.study();

    }

}
