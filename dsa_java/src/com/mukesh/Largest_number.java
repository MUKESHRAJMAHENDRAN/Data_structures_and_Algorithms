package com.mukesh;

import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class Largest_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b){
            System.out.println(a + " is the largest");
        }
        else{
            System.out.println(b + " is the largest");
        }

    }
}
