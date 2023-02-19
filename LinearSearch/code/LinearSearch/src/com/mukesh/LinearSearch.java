package com.mukesh;

import java.util.Arrays;

public class LinearSearch {
//    Search in an array and return the index of an element
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 121, 65, 23};
        int ans = linear(arr, 1218);
        System.out.println(ans);
    }
    static int linear(int[] arr, int target){
        for(int index=0; index<arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;

    }
}
