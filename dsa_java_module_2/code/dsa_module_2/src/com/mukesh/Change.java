package com.mukesh;

import java.util.Arrays;

public class Change {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        change_1(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change_1(int[] arr) {
        arr[0] = 99;
    }
}
