package ImportantProblems;

public class Search {
    public static void main(String[] args) {
        int[] arr = {3, 12, 21, 34, 42, 56, 61, 75, 89, 95};
        int target = 12;
        int ans = noelsesearch(arr, target);
        System.out.println(ans);
    }
    static int noelsesearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                end = mid - 1; 
            }
            if(target > arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
}
