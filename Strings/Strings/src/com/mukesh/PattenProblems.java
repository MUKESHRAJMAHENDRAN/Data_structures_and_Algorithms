package com.mukesh;

public class PattenProblems {
    public static void main(String[] args) {
//        pattern(5);
//        pattern1(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern6(5);
//        pattern7(5);
    }

    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n-i) {
                    System.out.print(' ');
                }
                else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }


    static void pattern5(int n) {
        for (int i = 0; i < (2*n-1); i++) {
            int totalCol = i > n ? 2*n-i : i;
            for (int j = 0; j < totalCol ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern(int n){
//        Right angle triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
