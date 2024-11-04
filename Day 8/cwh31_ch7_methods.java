package com.company;

public class cwh31_ch7_methods {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        }
        else {
            z = (x + y) * 5;   // agar static nahi banaya toh obj laga na padega
                               // aur static lagaya toh logic laga ke call karenge
        }
        x = 566; // it not be considered because it cannot considered in main method
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // methods incovation using logic creation
      //  cwh_31_methods obj = new cwh_31_methods();
        // c = obj.logic(a,b);
        c= logic (a,b);
        System.out.println(a+ " " +b);
        System.out.println(c);

        int a1 = 2;
        int b1 = 1;
        int c1;
       // c1 =  obj.logic (a1,b1);
        c1=logic(a1,b1);
        System.out.println(a1 + " " +b1);
        System.out.println(c1);

    }
}
