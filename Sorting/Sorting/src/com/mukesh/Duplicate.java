package com.mukesh;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        int ans = sort(arr);
        System.out.println(ans);
    }
    static int sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        int c = 0;
        for (int j = 0; j < arr.length; j++) {

            if (arr[j] != c + 1){
                return arr[j];
            } else {
                c++;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
