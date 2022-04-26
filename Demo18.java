package com.nacerjava.firstapp.Week1.day1;

import java.util.Scanner;

public class Demo18 {
    public static void main(String[] args) {
        int j,n;
        System.out.println("Input the number(Table to be calculated):");{
            System.out.println("Input number of the table:");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            System.out.println("\n");
            for (j=0;j<=n;j++) {
                System.out.println(n+" X "+j+" = "+n*j);
            }
        }

    }
}
