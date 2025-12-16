class Solution {
    static boolean fn(int i, int[] arr, int sum, boolean[] dp){
        if(sum==0) return true;
        if(i==arr.length) return false;
        
        if(dp[i]) return dp[i];
        
        boolean take = false;
        if(arr[i]<=sum){
            take = fn(i+1, arr, sum-arr[i], dp);
        }
        boolean notTake = fn(i+1,arr,sum,dp);
        dp[i] = take||notTake;
        return take||notTake;
    }
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        boolean[] dp = new boolean[arr.length+1];
        return fn(0,arr,sum,dp);
    }
}