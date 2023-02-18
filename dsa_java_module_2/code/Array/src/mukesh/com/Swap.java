package mukesh.com;

import java.util.Arrays;

import static java.lang.Long.reverse;

public class Swap{
    public static void main(String[] args){
        int[] arr = {12, 234, 88, 78, 53, 4};
        System.out.println(Arrays.toString(arr));
//        swap(arr, 1, 5);
//        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start_index = 0;
        int end_index = arr.length-1;

        while(start_index < end_index){
            swap(arr, start_index, end_index);
            start_index++;
            end_index--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] =arr[index2];
        arr[index2] =temp;
    }
}

