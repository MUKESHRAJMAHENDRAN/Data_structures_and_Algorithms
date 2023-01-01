package com.mukesh;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sum of n numbers: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
           sum += i;
        }
        System.out.println("Sum of 0 to " + n + " is " + sum);
    }
}
