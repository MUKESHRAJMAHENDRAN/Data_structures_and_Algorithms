package mukesh.com;

import java.util.ArrayList;
import java.util.Scanner;

public class DimentionalList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

//        Array initialization
        for (int row = 0; row < 3; row++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }

}
