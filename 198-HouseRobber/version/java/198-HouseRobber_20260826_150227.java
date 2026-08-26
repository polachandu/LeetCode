// Last updated: 8/26/2026, 3:02:27 PM
1class Solution {
2    public int rob(int[] nums) {
3        if (nums.length == 1) {
4            return nums[0];
5        }
6        int[] dp = new int[nums.length];
7        dp[0] = nums[0];
8        if (nums.length >= 2) {
9            dp[1] = Math.max(nums[0], nums[1]);
10        }
11        for (int i = 2; i < nums.length; i++) {
12            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
13        }
14        return dp[nums.length - 1];
15    }
16}