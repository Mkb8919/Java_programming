package com.company;
import java.util.Scanner;

public class cwh18_ch4_elseif {
    public static void main(String[] args) {
        int age ;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age= sc.nextInt();

        switch(age){
            case 18:
                System.out.println("you are going to become adult");
                break;
            case 23:
                System.out.println("you are going to get a job");
                break;
            case 60:
                System.out.println("you are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }
        System.out.println(" thanks for using my Java program");



/*
        if (age>56){
            System.out.println("you are experienced!");
        }
        else if(age>46){
            System.out.println("you are semi- experienced!");
        }
        else if(age>36){
            System.out.println("you are semi- semi-experienced!");
        }
        else {
            System.out.println("you are not experienced!");
        }
        if (age>2){
            System.out.println("you are not a baby!");
        }
*/
    }
}
