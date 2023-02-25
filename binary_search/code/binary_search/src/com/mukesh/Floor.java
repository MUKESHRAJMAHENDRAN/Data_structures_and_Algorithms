package ImportantProblems;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {3, 12, 21, 34, 42, 56, 61, 75, 89, 95};
        int target = 2;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return end; // if you want to find the number arr[end]
    }
    
}
