package com.mukesh;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {4, 5, 66, 12, 32, 423};
        int start = 1; int end = 4; int target = 12;
        System.out.println(Search(arr, start, end, target));
    }

    static int Search(int[] arr, int start, int end, int target) {
        for (int row = start; row <= end ; row++) {
            if (target == arr[row]){
                return row;
            }
        }
        return -1;
    }
}
