package com.company;

import java.util.LinkedList;

public class cwh92_ADJ1_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
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
        l1.addLast(676);
        l1.addFirst(786);
        l1.remove(2);
        System.out.println("L1 linked list after:" +l1);
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
    }
    }

