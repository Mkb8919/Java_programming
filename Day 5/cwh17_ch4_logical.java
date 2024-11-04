package com.company;

public class cwh17_ch4_logical {
    public static void main(String[] args) {
        System.out.println("For logical AND....");
        boolean a = true;
        boolean b = false;
        if (a && b) {         //in that conditon both the value have to be true so they give y if one is false
                                       // in both the condition then they give n
            System.out.println("Y");
        }
            else{
           System.out.println("N");
        }

        System.out.println("For logical OR....");
        if(a || b){
           System.out.println("Y");
       }
        else{
           System.out.println("N");
        }

        System.out.println("For logical NOT...");
        System.out.println("Not(a)is ");
        System.out.println(!a);
        System.out.println("Not(b)is");
        System.out.println(!b);
    }

    public static class cwh_22_ch4_do_while {
    }
}
