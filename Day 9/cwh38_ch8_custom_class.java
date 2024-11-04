package com.company;

class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println(" My id is " + id);
        System.out.println(" and my name is " + name);
    }

    public int getSalary() {
        return salary;
    }

    public class cwh_38_custom_class {
        public static void main(String[] args) {
            System.out.println(" this is our custom class");
            Employee Mohit = new Employee();// instantiating a new employee object
            Employee john = new Employee();// instantiating a new employee object

            // setting Attributes for Mohit
            Mohit.id = 12;
            Mohit.salary = 34000;
            Mohit.name = " RandomwithMohit ";

            // Setting Attributes for john
            john.id = 17;
            john.salary = 12000;
            john.name = " john khandelwal ";

            // printing the attributes
            Mohit.printDetails();
            john.printDetails();
            int salary = john.getSalary();
            System.out.println(salary);
            // System.out.println(Mohit.id);
            // System.out.println(Mohit.name);
        }
    }
}
