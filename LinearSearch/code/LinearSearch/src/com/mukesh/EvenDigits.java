package com.mukesh;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896, 87};
        System.out.println(digits(3452));
        System.out.println(countdigits(arr));
        System.out.println(digits_1(3424));
    }
    static int digits_1(int num){
        if(num<0){
            num = num * -1;
        }
        return (int) ((Math.log10(num))+1);
    }

    static int countdigits(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (digits_1(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int digits(int num){
        if(num<0) {
            num= num * -1;
        }
        if (num==0){
            num =1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num/=10;
        }
        return count;
    }
    }
