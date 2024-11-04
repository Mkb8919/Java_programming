package com.company;

public class cwh27_ch6_for_each_loop {
    public static void main(String[] args) {
        //int []marks = {98, 45,79,99,80};
       // System.out.println(marks[1]);

        //float [] marks = {98.1f, 45.7f, 79.87f, 99.5f, 80.9f };
       // System.out.println(marks.length);
       // System.out.println(marks[0]);
        //String [] students = {"Harry", "Mohit", "Rohit","Aayush"};
       // System.out.println(students[1]);
       // System.out.println(students.length);

        int [] marks = {98, 45,79, 99,80};
        //System.out.println(marks.length);
        // Displaying an array(Naive way)
        System.out.println("Printing using Naive method ");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // displaying the array(for loop)
        /*
        System.out.println("Printing using for loop");
        for(int i=0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }
         */

        // Displaying the array in reverse order (for loop)
        /*
        System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length-1;i>=0;i--) {
            System.out.println(marks[i]);
        }
         */

        // quick quiz: displaying the array (for-each loop)
        System.out.println("Printing using for- each loop");
        for(int element: marks ){
            System.out.println(element);
        }



    }
}
