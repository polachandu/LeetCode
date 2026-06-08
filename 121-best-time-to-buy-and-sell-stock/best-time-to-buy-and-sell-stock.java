class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, maxPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < maxPrice) {
                maxPrice = prices[i];
            }
            maxProfit = Math.max(maxProfit, Math.abs(maxPrice - prices[i]));
        }
        return maxProfit;
    }
}