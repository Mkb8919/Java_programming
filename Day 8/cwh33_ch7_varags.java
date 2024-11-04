package com.company;

public class cwh33_ch7_varags {
   // static int sum(int a, int b) {
    //    return a + b;
   // }
      //  static int sum(int a, int b, int c){
          //  return a+b+c;
    // }
    //static int sum(int a, int b, int c, int d) {
      //  return a + b + c + d;
   // }

    static int sum( int x, int...arr){ // if we want that some arguments are compulsary
       // availaible as int []arr; // so we can add some integer like int x which fixed
        int result = 0;
        for (int a : arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(" welcome to varags tutorial");
       // System.out.println(" the sum of nothing is :" + sum());
        System.out.println(" the sum of 1 is : " + sum(1));
        System.out.println(" the sum of 4 and 5 is:" + sum (4,5));
        System.out.println(" the sum of 4, 3 and 5 is : " + sum ( 4,3, 5));
        System.out.println( " the sum of 2,3,4 and 5 is :" + sum(2,3,4,5) );
        System.out.println(" the sum of 1,2,3,4 and 5 " + sum(1,2,3,4,5));
    }

}

