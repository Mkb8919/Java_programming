package com.company;

class MyEmployee {
    int id;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
       this. name = n;
    }

    public int getid() {
        return id;
    }

    public void setid(int i) {
      this. id = i;
    }
}

// quick quiz

class Circle {
private int radius;
private float area;
private float perimeter;

public void setradius(int r){
    radius = r;
}
public void checkarea(float a){
    area=3.14f*radius*radius;
    if(area==a)
    {
        System.out.println("Correct Area.");
    }
    else{
        System.out.println("Incorrect Area.");
    }
}
public void checkperimeter(float p){
    perimeter = 2*3.14f*radius;
    if(perimeter==p)
    {
        System.out.println("Correct Perimeter.");
    }
    else{
        System.out.println("Incorrect Perimeter.");
    }
}
}
public class cwh_40_ch9 {
    public static void main(String[] args) {
        /*
  MyEmployee harry = new MyEmployee();
 //  harry.id = 45;
  // harry.name = " codewithharry"; ---> throws an error due to private acces modifier
  harry.setName(" codewithharry");
        System.out.println(harry.getName());
        harry.setid(233);
        System.out.println(harry.getid());
         */

        Circle ci= new Circle();
        ci.setradius(3);
        ci.checkarea(28.26f);
        ci.checkperimeter(18.84f);
    }
}