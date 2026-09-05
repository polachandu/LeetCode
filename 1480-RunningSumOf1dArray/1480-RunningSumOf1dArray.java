// Last updated: 9/5/2026, 12:30:32 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            res[i] = sum;
        }
        return res;
    }
}