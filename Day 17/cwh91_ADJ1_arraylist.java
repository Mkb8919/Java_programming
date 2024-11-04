package com.company;

import java.util.*;

public class cwh91_ADJ1_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);
//        l1.addAll(l2);
        l1.addAll(0,l2);
//        System.out.println(l1.contains(6)); --> true because element is present
        System.out.println(l1.contains(27)); // --> false because element is not present
        System.out.println(l1.indexOf(7));
        System.out.println(l1.lastIndexOf(6));
//        l1.clear();
        l1.set(1,566);// it can change the value of index 1
        l1.removeAll(l2);// it can be used to remove all element of l2
        l1.removeLast();// It will remove the last element
        for (int i=0; i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
        System.out.println("L1 Array list :" + l1);
        System.out.println("L2 Array list : " + l2);
        l1.addAll(l2);
        System.out.println("L1 Array list after merging: "+ l1);
        System.out.println("L2 Array list : " +l2);

    }
}
