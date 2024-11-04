package com.company;

class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee() {
        id = 45;
        name = "your name here";
    }

    public MyMainEmployee(String myName, int myId) {
        id = 45;
        name = myName;
        id = myId;
    }

    public String getName() {
        return name;

    }

    public void setName(String n) {
        this.name = n;

    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }
}

    // Quick Quiz

class MainEmployee {
    private String name;
    private int salary;

    public MainEmployee(){
        salary = 10000; // 3400
        name = "mohit";

    }
    public MainEmployee(String myName, int mysalary){
        salary = 10000; // 3400
        name = myName;
        salary = mysalary;
    }
    public String getName() {
        return name;

    }

    public void setName(String n) {
        this.name = n;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int s) {
        this.salary = s;
    }

}



    public class cwh_42_constructors {
     public static void main(String[] args) {
//       MyMainEmployee harry = new MyMainEmployee("Programmingwithharry", 34) ;
//         MyMainEmployee harry = new MyMainEmployee() ;
         // agar my name employee ke ander koi name pass nhi kiya gaya hain toh vo constructor waala he pass karega

        //  harry.setName("Codewithharry");
        // harry.setId(34);
//        System.out.println(harry.getId());
//        System.out.println(harry.getName());

 // Quick Quiz

//         MainEmployee mohit = new MainEmployee("programmingwithmohit", 10000);
           MainEmployee mohit = new MainEmployee();
         System.out.println(mohit.getName());
         System.out.println(mohit.getSalary());

    }

}
