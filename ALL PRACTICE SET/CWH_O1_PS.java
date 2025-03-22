package com.company;
import java.util.Scanner;

public class CWH_O1_PS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometer");
        float km = sc.nextFloat();
        // Kilometers to miles conversion
        // 1km = 0.6213711922 miles
        float miles = (float)(0.6213711922 * km);
        System.out.println("Distance in miles will be : " +miles);

    }
}
