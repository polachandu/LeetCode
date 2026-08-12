// Last updated: 8/12/2026, 11:17:12 AM
class Solution {
    public int maxProduct(int[] nums) {
        int minSoFar = nums[0];
        int maxSoFar = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = maxSoFar;
            maxSoFar = Math.max(nums[i], Math.max(maxSoFar * nums[i], minSoFar * nums[i]));
            minSoFar = Math.min(nums[i], Math.min(temp * nums[i], minSoFar * nums[i]));
            result = Math.max(result, maxSoFar);
        }
        return result;
    }
}