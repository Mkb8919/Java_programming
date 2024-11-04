package com.company;

import java.util.Calendar;

public class cwh98_ADJ1_calender_class {
    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

//          Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
          Calendar c = Calendar.getInstance();
           System.out.println(c.getCalendarType());
          System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
    }
}
