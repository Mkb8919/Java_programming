package com.company;

public class cwh32_ch7_methods_0verloading {
    static void foo(){
        System.out.println(" good morning bro!");
    }
    static void foo(int a ){
        System.out.println(" good morning " + a + " bro! " );
    }
    static void foo(int a, int b ){
        System.out.println(" good morning " + a + " bro! " );
        System.out.println(" good morning " + b + " bro! " );
    }
    // static int foo(int a, int b )
    //System.out.println(" good morning " + a + " bro! " );
     //   System.out.println(" good morning " + b + " bro! " );
    // return 3   methods overloading cannot be performed by changing the return type of methods

    static void foo(int a, int b, int c){
        System.out.println(" good morning " + a + " bro! " );
        System.out.println(" good morning " + b + " bro! " );
        System.out.println(" good morning " + c + " bro! " );
    }
    static void change(int a){
        a = 98;
    }
    static void change2 (int [] arr ){
        arr[0] = 98;
    }
    static void telljoke(){
        System.out.println(" I invented a new word! \n" + " Plagiarism!");
    }

    public static void main(String[] args){
         telljoke();
        // case 1: changing the integer ;
        int x = 45;
        change(x);
        System.out.println(" the value of x after running change is:" + x);

        // case2 : changing the array
       int [] marks = {52,73,77,89,98,94};
        change2 (marks);
        System.out.println(" The value of marks after runnning change is:" + marks[0]);


        // methods overloading
        foo();
        foo(3000 );
        foo(3000, 4000);
        // arguments are actual!


    }
}
