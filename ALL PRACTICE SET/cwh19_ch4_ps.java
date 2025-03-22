package com.company;
import java . util.Scanner;
public class cwh19_ch4_ps {
    public static void main(String[] args) {
        //Ouestion 1
        //  int a = 11;
        //   if(a==11) {
        //    System.out.println("Iam 11");
        //  }
        // else{
        //   System.out.println("Iam not 11");
        // }

        // Question 2

        //  byte m1,m2,m3;
        //   Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter your Physics marks");
        // m1 = sc.nextByte();
        //System.out.println("Enter your Chemistry marks");
        //m2 = sc.nextByte();
        //System.out.println("Enter your Mathematics marks");
        // m3 = sc.nextByte();
        //float avg = (m1+m2+m3)/3.0f;
        //System.out.println("Your Overall percentage is: " +avg );
        // if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {
        //   System.out.println("Congratulations , you have been promoted");
        // }
        //else{
        //System.out.println("Sorry , you have not been promoted, Please try again");
        // }

        // Question 3
       // Scanner sc = new Scanner(System.in);
       // System.out.println("Enter your income in Lakhs per annum");
       // float tax = 0;
       // float income = sc.nextFloat();
      //  if (income <= 2.5f) {
          //  tax = tax + 0;
        //}
        // else if (income > 2.5f && income <= 5f) {
        //tax = tax + 0.05f * (income - 2.5f);
        //}
        // else if (income > 5f && income <= 10f) {
          //  tax = tax + 0.05f * (5.0f - 2.5f);
          //  tax = tax + 0.2f * (income - 5f);
       // }
       // else if (income > 10.0f) {
            //tax = tax + 0.05f * (5.0f - 2.5f);
          //  tax = tax + 0.2f * (10.0f - 5f);
           // tax = tax + 0.3f * (income - 10.0f);
       // }

        //System.out.println(" The total tax paid by the employee is:" + tax);


        // question 4

        //Scanner sc = new Scanner(System.in);
       // int day = sc.nextInt();

         //enhance switch case means without using a break
       // switch (day){
            //case 1 -> System.out.println("Monday");
           //case 2 -> System.out.println("Tuesday");
           // case 3 -> System.out.println("Wednesday");
          //  case 4 -> System.out.println("Thursday");
        // case 5 -> System.out.println("Friday");
           // case 6 -> System.out.println("Saturday");
           // case 7 -> System.out.println("Sunday");
         // }

        //  Question 5
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the year");
       // int yr = sc.nextInt();
       // if(yr % 4 == 0 ) {
         //   System.out.println("This is a Leap year");
       // }
       // else{
         //   System.out.println("This is not a leap year");
       // }

        // Question 6

       Scanner sc = new Scanner(System.in);
        java.lang.String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organisational website ");
        }
        else if(website.endsWith(".com")){
           System.out.println("This is an commercial website");
        }
       else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }

    }
}

