package com.mukesh;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value
public class Math_operations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        System.out.print("Enter the operator (+,-, *, /): ");
        char o = in.next().charAt(0);
        if (o == '+'){
            int c = a + b;
            System.out.println("Addition of first amd second: " + c);
        }
        if (o == '-'){
            int c = a - b;
            System.out.println("Subraction of first and second: " + c);
        }
        if (o == '*'){
            int c = a * b;
            System.out.println("Multiplication of first and second: " + c);
        }
        if (o == '/'){
            int c = a / b;
            System.out.println("Division of first and second: " + c);
        }
        else {
            System.out.println("Enter the valid input");
        }
    }
}
