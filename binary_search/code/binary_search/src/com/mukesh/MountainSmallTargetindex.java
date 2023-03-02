package ImportantProblems.ImpPrb_1;


public class MountainSmallTargetindex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1, -3};
        int target = -3;
        int peak = maximum(arr);
        int ans = agnosticBinarysearch(arr, target, 0, peak);
        if (ans != -1) {
            int asc = ans;
            System.out.println(asc);
        }else {
            int des = agnosticBinarysearch(arr, target, peak+1, arr.length-1);
            System.out.println(des);
        }
        
    }
    static int maximum(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int agnosticBinarysearch (int[] arr, int target, int start, int end) {
        
        boolean IsAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if (IsAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
