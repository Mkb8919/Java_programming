package com.company;

class Base1{
    Base1(){
        System.out.println("I am a Constructor");
    }
    Base1(int x){
        System.out.println("I am an overlaoded Constructor with value of x as:" + x);
    }
}


class Derived1 extends Base1{
    Derived1(){
      //  super(0);
        System.out.println("I am a Derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overlaoded Constructor of Derived with value of y as:" + y);

    }
}

class childofDerived extends Derived1{
    childofDerived(){
        System.out.println("I am a child of derived constructor");
    }
    childofDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of Derived with value of z as:" + z);
    }
}
public class cwh_46_constructors_in_inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
//         Derived1 d = new Derived1(14,9);
//         childofDerived cd =new childofDerived();
           childofDerived cd =new childofDerived(12,33,4 );

    }
}
