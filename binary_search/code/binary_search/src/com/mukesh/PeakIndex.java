package ImportantProblems.ImpPrb_1;

// Peak index in mountain array (maximum num in array)
// eg : Input: arr = [0,10,5,2]
// Output: 1
public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 10, 5, 2};
        int ans = maximum(arr);
        System.out.println(ans);
    }
    static int maximum(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]) {
                // middle element in descending order
                end = mid;
            }else {
                // Its in ascending order
                start = mid + 1;
            }
        }
        return start;
    }
}
