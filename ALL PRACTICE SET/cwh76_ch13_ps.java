package com.company;

class Practice13 extends Thread {
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}
class MyPractice13 extends Thread{
    public void run(){
        /*
        while(true){
            try {
                Thread.sleep(200);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");

         */
        }
    }


public class cwh76_ch13_ps {
    public static void main(String[] args) {
//        problem 1
        Practice13 p1 = new Practice13();
//        p1.setPriority(6);
        System.out.println(p1.getPriority());
        MyPractice13 p2 = new MyPractice13();
//        p2.setPriority(9);
        System.out.println(p2.getPriority());
//        p1.start();
          p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());

//        problem 2
//        thread.sleep method will be add on the welcome


    }
}
