package ImportantProblems.ImpPrb_1;

public class RBSwithDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 4, 4, 5, 5, 1,};
        int ans = search(arr);
        System.out.println(ans);
    }
    static int search(int[] arr){
        int pivot = findDuplicatePivot(arr);
        return pivot;
    }
    static int findDuplicatePivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
       while (start <= end) {
        int mid = start + (end - start) / 2;
        if (mid < end && arr[mid] > arr [mid+1]) {
            return mid;
        }
        if (mid > start && arr[mid] < arr[mid -1]) {
            return mid -1;
        }
        // skip the duplicates
        if (arr[mid] == arr[end] && arr[mid]==arr[start]){
            // Skip the element
            if (start < end && arr[start] > arr[start +1]) {
                return start;
            }
            start++;
            if (end > start && arr[end] < arr[end-1]) {
                return end-1;
            }
            end--;
        }
        else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end] ){
            start = mid + 1;
        }
        else {
            end = mid - 1;
        }
       }
       return -1;
    }
    
}
