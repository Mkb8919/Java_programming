package com.company;

import java.io.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;  // For handling exceptions


// Create a class to be serialized
class Person implements Serializable {
    private static final long serialVersionUID = 1L; // This helps during deserialization
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

public class cwh_serialization {
    public static void main(String[] args) {

//        Serialize the object
                try {
                    // Create directories if they don't exist
                    File directory = new File("output");
                    if (!directory.exists()) {
                        directory.mkdir();  // Create the directory if it doesn't exist
                    }

                    // Create the person object (assuming Person class exists)
                    Person person = new Person("Mohit", 20);

                    // Save the object to the file inside the "output" folder
                    FileOutputStream fileOut = new FileOutputStream("output/person.ser");
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);

                    out.writeObject(person);  // Serialize the object
                    out.close();
                    fileOut.close();

                    System.out.println("Person object has been serialized and saved to output/person.ser");
                } catch (IOException e) {
                    e.printStackTrace();
                }
//    deserialize the object
        try {
            // File from which the object will be deserialized
            FileInputStream fileIn = new FileInputStream("output/person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Deserialize the object
            Person person = (Person) in.readObject();

            // Close the streams
            in.close();
            fileIn.close();

            // Print the deserialized object
            System.out.println("Person object has been deserialized: " + person);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


