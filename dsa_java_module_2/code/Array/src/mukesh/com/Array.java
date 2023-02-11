package mukesh.com;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));



        String[] b = {"Mukesh", "lokesh"};
        System.out.println(Arrays.toString(b));

    }
}
