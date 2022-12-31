package com.mukesh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial_for_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
    }
}
