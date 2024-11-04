package com.company;

public class cwh26_ch6_arrays {
    public static void main(String[] args) {
        /* classroom of 500 students - you have to store marks of these 500 students
        you have 2 options :
        1. create 500 variables
        2. use arrays [recommended]
         */
        // There are three main ways to create an array in java
        // 1. Declaration and memory allocation
        // int [] marks = new int [5];

        // 2. declaration and then memory allocation
        // or int [] marks ;
         // marks = new int [5];
        // initialization
       // marks [0] = 100;
       // marks [1]= 60;
       // marks [2] = 70;
       // marks [3] = 98;
       // marks [4] = 86;

        // 3. declaration , memory allocation and initialization together
        int [] marks = {96,45,79, 99, 80};

        // marks[5] = 96; - throws an error
        System.out.println(marks[4]);
        System.out.println(marks[1]);

    }
}
