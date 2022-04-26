package com.nacerjava.firstapp.Week2.homework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**Write a Java program to iterate through all elements
 *  in a linked list starting at the specified position.
 */
public class DemoIterate {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> All_list = new LinkedList<String>();
        // using add method to add values in the linked list
        All_list.add("Coffee");
        All_list.add("Milk");
        All_list.add("Sugar");
        All_list.add("Flour");
        // set Iterator at specified index
        ListIterator<String> M = All_list.listIterator(2);

        // print list from 3 position
        while (M.hasNext()){
            System.out.println(M.next());

        }
        System.out.println("****************");
        /**
         * Write a Java program to iterate through all
         *  elements in a linked list.
         */

        for (String element : All_list){
            System.out.println(element);
        }
        System.out.println("*****************************");
    /**
     * Write a Java program to iterate a linked list in reverse order.
     */
        System.out.println("Original linkedList: "+All_list);
        Iterator Alpha = All_list.descendingIterator();
        // we will print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (Alpha.hasNext()){
            System.out.println(Alpha.next());
        }
        System.out.println("***************************************");

        /**Write a Java program to insert the specified
         *  element at the specified position in the linked list.
         */
        System.out.println("Original Linked List: ");
        System.out.println("adding chocolate to our original list after Milk: "+All_list);
        All_list.add(2,"chocolate");
        // print our new list
        System.out.println("************************");
        System.out.println("The linked List :" + All_list);
    }
}
