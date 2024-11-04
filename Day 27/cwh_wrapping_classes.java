package com.company;
import java.util.ArrayList;

public class cwh_wrapping_classes {
    public static void main(String[] args) {
//        1. Autoboxing: Primitive to Wrapper class conversion
        int primitiveInt = 100;
        Integer wrappedInt = primitiveInt; // Autoboxing: int to integer
        System.out.println("Autoboxing (int to Integer): " + wrappedInt );

        // 2. Unboxing: Wrapper class to Primitive conversion
        Integer anotherWrappedInt = new Integer(50);// integer object
        int unboxedInt = anotherWrappedInt;  // Unboxing: Integer to int
        System.out.println("Unboxing (Integer to int): " + unboxedInt);

        // 3. Using Wrapper classes in Java Collections
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(10.5);  // Autoboxing: double to Double
        doubleList.add(20.7);
        doubleList.add(5.8);
        System.out.println("\nValues in ArrayList of Doubles:");
        for (Double value : doubleList) {
            System.out.println(value);  // Unboxing happens automatically
        }
        // 4. Utility Methods in Wrapper Classes
        // Parsing a String to an int using parseInt()
        String numberStr = "123";
        int parsedInt = Integer.parseInt(numberStr);  // String to int
        System.out.println("\nParsed int from String '123': " + parsedInt);

        // Converting an int to a String using toString()
        String intToString = Integer.toString(456);
        System.out.println("Converted int 456 to String: " + intToString);

        // Getting the binary representation of an int
        int number = 10;
        String binaryRepresentation = Integer.toBinaryString(number);
        System.out.println("Binary representation of 10: " + binaryRepresentation);

        // Converting a String to a double using parseDouble()
        String floatStr = "45.67";
        double parsedDouble = Double.parseDouble(floatStr);
        System.out.println("\nParsed double from String '45.67': " + parsedDouble);

        // Getting the maximum and minimum value of wrapper classes
        System.out.println("\nMax value of Integer: " + Integer.MAX_VALUE);
        System.out.println("Min value of Integer: " + Integer.MIN_VALUE);

        System.out.println("Max value of Double: " + Double.MAX_VALUE);
        System.out.println("Min value of Double: " + Double.MIN_VALUE);

        // 5. Handling null values with wrapper classes
        Integer nullableInteger = null;  // Wrapper classes can be null
        System.out.println("\nNullable Integer: " + nullableInteger);

        // Uncommenting the next line would throw a NullPointerException due to unboxing
        // int invalidUnboxing = nullableInteger;
    }
}


