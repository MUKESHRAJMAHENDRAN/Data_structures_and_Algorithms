package com.mukesh;

import java.util.Scanner;

public class Intermediate1 {
    public static void main(String[] args) {
//        String ans = reverse();
//        System.out.println(ans);
//        numreverse();
//        hcf();
//        System.out.println(vowelornot('a'));
//        System.out.println(perfectnumber(38));
//        for (int i = 0; i < 1000; i++) {
//            if (perfectnumber(i)){
//                int ans = i;
//                System.out.print(ans+ " ");
//            }

//        }
//        Kunal is allowed to go out with his friends only on
//        the even days of a given month.
//        Write a program to count the number of days he can
//        go out in the month of August.
//        countevenmonth();
//        Write a program to print the sum of negative numbers,
//        sum of positive even numbers and the
//        sum of positive odd numbers
//        from a list of numbers (N) entered by the user.
//        The list terminates when the user enters a zero.
        listsum();
    }

    static void listsum() {
        System.out.println("Enter zero to exit: ");
        Scanner in = new Scanner(System.in);
        int neg = 0;
        int evenint = 0;
        int oddint = 0;
        while(true){
            System.out.println("Enter the input: ");
            int num = in.nextInt();
            if (num < 0){
                neg = neg + num;
            }
            if (num > 0){
                if (num % 2 ==0){
                    evenint = evenint + num;
                }else{
                    oddint = oddint + num;
                }
            }
            if(num == 0){
                System.out.println("Negstive Sum: "+ neg);
                System.out.println("Postive even int Sum: "+ evenint);
                System.out.println("postive odd int Sum: "+ oddint);
                break;
            }
        }
    }

    static void countevenmonth() {
        Scanner in = new Scanner(System.in);
        System.out.println("Which month: ");
        int month = in.nextInt();
        int day = 0;
        switch (month) {
            case 1 -> {
                System.out.println("January");
                day = 31;
            }
            case 2 -> {
                System.out.println("Feb");
                day = 28;
            }
            case 3 -> {
                System.out.println("March");
                day = 31;
            }
            case 4 -> {
                System.out.println("April");
                day = 30;
            }
            case 5 -> {
                System.out.println("May");
                day = 31;
            }
            case 6 -> {
                System.out.println("June");
                day = 30;
            }
            case 7 -> {
                System.out.println("July");
                day = 31;
            }
            case 8 -> {
                System.out.println("August");
                day = 31;
            }
            case 9 -> {
                System.out.println("September");
                day = 30;
            }
            case 10 -> {
                System.out.println("oct");
                day = 31;
            }
            case 11 -> {
                System.out.println("Nov");
                day = 30;
            }
            case 12 -> {
                System.out.println("December");
                day = 31;
            }
        }
        int count = 0;
        for (int i = 0; i < day; i++) {
            if(i % 2 == 0){
                count ++;
            }
        }
        System.out.println(count);
    }

    static boolean perfectnumber(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0){
                sum = sum + i ;
            }
        }
        return a == sum;
    }

    static String vowelornot(char a) {
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o'|| a == 'u'){
           return "Vowel";
        }
        return "Consonant";
    }

    static void hcf() {
        int num1 = 50;
        int num2 = 75;
        int temp1 = num1, temp2 = num2;
        while(num2!=0){
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        int hcf = num1;
        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + (temp1 * temp2)/hcf);
    }

    static void numreverse() {
        int num = 1234;
        int ans = 0;
        while(num > 0){
            int rm = num % 10;
            ans = (ans *10) + rm;
            num/=10;
        }
        System.out.println(ans);
    }

    static String reverse() {
        String name, name1;
        name = "Mukesh"; name1 = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            name1 = ch+name1;
        }
        return name1;
    }
}
