// User function Template for Java

class Solution {
    int fn(int index, int[] arr, int[] dp){
        if(index==0) return arr[index];
        if(index<0) return 0;
        if(dp[index]!=-1) return dp[index];
        int pick = arr[index]+fn(index-2,arr,dp);
        int notPick = 0+fn(index-1,arr,dp);
        dp[index] = Math.max(pick,notPick);
        return dp[index];
    }
    int findMaxSum(int arr[]) {
        // code here
        int length = arr.length;
        int[] dp = new int[length+1];
        Arrays.fill(dp,-1);
        return fn(length-1,arr,dp);
    }
}