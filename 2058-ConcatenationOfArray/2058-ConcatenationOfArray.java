// Last updated: 8/12/2026, 11:08:38 AM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int resLen = nums.length*2;
        int[] res = new int[resLen];
        for(int i=0;i<nums.length;i++){
            res[i] = nums[i];
            res[i+nums.length] = nums[i];
        }
        return res;
    }
}