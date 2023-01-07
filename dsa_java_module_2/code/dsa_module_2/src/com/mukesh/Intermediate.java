package com.mukesh;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;


public class Intermediate {
//1. Factorial Program In Java
//2. Sum Of N Numbers
//3. Armstrong Number In Java
//4. --Find Ncr & Npr
//5. Reverse A String In Java
//6. Find if a number is palindrome or not
//7. --Future Investment Value
//8. --HCF Of Two Numbers Program
//9. --LCM Of Two Numbers
//10. Java Program Vowel Or Consonant
//11. Perfect Number In Java
//12. Check Leap Year Or Not
//13. Sum Of A Digits Of Number
    public static void main(String[] args) {
//        int ans = factorial();
//        System.out.print("Factorial of the number: " + ans);
//        int ans = average();
//        System.out.print("Average of numbers: " + ans);
//        int ans = sum_digits();
//        System.out.println(ans);
//        boolean ans = amstrong();
//        System.out.println(ans);

//        for (int i = 100; i < 999; i++) {
//            if(amlist(i)){
//                System.out.println(i);
//            }
//        }
        System.out.println(prime(71));

    }

    static boolean prime(int n) {
        int c = 2;
        if (n <=1){
            return false;
        }
        while((int)(Math.sqrt(n)) > c){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

    static boolean amlist(int n) {
        int sum = 0;
        int temp = n;
        while(n > 0){
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n /= 10;
        }
        return sum == temp;
    }

    static boolean amstrong() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int temp = num;
        int temp1 = num;
        int power = 0;
        int ams = 0;
        while (num > 0) {
            num /= 10;
            power++;
        }
        while(temp > 0){
            int rem = temp % 10;
            ams = (int) (ams + Math.pow(rem, power));
            temp /= 10;
        }
        if (temp1 == ams){
            return true;
        }
        return false;
    }


    static int sum_digits() {
        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n = in.nextInt();
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    static int average(){
        System.out.println("Press 0 to exit");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int count = 0;
        int sum = 0;
        while(true){
            int n = in.nextInt();
            if (n==0){
                return (sum/count);
            }
            else{
                sum = sum + n;
                count = count + 1;
            }
        }
    }
    static int factorial(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product = product * i;
        }
        return product;
    }
}
