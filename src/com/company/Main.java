package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner keyboard = new Scanner(System.in);
        int num;
        System.out.println("enter number");
         num = keyboard.nextInt();


        for (int x = num; x >= 1; x--) {
            System.out.println(x);


        }
    }
}

