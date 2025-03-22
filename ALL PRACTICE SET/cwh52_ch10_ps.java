package com.company;

class Circle1{
    public int radius;
    Circle1(){
        System.out.println("I am non param of circle1");
    }
    Circle1(int r){
        System.out.println("I am a circle1 parameterized constructor ");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }

}
class Cylinder1 extends Circle1{
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor:" );
      this.height = h;
    }
    public int height;
    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }

}

class Rectangle1 {
    int length;
    int breadth;
    Rectangle1(){
        System.out.println("I am a non parameterized constructor");
    }

    public Rectangle1(int breadth, int length) {
        System.out.println("I am rectangle1 parameterized constructor");
        this.breadth = breadth;
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int area(){
        return length * breadth;
    }
    public int parameter() {
        return (length + breadth)*2;
    }
}
class Cuboid extends Rectangle1{
    Cuboid(int length,int breadth, int height){
        super(length, breadth);
        System.out.println("I am cuboid parameterized constructor");
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int height;
    public double volume() {
        return this.length * this.breadth * this.height;
    }

}

class Base2{
     Base2() {
         System.out.println("I am base2 constructor");
    }
}
class Derived2 extends Base2{
    Derived2(){
        System.out.println("I am derived2 constructor");
    }
}
class Derived3 extends Derived2{
    Derived3(){
        System.out.println("I am derived3 constructor");
    }
}

public class cwh52_ch10_ps {
    public static void main(String[] args) {

        /*
//        problem 1
//          Circle1 objc = new Circle1(12);
 //         Cylinder1 obj = new Cylinder1(12,4);
         */

//      problem 2 and problem 3
    //   Rectangle1 objr = new Rectangle1(3,5);
//        Cuboid obj = new Cuboid(12,4,8);

//        problem 4
        /*
        Rectangle1 rec = new Rectangle1();
        rec.setBreadth(5);
        rec.setLength(4);

        obj.setHeight(9);
        obj.setLength(10);
        obj.setBreadth(12);

        System.out.println(rec.getBreadth());
        System.out.println(rec.getLength());
        System.out.println(obj.getHeight());
        System.out.println(obj.getBreadth());
        System.out.println(obj.getLength());
         */

//        problem 5
        Base2 b2 = new Base2();
      //  System.out.println("I am a king"); agar yaha kuch print nhi kiya hota toh upar waala hota
        Derived2 d2 = new Derived2();
        Derived3 d3 = new Derived3();


    }
}
