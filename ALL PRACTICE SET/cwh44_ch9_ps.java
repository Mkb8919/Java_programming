package com.company;

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
    public double Volume() {
        return Math.PI * radius * radius * height;
    }

}

class MyRectangle{
   private int length;
   private int breadth;

   public MyRectangle(){
       this.length = 4;    // constructor overload
       this.breadth = 5;
   }

    public MyRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}


class Sphere {
    private int radius ;

    public Sphere(int radius) {
        this.radius = radius;
       }

    public double surfaceArea(){
        return 4 * Math.PI * radius * radius;
    }
    public double Volume(){
       return  1.33d * Math.PI * radius * radius * radius;

    }
}
public class cwh44_ch9_ps {
    public static void main(String[] args) {

/*
//        problem 1
        com.company.Cylinder mycylinder = new com.company.Cylinder(9, 12);
//        mycylinder.setHeight(12);
        System.out.println(mycylinder.getHeight());
//        mycylinder.setRadius(9);
        System.out.println(mycylinder.getRadius());

//        PROBLEM 2
        System.out.println(mycylinder.surfaceArea());
        System.out.println(mycylinder.Volume());
 */


//        problem 3
        /*
        com.company.MyRectangle r = new com.company.MyRectangle(12,56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

         */

//        problem 4

        Sphere sp = new Sphere(8);
        System.out.println(sp.surfaceArea());
        System.out.println(sp.Volume());


        }


     }





