package com.mukesh;

import java.util.Arrays;

import static java.lang.Math.min;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {4, 12, -4, 67, 8};
        int ans = min(arr);
        System.out.println(ans);
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
