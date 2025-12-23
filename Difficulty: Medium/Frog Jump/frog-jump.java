class Solution {
    int fn(int i, int[] height, int[] dp){
        if(i == height.length-1){
            return 0;
        }
        
        if(dp[i] != -1) return dp[i];
        
        int first = Integer.MAX_VALUE;
        if(i+1 < height.length){
            first = Math.abs(height[i]-height[i+1]) + fn(i+1, height, dp);
        }
        
        int second = Integer.MAX_VALUE;
        if(i+2 < height.length){
            second = Math.abs(height[i]-height[i+2]) + fn(i+2, height, dp);
        }
        
        dp[i] = Math.min(first, second);         
        return dp[i];
    }
    int minCost(int[] height) {
        // code here
        int[] dp = new int[height.length+1];
        Arrays.fill(dp, -1);
        return fn(0, height, dp);
    }
}