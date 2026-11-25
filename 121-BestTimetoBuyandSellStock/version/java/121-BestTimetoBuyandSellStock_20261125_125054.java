// Last updated: 11/25/2026, 12:50:54 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int min = Integer.MAX_VALUE;
4        int maxProfit = 0;
5        for (int i = 0; i < prices.length; i++) {
6            if (prices[i] < min) {
7                min = prices[i];
8            }
9            maxProfit = Math.max(maxProfit, prices[i] - min);
10        }
11        return maxProfit;
12    }
13}