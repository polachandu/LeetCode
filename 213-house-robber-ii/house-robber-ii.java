class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int excludeFirst = robLinear(nums, 1, nums.length - 1);
        int excludeLast = robLinear(nums, 0, nums.length - 2);
        return Math.max(excludeFirst, excludeLast);
    }

    private int robLinear(int[] nums, int first, int last) {
        int[] dp = new int[last - first + 1];
        dp[0] = nums[first];
        if(dp.length == 1) return dp[0];
        dp[1] = Math.max(nums[first], nums[first + 1]);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[first + i] + dp[i - 2]);
        }
        return dp[dp.length - 1];
    }
}