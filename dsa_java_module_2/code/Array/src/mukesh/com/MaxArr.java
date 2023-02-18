package mukesh.com;

public class MaxArr{
    public static void main(String[] args){
        int[] arr = {5, 6 , 15, 25, 64, 8};
        int max= Integer.MIN_VALUE;
        for (int j : arr)
            if (j > max) {
                max = j;
            }
        System.out.println(max);
        }
    }
