package com.nacerjava.firstapp.Week1.day1;

public class Demo7 {
    public static void main(String[] args) {
        int score = 80;
        if (score >= 90) {
            System.out.println("A grade");
        } else if (score < 90 && score >= 75)
            System.out.println("B grade");
        else if (score < 75 && score >= 50)
            System.out.println("C grade");
        else
            System.out.println("D grade");
    }
}
