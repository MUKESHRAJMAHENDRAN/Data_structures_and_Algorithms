package Sorting;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 1, 2};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void sorting(int[]arr){
        for (int i=0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int max = maxElementIndex(arr, 0, last);
            swap(arr, max, last);
        }
    }
    static void swap(int[]arr, int max, int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
    static int maxElementIndex(int[] arr, int start, int end){
        int max_element = start;
        for (int i = start; i <= end; i++){
            if (arr[max_element] < arr[i]){
                max_element = i;
            }
        }
        return max_element;
    }
}
