package com.company;


interface Bicycle{
    void applyBrakes(int decrement);
     void speedup(int increment);
}

class AvonCycle implements Bicycle{
   int speed = 7;
      int applyBrakes = 2;


   public  void applyBrakes(int decrement){
       System.out.println("Applying brakes");
        speed = speed - decrement;

   }
   public void speedup(int increment){
       System.out.println("Applying speed up");
        speed = speed + increment;
    }

   }

public class cwh54_ch11_interfaces {
    public static void main(String[] args) {

        AvonCycle cyclemohit = new AvonCycle();

       System.out.println(cyclemohit.speed);
       System.out.println(cyclemohit.applyBrakes);

        }
    }

