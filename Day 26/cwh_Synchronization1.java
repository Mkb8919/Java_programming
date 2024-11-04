package com.company;

//Deadlock Example:

//Deadlock can occur if two threads are waiting for each other to release resources.
// This is a dangerous situation in multithreading
class A1 {
    public synchronized void methodA1(B1 b) {
        System.out.println("Thread 1: Holding lock on A, waiting for B...");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        b.last();
    }
    public synchronized void last(){
        System.out.println("Inside A's last method");
    }
}
class B1 {
    public synchronized void methodB1(A1 a) {
        System.out.println("Thread 2: Holding lock on B, waiting for A...");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        a.last();
    }
    public synchronized void last(){
        System.out.println("Inside B's last method");
    }
}

public class cwh_Synchronization1 {
    public static void main(String[] args) {
        final A1 a = new A1();
        final B1 b = new B1();

//        Thread 1 tries to call methoda with lock on A, and waits for B's lock
        Thread t1 = new Thread(() -> a.methodA1(b));

//      Thread 2 tries to call methodB with lock on B, and waits for A's lock
       Thread t2 = new Thread(()-> b.methodB1(a));

       t1.start();
       t2.start();

    }
}
