package com.mukesh;

import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = in.nextLine();
        System.out.println("Have a nice day " + name);
    }
}
