package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String x ;
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name here:");
        x = sc.nextLine();
        System.out.println("Hello:" + x);
    }
}