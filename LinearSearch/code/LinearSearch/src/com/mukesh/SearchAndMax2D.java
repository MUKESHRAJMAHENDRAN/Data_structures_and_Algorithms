package com.mukesh;


import java.util.Arrays;

public class SearchAndMax2D {
    public static void main(String[] args) {
        int[][] arr = {
                {41, 2, 6},
                {4, 7, 64},
                {24, 8, 1},
                {52, 4},
                {14, 29, -13, 84}
        };
        int target = 29;
//        Search in 2D array
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        int ans1 = max(arr);
        System.out.println(ans1);
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row ,col};
                }
            }
        }
        return new int[] {-1, -1};
    }

//    Max in 2D array
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
