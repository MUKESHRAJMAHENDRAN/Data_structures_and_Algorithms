package com.mukesh;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {3, 5, 6, 12, 67, 89};
        int ans = search(arr, 67, 0, arr.length-1);
        System.out.println(ans);
    }
    static int search(int[] arr,int target, int start, int end){
        int mid = start + (end- start)/2;
        if (start > end){
            return -1;
        }
        if (arr[mid] == target){
            return mid;
        } else if (arr[mid] > target) {
            return search(arr, target, start, mid-1);
        }
        return search(arr, target, mid+1, end);
    }
}
