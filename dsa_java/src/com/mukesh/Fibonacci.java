package com.mukesh;

//To calculate Fibonacci Series up to n numbers.

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int sum = 1;
        while (sum <= n){
            a = b;
            b = sum;
            sum = a + b;
            System.out.print(sum + " ");
        }
        System.out.println("nth number: "+ sum);
    }
}
