package mukesh.com;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimentionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//         Multidimentional aray input
        int[][] arr1 = new int[3][3];
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

//        printing a multiidmentional array
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

//        Enhanced for loop - Each row is an array
        for (int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
