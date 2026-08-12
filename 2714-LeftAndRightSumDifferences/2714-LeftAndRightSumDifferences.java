// Last updated: 8/12/2026, 11:08:00 AM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
       int[] leftSum = new int[nums.length];
       leftSum[0] =0;
       for(int i=1;i<leftSum.length;i++){
        leftSum[i] = nums[i-1]+leftSum[i-1];
       }

       int[] rightSum = new int[nums.length];
       rightSum[nums.length-1] = 0;
       for(int j=nums.length-2; j>=0;j--){
        rightSum[j] = nums[j+1]+rightSum[j+1];
       }
       for(int i=0;i<nums.length;i++){
        ans[i] = Math.abs(leftSum[i]-rightSum[i]);
       }
        return ans;
    }
}