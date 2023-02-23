import java.util.Arrays;

public class Basic{
    public static void main(String[] args){
        String name = "Mukesh";
        char target = 'e';
        char[] arr = name.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(search(arr, target));
    }

    static boolean search(char[] arr, char target) {
        for (int i = 0; i < arr.length; i++) {
            if(target==arr[i]){
                return true;
            }
        }
        return false;
}
}