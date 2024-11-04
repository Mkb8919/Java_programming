package com.company;

public class cwh_Beans implements java.io.Serializable {

//    member variables
    private String name;
    private int id;
    private String course;
    private int roll;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    void registerStudent(cwh_Beans beans){
        System.out.println(beans.getName());
        System.out.println(beans.getId());
        System.out.println(beans.getCourse());
    }
    //    int roll;
//    int id;
//    String name;
//    String course;

//    void registerStudent(int roll, int id, String name, String course){
//        this.course = course;
//        this.name = name;
//        this.id = id;
//        this.roll = roll;
//    }

//    public String toString(){

//        return "cwh_Beans [roll ="+ roll +", id=" + id + ", name=" + name + ", course=" + course +"]";
//    }


    public static void main(String[] args) {
        cwh_Beans beans = new cwh_Beans();
//        beans.registerStudent(01,1001, "mohit","spring framework");
//        System.out.println(beans);
        beans.setName("Ankit");
        beans.setId(45);
        beans.setCourse("Physics wallah");
        beans.registerStudent(beans);


/* Java Bean:-
-> java bean is a java class that is developed by following some standards.
-> java bean does not contain any logics. It acts as helper class to carry data
from one class to another or from one project to another.

-> In order to pass more than 3 values from one class to another or from
one project to another, take support or java bean

-> The standards to develop a java bean class are following:-
1. class must be taken as public
2. it is recommended to implement java.io.serializable(I)to send data over network.
3. all bean properties(member variables must be taken as private and non static.
4. every bean property should have one public setter method and one public getter method.
(accessor method). here, setter method will be used to set the values to the property(member variable)
and getter method will be used to get those values from variables.
5. there must be one zero(0) param constructor explicitly(given by programmer) or implicitly
(given by java compiler as default constructor).
 */


    }
}
