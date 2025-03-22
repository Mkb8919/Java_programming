package com.company;

class  Employee1 {
    int salary;
    String name ;
    public int getsalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String setName(String n){
        return name =n;
    }
}

class cellphone{
    public void ringing() {
        System.out.println(" Ringing... ");
    }
        public void vibrating() {
            System.out.println(" Vibrating...  ");
        }
        public void callfriend(){
            System.out.println(" calling Mukul... ");
    }

}

class Square{
    int side;
    public int area(){
        return side * side ;
    }
    public int parameter(){
        return 4*side;
    }
}

class Rectangle{
    int length ;
    int breadth;
    public int area(){
        return length * breadth;
    }
    public int parameter() {
        return (length + breadth)*2;
    }
}

class TommyVecetti{
    public void hit(){
        System.out.println(" hitting the enemy");
    }
    public void run(){
        System.out.println(" Running from the enemy ");
    }
    public void fire(){
        System.out.println(" firing on the enemy ");
    }
}

class Cirle{
    int pi;
    int r;
    public int area(){
        return pi*r*r ;
    }
    public int parameter(){
        return 2*pi*r;
    }
}
public class cwh39_ch8_ps {
    public static void main(String[] args) {

        // problem 1
        /*
        Employee1 harry = new Employee1();
        harry.setName(" code with harry ");
        harry.salary = 233;
        System.out.println(harry.getsalary());
        System.out.println(harry.getName());
         */

        // problem 2
        /*
        cellphone asus = new cellphone();
        asus.callfriend();
        asus.vibrating();
        asus.ringing();
         */

// problem3
        /*
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.parameter());
         */

        // problem 4
        /*
        Rectangle rec = new Rectangle();
        rec.length = 2;
        rec.breadth = 7;
        System.out.println(rec.area());
        System.out.println(rec.parameter());
         */

        // problem 5
        /*
 TommyVecetti player1 = new TommyVecetti();
player1.fire();
player1.hit();
player1.run();
         */

        // problem 6
        Cirle ci = new Cirle();
        ci.pi = 22/7;
        ci.r = 20;
        System.out.println( ci.area());
        System.out.println( ci.parameter());
    }
}
