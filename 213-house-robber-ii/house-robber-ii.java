class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int excludeLast = robHouse(nums, 0, nums.length - 2);
        int excludeFirst = robHouse(nums, 1, nums.length - 1);
        return Math.max(excludeLast, excludeFirst);
    }

    private int robHouse(int[] nums, int first, int last) {
        int length = last - first + 1;
        int[] dp = new int[length];
        dp[0] = nums[first];
        if (length > 1) {
            dp[1] = Math.max(nums[first], nums[first + 1]);
        }
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[first + i]);
        }
        return dp[length - 1];
    }
}