package com.company;

import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}
 interface MyInt{
    void display();
}

public class cwh112_ADJ2_ps {
    public static void main(String[] args) {
//        problem 3
//        @SuppressWarnings("Deprecated") // compiler ki aawaz ko dabana

//        problem 2
//        MyDeprecated d  = new MyDeprecated();
//    d.meth1();

//    problem 4
//    MyInt i = ()-> System.out.println("I am a display");

//        problem 5
        /*
        int i = 19;
        String table = "";
        for(int j=0; j<10; j++){
            table += i + "X" + (j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e){
            e.printStackTrace();

         */
//        problem 6

        int j=2;
        String table="";
        while(j<=9){
            for (int i=1;i<=10;i++){
                table += j+"X"+i+"="+j*i;
                table +="\n";
            }
            j++;
            table +="\n";
        }

        try {
            FileWriter f = new FileWriter("table.txt");
            f.write(table);
            f.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }
    }

