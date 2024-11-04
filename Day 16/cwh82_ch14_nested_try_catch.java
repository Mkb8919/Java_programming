package com.company;

import java.util.Scanner;

public class cwh82_ch14_nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
      //   marks[3]= 8;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (true) {
            System.out.println("Enter the value of index:");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to video no 82");
                try {
                    System.out.println(marks[ind]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
            System.out.println("Thanks for using this program");
        }
    }
}