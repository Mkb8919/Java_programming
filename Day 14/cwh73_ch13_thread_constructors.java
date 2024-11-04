package com.company;


class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 32;
        System.out.println("thank you");
//        while(true){
//            System.out.println("I am a thread");

//        }
    }
}

class MyClass1 extends Thread implements Runnable{
    public  MyClass1(int i, String name){
        super(name);
    }
    public void run(){
        System.out.println("Hey,Good morning");
    }
}
public class cwh_73_thread_constructors {
    public static void main(String[] args) {

     /*
        MyThr t1 = new MyThr("Harry");
        MyThr t2 = new MyThr("Ram Charan");
        t1.start();
        t2.start();
        System.out.println("The id of thread t is " + t1.getId());
        System.out.println("The name of thread t is " + t1.getName());
        System.out.println("The id of thread t is " + t2.getId());
        System.out.println("The name of thread t is " + t2.getName());
      */

        MyClass1 ab = new MyClass1(26,"Mohit");
        Thread cd = new Thread(ab);
        cd.start();
        System.out.println(cd.getId());
        System.out.println(ab.getName());

    }
}
