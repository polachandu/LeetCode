// Last updated: 8/12/2026, 11:12:04 AM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, maxLen = 0, zeros = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeros++;
            }
            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}