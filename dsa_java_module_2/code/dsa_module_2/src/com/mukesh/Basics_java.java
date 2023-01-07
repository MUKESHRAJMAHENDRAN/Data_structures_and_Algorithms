package com.mukesh;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Basics_java {
    //    1. Fibonacci Series In Java Programs
//    2. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
//    3. Input a number and print all the factors of that number (use loops).
//    4. Take integer inputs till the user enters 0 and print the sum of all numbers
//            (HINT: while loop)
//    5. Take integer inputs till the user enters 0 and print the largest number from
//    all.
    public static void main(String[] args) {
//        int num = fibonocci();
//        System.out.println(num);
//        leetcode();
//        factors();
//        int sum = sum();
//        System.out.println("Sum pf the number: " + sum);
        int largest = largest();
        System.out.print("Largest no is: " + largest);

    }
    static int largest(){
        System.out.println("Enter the 0 to exit: ");
        Scanner in = new Scanner(System.in);
        int largest = 0;
        while(true){
            System.out.print("Enter the number: ");
            int n = in.nextInt();
            if (n == 0){
                return largest;
            }
            if (largest < n){
                largest = n;
            }
        }
    }
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 0 to exit: ");
        int sum = 0;
        while(true){
            System.out.print("Enter the number: ");
            int n = in.nextInt();
            if (n == 0){
                return sum;
            }
            else{
                sum = sum + n;
            }
        }
    }

    static void factors(){
//        Input a number and print all the factors of that number (use loops)
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
        }
//
    }

    static void leetcode() {
//        Input: n = 234
//        Output: 15
//        Explanation:
//        Product of digits = 2 * 3 * 4 = 24
//        Sum of digits = 2 + 3 + 4 = 9
//        Result = 24 - 9 = 15
        int n = 234;
        int prod = 1;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            prod = prod * rem;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println(prod);
        System.out.println(sum);
        int ans = prod - sum;
        System.out.println(ans);
    }


    static int fibonocci() {
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
        int a = 0; int b = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = in.nextInt();
        System.out.println("Enter the series number");
        int num = in.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
            if (i == num){
                return i;
            }
        }
        return a;
    }
}
