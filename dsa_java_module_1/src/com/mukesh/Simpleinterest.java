package com.mukesh;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and
//        find Simple Interest.
public class Simpleinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        int principle = in.nextInt();
        System.out.print("Enter the time: ");
        int time = in.nextInt();
        System.out.print("Enter the interest rate: ");
        int rate = in.nextInt();
        float simple_interest = (principle * time * rate)/100;
        System.out.println("Simple_interest: " + simple_interest);
    }
}
