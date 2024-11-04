package com.company;

public class cwh9_ch2_op_pre {
    public static void main(String[] args) {
        //precedence and associativity jo bada hota hain vo pahale evaluate hota hain
      // int a = 6*5-34/2;
        /*
        highest precedence goes to * and /. They are then evaluated on the basis of left to right assoictivity
        =30-34/2
        =30-17
        =13
         */
      // int b = 60/5-34*2;
        /*
        =12-34*2
        =12-68
        =-56
         */
        //System.out.println(a);
     //  System.out.println(b);

        //Quick quiz
        int x = 6;
        int y = 1;
     //   int k = x * y/2;

         int b = 1; // int b = 0
        int d= 4; // int c = 0  // Denominator 0 nahi hona chahiye in mathematics calculations
        int a = 5; // int a = 10
        int k = a * b - d; // Parenthesis ( )
        System.out.println(k);


    }
}
