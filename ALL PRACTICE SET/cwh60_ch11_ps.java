package com.company;

abstract  class Pen {
   abstract void write();
   abstract void refill();

}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write");

    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}

class Monkey{
   void jump(){
       System.out.println("jumping...");
   }
   void bite(){
       System.out.println("biting...");
   }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
abstract class telephone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class Smartphone2 extends telephone {
    void ring(){
        System.out.println("Ringing...");
    }
    void lift(){
        System.out.println("Lifting...");
    }
    void disconnect(){
        System.out.println("Disconnected...");
    }
    void mainCamera(){
        System.out.println("Clicking selfie");
    }
    void Radio(){
        System.out.println("Playing music");
    }
}
// problem 6
interface TvRemote{
    void volume();
    void channel();
}
interface SmartTvRemote extends TvRemote{
    void volume1();
    void channel1();
}
//
class TV implements TvRemote{
    public void volume(){
        System.out.println("Volume up and down");
   }
    public void channel(){
        System.out.println("Moving a channels");
    }
}
public class cwh60_ch11_ps {
    public static void main(String[] args){
        // problem 1 and problem 2
//        FountainPen pen = new FountainPen();
//        pen.changeNib();

//        problem 3
//         Human mohit = new Human();
//         mohit.eat();
//         mohit.jump();

//        problem 5
        /*
        Monkey m1 = new Human();
//         m1.speak(); --> cannot use speak method because the reference is monkey which does not have speak method
           m1.bite();
           m1.jump();

           BasicAnimal Lavish = new Human();
//           Lavish.speak(); --> error
        Lavish.eat();
        Lavish.sleep();
         */

//        problem 4
//        telephone phone = new Smartphone2();
//        phone.maincamera --> error
//        phone.disconnect();

//        problem 7
        TV tv = new TV();
        tv.channel();

    }
}
