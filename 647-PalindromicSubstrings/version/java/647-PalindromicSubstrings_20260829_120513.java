// Last updated: 8/29/2026, 12:05:13 PM
1class Solution {
2    public int rob(int[] nums) {
3        if (nums.length == 1)
4            return nums[0];
5        if (nums.length == 2) {
6            return Math.max(nums[0], nums[1]);
7        }
8        int includeLast = robHouse(nums, 1, nums.length - 1);
9        int includeFirst = robHouse(nums, 0, nums.length - 2);
10        return Math.max(includeLast, includeFirst);
11    }
12
13    private int robHouse(int[] nums, int start, int end) {
14        int[] dp = new int[end - start + 1];
15        dp[0] = nums[start];
16        dp[1] = Math.max(nums[start + 1], nums[start]);
17        for (int i = 2; i < dp.length; i++) {
18            dp[i] = Math.max(dp[i - 1], nums[start + i] + dp[i - 2]);
19        }
20        return dp[dp.length - 1];
21    }
22}