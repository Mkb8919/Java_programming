package com.company;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x){
        System.out.println("I am in base setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Animal{
    public void walking(){
        System.out.println("They can walking...");
    }
    public void eating(){
        System.out.println("They can eating...");
    }
}

class Dog extends Animal{
    public void Barking(){
        System.out.println("Bow Bow!");
    }
}

public class cwh_45_inheritance {
    public static void main(String[] args) {

        /*
//     Creating an object of base class
         Base b = new Base();
         b.setX(4);
        System.out.println(b.getX());

//      Creating an object of derived class
        Derived d = new Derived();
//        d.setY(43);
//        System.out.println(d.getY());
        d.setX(43);
        System.out.println(d.getX());

         */
//      Quick Quiz

//        Creating an object of Animal class
        Animal a = new Animal();
        a.walking();
        a.eating();

//        Creating an object of Dog class
        Dog d = new Dog();
        d.Barking();
    }
}
