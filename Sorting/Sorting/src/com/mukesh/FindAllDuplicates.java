package com.mukesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr= {4, 3, 2, 7, 8, 2, 3, 1};
//        [1, 2, 3, 4, 3, 2, 7, 8]
//        sort(arr);
//        System.out.println(Arrays.toString(arr));
        List<Integer> duplicates = sort(arr);
        System.out.println(duplicates);

    }
    static List<Integer> sort(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++){
             if (arr[j] != j+1){
                list.add(arr[j]);
            }
        }
        return list;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
