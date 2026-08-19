// Last updated: 8/19/2026, 11:27:51 AM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int maxSum = Integer.MIN_VALUE, currentSum = 0;
4        for (int i = 0; i < nums.length; i++) {
5            currentSum = Math.max(nums[i], currentSum + nums[i]);
6            maxSum = Math.max(maxSum, currentSum);
7        }
8        return maxSum;
9    }
10}