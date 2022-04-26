package com.nacerjava.firstapp.Week1.day1;

import java.util.Scanner;

public class Demo19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the value of rows: ");
        int num = sc.nextInt();

        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.println(j);
            }
            System.out.println("");
        }
    }
}
