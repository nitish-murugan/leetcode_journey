// User function Template for Java
class Solution {
    int fn(int i, int[] height, int[] dp){
        if(i==0) return 0;
        if(dp[i]!=-1) return dp[i];
        int leftOne = fn(i-1,height,dp)+ Math.abs(height[i]-height[i-1]);
        int leftTwo = Integer.MAX_VALUE;
        if(i>1) leftTwo = fn(i-2,height,dp)+ Math.abs(height[i]-height[i-2]);
        dp[i] = Math.min(leftOne,leftTwo);
        return dp[i];
    }
    int minCost(int[] height) {
        // code here
        int[] dp = new int[height.length+1];
        Arrays.fill(dp,-1);
        return fn(height.length-1,height,dp);
    }
}