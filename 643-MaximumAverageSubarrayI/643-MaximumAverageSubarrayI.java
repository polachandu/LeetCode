// Last updated: 8/12/2026, 11:13:51 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum/ k;
    }
}