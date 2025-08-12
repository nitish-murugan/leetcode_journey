class Solution {
    static final int MOD = 1000000007;
    public void fn(int i, int n, int x, List<Integer> lst, int tempSum, int[] result, int[][] dp){
        if(tempSum == n){
            result[0] = (result[0]+1)%MOD;
            return;
        }
        if(i<0) return;
        if (tempSum > n) return;

        if(dp[i][tempSum] != -1){
            result[0]=(result[0]+dp[i][tempSum])%MOD;
            return;
        }
        
        int before = result[0];
        int powerVal = (int)Math.pow(i,x);
        if(powerVal<=n && !lst.contains(i)){
            lst.add(i);
            fn(i-1,n,x,lst,tempSum+powerVal,result,dp);
            lst.remove(lst.size()-1);
        }
        fn(i-1,n,x,lst,tempSum,result,dp);
        dp[i][tempSum] = ((result[0] - before) % MOD + MOD) % MOD;
    }
    public int numberOfWays(int n, int x) {
        int[][] dp = new int[n+1][n+1];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
        int[] result = new int[1];
        fn(n,n,x,new ArrayList<>(),0,result,dp);
        return result[0];
    }
}