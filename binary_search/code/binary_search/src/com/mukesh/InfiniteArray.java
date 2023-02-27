package ImportantProblems.ImpPrb_1;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 12, 21, 34, 42, 56, 61, 75, 89, 95};
        int target = 42;
        int ans_ = answer(arr, target);
        System.out.println(ans_);
        
    }
    static int answer(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(arr[end] < target){
            int newstart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newstart;
        }
        return search(arr, target, start, end);
    }
    static int search(int[]arr , int target, int start, int end){
        while(start <=target){
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid -1;
            } else if(target > arr[mid]){
                start = mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    
}
