package com.mukesh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        1. kayak
//        2. deed
        Scanner in = new Scanner(System.in);
        System.out.println(palindrome("deed"));
    }
    static boolean palindrome(String input) {
        if ((input == null) || (input.length() == 0)) {
            return true;
        }
        for (int i = 0; i <= input.length() / 2; i++) {
            char start = input.charAt(i);
            char end = input.charAt(input.length() - 1 - i);
            if (start == end) {
                return true;
            }
        }
        return false;
    }
}
