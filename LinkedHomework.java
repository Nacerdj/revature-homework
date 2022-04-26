package com.nacerjava.firstapp.Week2.homework;

/**Here we can see example for basic operations like creating object for LinkedList,
 *  adding objects into LinkedList,
 *  searching an object in LinkedList,
 *  whether it is listed under this LinkedList instance or not,
 *  checking whether the LinkedList is empty or not,
 *  and finally size of the LinkedList.
 */

import java.util.LinkedList;

public class LinkedHomework {
    public static void main(String[] args) {
        LinkedList<String> MyList = new LinkedList<String>();
        MyList.add("Orange");
        MyList.add("Blue");
        MyList.add("Gaz");
        MyList.add("Home");
        System.out.println(MyList);
        System.out.println("Size of the Linked List: "+MyList.size());
        System.out.println("LinkedList is empty? "+MyList.isEmpty());
        System.out.println("Dos LinkedList contains 'Gaz'? "+MyList.contains("Gaz"));

    }
}
