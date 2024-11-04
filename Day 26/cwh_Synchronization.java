package com.company;


// class Counter {
class SharedResource {
  //  private static int count = 0;
    private  int count = 0;
    private  final  Object lock = new Object();

    // Synchronized method to increment the counter
    //public static synchronized void increment() {
    public  void increment() {
        synchronized (lock) {
            count++; // only thread can acces this method at a time
        }
    }

    // Method to return the count value
  //  public static int getCount() {
    public int getCount(){
        return count;

    }
}

public class cwh_Synchronization {
    public static void main(String[] args) throws InterruptedException {
      SharedResource resource = new SharedResource();

        // Create two threads that will increment the counter 1000 times each
        Thread t1 = new Thread(() -> {
            for(int i = 0; i<1000; i++){
             //   Counter.increment();
                resource.increment();

            }
        });
        Thread t2 = new Thread(()-> {
            for(int i =0; i<1000; i++){
              //  Counter.increment();
                resource.increment();
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Print the final count
      //  System.out.println("Final count: " + Counter.getCount());
        System.out.println("Final count: " + resource.getCount());



    }
      }
