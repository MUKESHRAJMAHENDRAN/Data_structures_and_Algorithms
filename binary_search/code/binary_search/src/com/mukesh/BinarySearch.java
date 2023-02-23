package com.mukesh;

import java.util.Arrays;

// Sorted array
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-42, -8, 1 , 12, 14, 36, 48, 93, 654};
        int target = 1;
//        Answer should be in 5 th index
        System.out.println(Arrays.toString(arr));
        int ans = max(arr, target);
        System.out.println(ans);
    }
    static int max(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (target==arr[mid]){
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else{
                end = mid -1;
            }

        }
        return -1;
    }
}
