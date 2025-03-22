package com.company;

public class cwh15_ch3_ps {
    public static void main(String[] args) {
        //problem1
        String name = "JACK PARKAR ";
        name = name.toLowerCase();
        System.out.println(name);

        //problem2
        String text ="to my friend";
        text = text.replace(" ",   "_") ;
        System.out.println(text);

        //problem3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Mohit");
        System.out.println(letter);

        //problem4
        String myString = "This String contains   double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //problem5
        String myletter = "Dear Harry, \n\tThis java course is nice. \n\tThanks";
        System.out.println(myletter);

    }
}
