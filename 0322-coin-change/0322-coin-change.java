class Solution {
    public int fn(int i, int[] coins, int amount, int[][] dp) {
        if (amount == 0) return 0;
        if (i < 0 || amount < 0) return Integer.MAX_VALUE / 2; // avoid overflow

        if (dp[i][amount] != -1) return dp[i][amount];

        int take = Integer.MAX_VALUE / 2;
        if (coins[i] <= amount) {
            take = 1 + fn(i, coins, amount - coins[i], dp);
        }
        int skip = fn(i - 1, coins, amount, dp);

        return dp[i][amount] = Math.min(take, skip);
    }

    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[][] dp = new int[coins.length][amount + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        int ans = fn(coins.length - 1, coins, amount, dp);
        return ans >= Integer.MAX_VALUE / 2 ? -1 : ans;
    }
}
