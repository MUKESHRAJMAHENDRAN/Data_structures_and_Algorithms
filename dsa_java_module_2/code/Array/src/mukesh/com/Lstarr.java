package mukesh.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Lstarr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

//   Giving input to the 1d array
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);

//        Getting the index
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.println(list.get(i));
            }
        }
    }
}
