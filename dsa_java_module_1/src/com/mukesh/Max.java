package com.mukesh;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the three number : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max = a;
//        if (max < b){
//            max = b;
//        }
//        if (max < c){
//            max = c;
//        }
//        System.out.println("Maximum number is: " + max);

        int  max_num = Math.max(Math.max(a, b), c);
        System.out.println(" Maximum no is: " + max_num);
    }
}
