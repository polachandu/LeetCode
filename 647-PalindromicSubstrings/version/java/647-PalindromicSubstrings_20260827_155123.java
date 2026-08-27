// Last updated: 8/27/2026, 3:51:23 PM
1class Solution {
2    public int change(int amount, int[] coins) {
3        int[] dp = new int[amount + 1];
4        dp[0] = 1;
5
6        for (int coin : coins) {
7            for (int i = coin; i <= amount; i++) {
8                dp[i] += dp[i - coin];
9            }
10        }
11        return dp[amount];
12    }
13}