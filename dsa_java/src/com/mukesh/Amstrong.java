package com.mukesh;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int temp = n;
        int input = n;
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count += 1;
        }
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            int ans = (int)(Math.pow(rem , count));
            temp = temp / 10;
            sum = sum + ans;
        }
        if (sum == input) {
            System.out.println("Its an amstrong number");
        }else{
            System.out.println("Given number is not an amstrong number");
        }
    }
}
