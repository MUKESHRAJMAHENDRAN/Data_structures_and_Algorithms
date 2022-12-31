package com.mukesh;

import java.util.Scanner;
// Input currency in rupees and output in USD.

public class Dollar_rupee {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Indian currency: ");
        float a = in.nextFloat();
        float b = (float) (a * 82.76);
        System.out.println(b + "$");
    }
}
