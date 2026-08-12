// Last updated: 8/12/2026, 11:16:51 AM
class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length) k = k%nums.length;
        if(k==0) return; 
        int[] results = new int[nums.length];
        for (int i = 0; i < nums.length - k; i++) {
            results[i + k] = nums[i];
        }
        for (int i = nums.length - k; i < nums.length; i++) {
            results[i - (nums.length - k)] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = results[i];
        }
    }
}