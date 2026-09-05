// Last updated: 9/5/2026, 12:29:02 PM
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1]*nums[nums.length-2] - nums[0]*nums[1];
    }
}