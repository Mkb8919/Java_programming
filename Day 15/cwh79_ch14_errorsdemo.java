package com.company;

import java.util.Scanner;

public class cwh79_ch14_errorsdemo {
    public static void main(String[] args) {

//      SYNTAX ERR0R DEMO
        // int a = 0 // Error: no semicolon!
        // b = 8; // Error: b not declared!


//       LOGICAL ERROR DEMO
//        write a program to print all the prime numbers between 1 to 10
        System.out.println(2);
        for(int i =1 ; i<5; i++){
            System.out.println(2*i+1);
        }

//      RUNTIME ERROR
         int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+1000/k);

    }
}
