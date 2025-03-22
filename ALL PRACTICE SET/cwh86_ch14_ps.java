 package com.company;
import java.util.Scanner;

class Exceptionretry extends Exception{
    @Override
    public String getMessage(){
        return "Error";
    }
}

public class cwh86_ch14_ps {
    public static void throwexception(int i) throws Exceptionretry{
        if(i>=5){
            throw new Exceptionretry();
        }
    }

    public static void main(String[] args) {
//        problem 1
//        Syntax error - int a = 7
//        int age = 78;
//        int year_born = 2000-70; // Logical error
//        System.out.println(6/0);

//        problem 2
        /*
        try {
            int a = 666/0;

        }
        catch (IllegalArgumentException e){
            System.out.println("Haha");
        }
        catch (ArithmeticException e){
            System.out.println("Hehe");
        }
         */

//        problem 3

        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i < 5) {
            try {
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid index");
                i++;
            }
//            problem 5
            try{
                throwexception(i);
            }
            catch (Exceptionretry e){
                System.out.println(e.getMessage());
            }
        }
        //if (i >= 5) {

//            problem 4
         //   try {

            //    throw new Exceptionretry();
            //}
            //catch (Exceptionretry e) {
            //    System.out.println("\n" + e.getMessage());
            //}
           // System.out.println("Error");
        }
    }


