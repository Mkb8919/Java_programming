package com.company;

import java.util.Date;

public class cwh97_ADJ1_date_class {
    public static void main(String[] args) {

//        Quick quiz
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
        System.out.println(d.getDay());

    }
}
