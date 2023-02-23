public class MaxWealth {
    // https://leetcode.com/problems/richest-customer-wealth/
// Input: accounts = [[1,5],[7,3],[3,5]]
// Output: 10 - sum of Maximim in array 
    public static void main(String[] args){
        int[][] arr = {
            {1, 5},
            {7, 3},
            {3, 5}
        };
        System.out.println(max(arr));
    
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int row_sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                row_sum += arr[i][j];
            }
            if (row_sum>max){
                max = row_sum;
            }
        }
        return max;
    }
    
}
