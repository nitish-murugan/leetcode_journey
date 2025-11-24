// User function Template for Java

class Solution {
    public int fn(int index, int lastAct, int[][] arr, int[][] dp){
        if(index == 0){
            int max = 0;
            for(int i=0;i<3;i++){
                if(i!=lastAct){
                    max = Math.max(max,arr[index][i]);
                }
            }
            return max;
        }
        
        if(dp[index][lastAct] != -1) return dp[index][lastAct];
        
        int max = 0;
        for(int i=0;i<3;i++){
            if(i!=lastAct){
                int point = arr[index][i] + fn(index-1,i,arr,dp);
                max = Math.max(max,point);
            }
        }
        dp[index][lastAct] = max;
        return max;
    }
    public int maximumPoints(int arr[][]) {
        // code here
        int length = arr.length;
        int[][] dp = new int[length+1][4];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        
        return fn(arr.length-1,3,arr,dp);
    }
}