package com.nacerjava.firstapp.Week1.day1;

public class Demo5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a); // 10
        System.out.println(b); // 20

        System.out.println(a++); // 10
        System.out.println(a); // 11
        System.out.println(++b);  // 21

        // a++
        a = a + 1;

        a += 5;
        // a = a + 5;
        System.out.println(a); //17
    }
}

