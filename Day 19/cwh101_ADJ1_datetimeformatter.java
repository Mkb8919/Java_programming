package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh101_ADJ1_datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();// this is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E H : m a");// this is the format
       DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df); // creating date string using date and format
        System.out.println(myDate);

    }
}
